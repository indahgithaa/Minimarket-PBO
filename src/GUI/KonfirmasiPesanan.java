/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;

import Classes.Konsumen;
import Classes.Abstract.Product;

/**
 *
 * @author MT
 */
public class KonfirmasiPesanan extends javax.swing.JFrame {
    final double[] totalBelanja = {0};
    final double biayaOngkir = 7000;
    final double biayaLayanan = 3000;
    protected static Konsumen konsumen = null;
    protected static Map<Product, Integer> keranjangGuest = new HashMap<>();
    public double totalKeseluruhan = 0;
    public static int idCounter = 0;

    /**
     * Creates new form KonfirmasiPesanan
     */
    public KonfirmasiPesanan(Konsumen konsumen, Map<Product, Integer> keranjangGuest) {
        this.konsumen = konsumen;
        this.keranjangGuest = keranjangGuest;
        initComponents(konsumen);
        generateBills();
    }

    private void generateBills() {
        jPanel1.removeAll(); // Clear previous bills Set layout for bills
        jPanel1.setLayout(new GridLayout(0, 3));
        jPanel1.setBorder(new EmptyBorder(0, 10, 0, 0));
        JLabel labelBarang = new JLabel("<html><b>Nama Barang</b></html>");
       // labelBarang.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel qtyBarang = new JLabel("<html><b>Qty</b></html>");
        qtyBarang.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel hargaTotal = new JLabel("<html><b>Harga Total</b></html>");
        hargaTotal.setHorizontalAlignment(SwingConstants.CENTER);
        
        jPanel1.add(labelBarang);
        jPanel1.add(qtyBarang);
        jPanel1.add(hargaTotal);
        
        jPanel1.add(Box.createVerticalStrut(10));
        jPanel1.add(Box.createVerticalStrut(10));
        jPanel1.add(Box.createVerticalStrut(10));

        if (konsumen != null) {
            //jangan muncul kalau qty/value 0
            for (Map.Entry<Product, Integer> entry : konsumen.getBarangDibeli().entrySet()) {
                if (entry.getValue() != 0) {
                    JLabel namaBrg = new JLabel(entry.getKey().getName());
                    jPanel1.add(namaBrg);
                    JLabel qtyBrg = new JLabel(String.valueOf(entry.getValue()));
                    jPanel1.add(qtyBrg);
                    JLabel hargaBrg = new JLabel(String.valueOf(entry.getKey().getPrice() * entry.getValue()));
                    jPanel1.add(hargaBrg);

                    qtyBrg.setHorizontalAlignment(SwingConstants.CENTER);
                    hargaBrg.setHorizontalAlignment(SwingConstants.CENTER);
                }
            }
        } else {
            for (Map.Entry<Product, Integer> entry : keranjangGuest.entrySet()) {
                if (entry.getValue() != 0) {
                    JLabel namaBrg = new JLabel(entry.getKey().getName());
                    jPanel1.add(namaBrg);
                    JLabel qtyBrg = new JLabel(String.valueOf(entry.getValue()));
                    jPanel1.add(qtyBrg);
                    JLabel hargaBrg = new JLabel(String.valueOf(entry.getKey().getPrice() * entry.getValue()));
                    jPanel1.add(hargaBrg);

                    qtyBrg.setHorizontalAlignment(SwingConstants.CENTER);
                    hargaBrg.setHorizontalAlignment(SwingConstants.CENTER);
                }
            }
        }

        jPanel1.revalidate(); // Refresh panel to reflect changes
        jPanel1.repaint();
    }

    private void updateTotalKeseluruhan() {
        if (jCheckBox1.isSelected()) {
            totalKeseluruhan = totalBelanja() + biayaOngkir + biayaLayanan;
        } else {
            totalKeseluruhan = totalBelanja() + biayaLayanan;
        }
        jLabel8.setText("Rp" + totalKeseluruhan);
    }

    private void writeToFile() {
        String namaFile = "riwayatPelanggan.txt";
        FileWriter fileWriter;
        LocalDate today = LocalDate.now();

        try {
            fileWriter = new FileWriter(namaFile, true);
            if (konsumen != null) {
                fileWriter.write(generateId() + "," + today + "," + konsumen.getNama() + "," + totalKeseluruhan + "\n");
            } else {
                fileWriter.write(generateId() + "," + today + "," + "Guest" + "," + totalKeseluruhan + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   public String generateId() {
        String id = "";
        String file1 = "riwayatPelanggan.txt";
        String duaHurufPertama = konsumen != null ? konsumen.getNama().substring(0, 2).toUpperCase() : "GU";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
            long count = bufferedReader.lines().count();
            idCounter = (int) count + 1;
            id = duaHurufPertama + String.format("%04d", idCounter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(Konsumen konsumen) {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(298, 263));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jLabel1.setText("Konfirmasi Pesanan");

        jCheckBox1.setText("Delivery (Ongkir: Rp7000)");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Self Pick-up");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("Cash");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Saldo Member");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Metode Pengambilan/Pengantaran");

        jLabel3.setText("Nama: User");

        jLabel4.setText("Saldo: -");

        jLabel5.setText("Total Belanja: " + totalBelanja());

        jLabel6.setText("Biaya Ongkir: Rp0");

        jLabel7.setText("Biaya Layanan: Rp3000");

        if (jCheckBox1.isSelected()) {
            totalKeseluruhan = totalBelanja() + biayaOngkir + biayaLayanan;
            jLabel8.setText("Rp"+totalKeseluruhan);
        } else {
            totalKeseluruhan = totalBelanja() + biayaLayanan;
            jLabel8.setText("Rp"+totalKeseluruhan);
        }

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel10.setText("Bayar Dengan:");

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox1)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jLabel6.setText("Biaya Ongkir: Rp" + 7000);
            jCheckBox2.setSelected(false);
        } else {
            jLabel6.setText("Biaya Ongkir: Rp" + 0);
            jCheckBox1.setSelected(false);
        }

        updateTotalKeseluruhan();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            jLabel6.setText("Biaya Ongkir: Rp" + 0);
            jCheckBox1.setSelected(false);
        } else {
            jLabel6.setText("Biaya Ongkir: Rp" + 7000);
            jCheckBox2.setSelected(false);
        }

        updateTotalKeseluruhan();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //show dialog message
        writeToFile();
        konsumen.payWithCash();
        JOptionPane.showMessageDialog(this, "Pembayaran dengan tunai berhasil! \nTerima kasih telah berbelanja di Seven Eleven!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //show dialog message
        writeToFile();
        if (konsumen != null) {
            if (totalKeseluruhan <= konsumen.getSaldoMember()) {
                konsumen.setSaldoMember(konsumen.payWithMemberCard(totalKeseluruhan));
                JOptionPane.showMessageDialog(this, "Pembayaran dengan saldo member berhasil!\n" + "Sisa saldo: " + (konsumen.getSaldoMember()) + "\nTerima kasih telah berbelanja di Seven Eleven!");
            } else {
                JOptionPane.showMessageDialog(this, "Saldo member tidak mencukupi");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tidak dapat melakukan pembayaran dengan saldo member");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private double totalBelanja() {
        totalBelanja[0] = 0;
        if (konsumen != null) {
            // Hitung harga produk hashmap dikali qty
            konsumen.getBarangDibeli().forEach((k, v) -> {
                totalBelanja[0] += k.getPrice() * v;
                System.out.println(k.getName() + " " + v);
            });
        } else {
            keranjangGuest.forEach((k, v) -> {
                totalBelanja[0] += k.getPrice() * v;
                System.out.println(k.getName() + " " + v);
            });
        }
        return totalBelanja[0]; 
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonfirmasiPesanan(konsumen, keranjangGuest).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}