package Classes;

import java.util.ArrayList;
import java.util.Date;

import Classes.Abstract.Product;
import Classes.Enum.Size;

public class Minuman extends Product {
    public static ArrayList<Product> listMinuman = new ArrayList<Product>();

    public Minuman(String name, double price, Date expiryDate, String idBarang, int stock) {
        super(name, price, expiryDate, idBarang, stock);
    } 
}
    
