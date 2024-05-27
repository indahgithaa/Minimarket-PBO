package Classes.Abstract;

public abstract class Karyawan extends Orang {
    private String posisi;
    private int lamaKerja;
    private double gaji;
    private double totalGajiSesuaiLamaKerja;

    public Karyawan(String nama, String id, String password, String idPekerja, String posisi, int lamaKerja, double gaji) {
        super(nama, id, password);
        this.posisi = posisi;
        this.lamaKerja = lamaKerja;
        this.gaji = gaji;
        this.totalGajiSesuaiLamaKerja = gaji * lamaKerja;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getTotalGajiSesuaiLamaKerja() {
        return totalGajiSesuaiLamaKerja;
    }

    public void setTotalGajiSesuaiLamaKerja(double totalGajiSesuaiLamaKerja) {
        this.totalGajiSesuaiLamaKerja = totalGajiSesuaiLamaKerja;
    }

    public void hitungTotalGajiSesuaiLamaKerja() {
        this.totalGajiSesuaiLamaKerja = this.gaji * this.lamaKerja * 12;
    }
}
