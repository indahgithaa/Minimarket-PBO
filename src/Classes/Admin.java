package Classes;

import java.util.List;

import Classes.Abstract.Karyawan;
import Classes.Abstract.Product;
import Interfaces.KelolaBarang;

public class Admin extends Karyawan implements KelolaBarang {
    public Admin(String nama, String id, String password, String posisi, double gaji) {
        super(nama, id, password, posisi, gaji);
    }

    @Override
    public void addDiskon(Product barang, int persen) {
        double hargaBaru = barang.getPrice() - (barang.getPrice() * persen / 100);
        barang.setPrice(hargaBaru);
    }

    @Override
    public void removeDiskon(Product barang, int persen) {
        double hargaAwal = barang.getActualPrice();
        barang.setPrice(hargaAwal);
    }

    @Override
    public void addStock(Product barang, int stock) {
        int stockAwal = barang.getStock();
        barang.setStock(stockAwal + stock);
    }

    @Override
    public void removeStock(Product barang, int stock) {
        int stockAwal = barang.getStock();
        barang.setStock(stockAwal - stock);
    }

    @Override
    public String toString() {
        return this.nama + "," + this.id + "," + this.posisi + "," + this.gaji + "," + this.password;
    }
}
