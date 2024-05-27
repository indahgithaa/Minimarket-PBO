package Interfaces;

import java.util.List;

import Classes.Abstract.Product;

public interface KelolaBarang {
    public void addDiskon(Product barang, int persen);
    public void removeDiskon(Product barang, int persen);
    public void addStock(Product barang, int stock);
    public void removeStock(Product barang, int stock);
}
