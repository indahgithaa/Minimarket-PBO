package Classes;

import Classes.Abstract.Karyawan;

public class Kasir extends Karyawan {

    public Kasir(String nama, String id, String password, String posisi, double gaji) {
        super(nama, id, password, posisi, gaji);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return this.nama + "," + this.id + "," + this.posisi + "," + this.gaji;
    }
    
}
