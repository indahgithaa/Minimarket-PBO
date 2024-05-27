package Classes;

import java.util.List;

import Classes.Abstract.Karyawan;
import Classes.Abstract.Product;
import Interfaces.KelolaBarang;

public class OfficeBoy extends Karyawan implements KelolaBarang {
    public OfficeBoy(String nama, String id, String password, String idPekerja, String posisi, int lamaKerja, double gaji) {
        super(nama, id, password, idPekerja, posisi, lamaKerja, gaji);
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
}
