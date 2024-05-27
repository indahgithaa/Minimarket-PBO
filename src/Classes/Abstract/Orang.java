package Classes.Abstract;

public abstract class Orang {
    protected String nama;
    protected String id;
    protected String password;

    public Orang(String nama, String id, String password) {
        this.nama = nama;
        this.id = id;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }
}
