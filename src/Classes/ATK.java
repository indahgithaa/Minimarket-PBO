package Classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

import Classes.Abstract.Product;

public class ATK extends Product{
    public static ArrayList<Product> listATK = new ArrayList<Product>();

    public ATK(String name, double price, Date expiryDate, String idBarang, int stock) {
        super(name, price, expiryDate, idBarang, stock);
    }
    
}
