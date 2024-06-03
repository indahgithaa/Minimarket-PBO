package Classes.Abstract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Karyawan extends Orang {
    protected String posisi;
    protected double gaji;
    static int idCounter = 0;

    public Karyawan(String nama, String id, String password, String posisi, double gaji) {
        super(nama, id, password);
        this.posisi = posisi;
        this.gaji = gaji;

        if (this.id == null || this.id.equals("")) {
            generateId();
        }
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void generateId() {
        String id = "";
        String file1 = "pekerja.txt";
        String duaHurufPertama = nama.substring(0, 2).toUpperCase();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
            long count = bufferedReader.lines().count();
            idCounter = (int) count + 1;
            id = duaHurufPertama + String.format("%04d", idCounter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.id = id;
    }
}
