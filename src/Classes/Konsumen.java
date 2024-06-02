package Classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Classes.Abstract.Orang;
import Classes.Abstract.Product;

public class Konsumen extends Orang {
    private double saldoMember;
    private boolean isMember;
    private ArrayList<Product> barangDibeli = new ArrayList<>();
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

    public void addToBarangDibeli(Product product) {
        barangDibeli.add(product);
    }
}
