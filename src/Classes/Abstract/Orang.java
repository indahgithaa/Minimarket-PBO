package Classes.Abstract;

import java.io.FileReader;

public abstract class Orang {
    protected String nama;
    protected String id;
    protected String password;
    static int idCounter = 0;

    public Orang(String nama, String id, String password) {
        this.nama = nama;
        this.id = id;
        this.password = password;

        generateId();
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void generateId() {
        String file2 = "pembeli.txt";

        String duaHurufPertama = nama.substring(0, 2).toUpperCase();

        try {
            FileReader fileReader2 = new FileReader(file2);
            if(fileReader2.read() == -1) {
                this.id = duaHurufPertama + "0001";
            } else {
                idCounter++;
                this.id = duaHurufPertama + String.format("%04d", idCounter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
