package Classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Classes.Abstract.Orang;
import Classes.Abstract.Product;
import Interfaces.Transaksi;

public class Konsumen extends Orang implements Transaksi {
    private double saldoMember;
    private boolean isMember;
    private Map<Product, Integer> barangDibeli = new HashMap<>();
    public static ArrayList<Konsumen> listKonsumen = new ArrayList<>();

    public Konsumen(String nama, String id, String password, double saldoMember, boolean isMember) {
        super(nama, id, password);
        this.saldoMember = saldoMember;
        this.isMember = isMember;

        addToPembeliFile(this);
    }

    public double getSaldoMember() {
        return saldoMember;
    }

    public void setSaldoMember(double saldoMember) {
        this.saldoMember = saldoMember;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    public void topUpSaldo(double saldo) {
        this.saldoMember += saldo;
    }

    public void beliBarang(double harga) {
        this.saldoMember -= harga;
    }

    public void addToPembeliFile(Konsumen konsumen) {
        //menambahkan konsumen ke dalam file pembeli.txt
        String namaFile = "pembeli.txt";
        FileWriter fileWriter;

        try {
            fileWriter = new FileWriter(namaFile, true);
            fileWriter.write(konsumen.getNama() + "," + konsumen.getId() + "," + konsumen.getPassword() + "," + konsumen.getSaldoMember() + "," + konsumen.isMember() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addToBarangDibeli(Product product, int qty) {
        if (barangDibeli.containsKey(product)) {
            int currentQty = barangDibeli.get(product);
            barangDibeli.put(product, currentQty + qty);
        } else {
            barangDibeli.put(product, qty);
        }
    }

    public Map<Product, Integer> getBarangDibeli() {
        return barangDibeli;
    }

    @Override
    public void payWithCash() {
        System.out.println("Pembayaran dengan uang tunai berhasil!");
    }

    @Override
    public void payWithMemberCard() {
        System.out.println("Pembayaran dengan kartu member berhasil!");
        System.out.println("Saldo member anda sekarang: " + saldoMember);
        System.out.println("Terima kasih telah berbelanja di toko kami!");
    }

    @Override
    public void printBill() {
        for (Map.Entry<Product, Integer> entry : barangDibeli.entrySet()) {
            Product product = entry.getKey();
            int qty = entry.getValue();
            System.out.println(product.getName() + " x" + qty + " = " + product.getPrice() * qty);
        }
    }
}
