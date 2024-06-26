/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.DefaultComboBoxModel;

import Classes.ATK;
import Classes.Minuman;

/**
 *
 * @author MT
 */
public class KelolaBarang extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public KelolaBarang() {
        initComponents();

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemNames();
            } 
        });
    }

    private void updateItemNames() {
        String selectedCategory = (String) jComboBox1.getSelectedItem();
        // Dynamically update item names based on the selected category
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        if (selectedCategory.equals("Minuman")) {
            // Add item names for category 1
            model.addElement("Aquq Botol 600ML");
            model.addElement("Buavita JMB 245");
            model.addElement("Cimory Original");
            model.addElement("Mizone Isotonic");
            model.addElement("Teh Kotak");
            // Add more items as needed
        } else if (selectedCategory.equals("Alat Tulis Kantor")) {
            // Add item names for category 2
            model.addElement("Pulpen JOYKO");
            model.addElement("Loose Leaf B5");
            model.addElement("Pensil 2B Faber Castell");
            model.addElement("Penghapus STDR");
            model.addElement("Joyko Tipe-X");
            // Add more items as needed
        }
        jComboBox2.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kelola Barang");

        jLabel2.setText("Kategori:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuman", "Alat Tulis Kantor", "Makanan", "Alat Rumah Tangga" }));

        jLabel3.setText("Nama Item:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Harga Baru (jika ada)");

        jLabel5.setText("Stok Saat Ini (jika berubah)");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Selesai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double hargaBaru = Double.parseDouble(jTextField1.getText());
        int stokBaru = (int) jSpinner1.getValue();

        if (jComboBox2.getSelectedItem().equals("Aquq Botol 600ML")) {
            // Update Aquq Botol 600ML price and stock
            if (hargaBaru != 0) {
                Minuman.listMinuman.get(0).setPrice(hargaBaru);
            }
            if (stokBaru != 0) {
                Minuman.listMinuman.get(0).setStock(stokBaru);
            }
        } else if (jComboBox2.getSelectedItem().equals("Buavita JMB 245")) {
            // Update Buavita JMB 245 price and stock
            if (hargaBaru != 0) {
                Minuman.listMinuman.get(1).setPrice(hargaBaru);
            }
            if (stokBaru != 0) {
                Minuman.listMinuman.get(1).setStock(stokBaru);
            }
        } else if (jComboBox2.getSelectedItem().equals("Cimory Original")) {
            // Update Cimory Original price and stock
            if (hargaBaru != 0) {
                Minuman.listMinuman.get(2).setPrice(hargaBaru);
            }
            if (stokBaru != 0) {
                Minuman.listMinuman.get(2).setStock(stokBaru);
            }
        } else if (jComboBox2.getSelectedItem().equals("Mizone Isotonic")) {
            // Update Mizone Isotonic price and stock
            if (hargaBaru != 0) {
                Minuman.listMinuman.get(3).setPrice(hargaBaru);
            }
            if (stokBaru != 0) {
                Minuman.listMinuman.get(3).setStock(stokBaru);
            }
        } else if (jComboBox2.getSelectedItem().equals("Teh Kotak")) {
            // Update Teh Kotak price and stock
            if (hargaBaru != 0) {
                Minuman.listMinuman.get(4).setPrice(hargaBaru);
            }
            if (stokBaru != 0) {
                Minuman.listMinuman.get(4).setStock(stokBaru);
            }
        } else if (jComboBox2.getSelectedItem().equals("Pulpen JOYKO")) {
            // Update Pulpen JOYKO price and stock
            if (hargaBaru != 0) {
                ATK.listATK.get(0).setPrice(hargaBaru);
            }
            if (stokBaru != 0) {
                ATK.listATK.get(0).setStock(stokBaru);
            }
        } else if (jComboBox2.getSelectedItem().equals("Loose Leaf B5")) {
            // Update Loose Leaf B5 price and stock
            if (hargaBaru != 0) {
                ATK.listATK.get(1).setPrice(hargaBaru);
            }
            if (stokBaru != 0) {
                ATK.listATK.get(1).setStock(stokBaru);
            }
        } else if (jComboBox2.getSelectedItem().equals("Pensil 2B Faber Castell")) {
            // Update Pensil 2B Faber Castell price and stock
            if (hargaBaru != 0) {
                ATK.listATK.get(2).setPrice(hargaBaru);
            }
            if (stokBaru != 0) {
                ATK.listATK.get(2).setStock(stokBaru);
            }
        } else if (jComboBox2.getSelectedItem().equals("Penghapus STDR")) {
            // Update Penghapus STDR price and stock
            if (hargaBaru != 0) {
                ATK.listATK.get(3).setPrice(hargaBaru);
            }
            if (stokBaru != 0) {
                ATK.listATK.get(3).setStock(stokBaru);
            }
        } else if (jComboBox2.getSelectedItem().equals("Joyko Tipe-X")) {
            // Update Joyko Tipe-X price and stock
            if (hargaBaru != 0) {
                ATK.listATK.get(4).setPrice(hargaBaru);
            }
            if (stokBaru != 0) {
                ATK.listATK.get(4).setStock(stokBaru);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new WelcomeAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Onboarding().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    

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
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
