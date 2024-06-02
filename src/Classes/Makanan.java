package Classes;

import java.util.Date;

import Classes.Abstract.Product;
import Classes.Enum.Jenis;

public class Makanan extends Product {
    protected Jenis jenis;

    public Makanan(String name, double price, Date expiryDate, String idBarang, Jenis jenis, int stock) {
        super(name, price, expiryDate, idBarang, stock);
        this.jenis = jenis;
    }

    public Jenis getJenis() {
        return jenis;
    }
}
