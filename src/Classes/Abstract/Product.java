package Classes.Abstract;

import java.util.Date;

public abstract class Product {
    protected String name;
    protected double price;
    protected Date expiryDate;
    protected String idBarang;
    protected int stock;
    protected double actualPrice;

    public Product(String name, double price, Date expiryDate, String idBarang, int stock) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.idBarang = idBarang;
        this.actualPrice = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setPrice(double hargaBaru) {
        this.price = hargaBaru;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public void printInfo() {
        System.out.println("Nama Barang: " + name);
        System.out.println("Harga: " + price);
        System.out.println("Tanggal Kadaluarsa: " + expiryDate);
        System.out.println("ID Barang: " + idBarang);
    }
}
