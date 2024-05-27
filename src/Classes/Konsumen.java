package Classes;

import Classes.Abstract.Orang;

public class Konsumen extends Orang {
    private double saldoMember;
    private boolean isMember;

    public Konsumen(String nama, String id, String password, double saldoMember, boolean isMember) {
        super(nama, id, password);
        this.saldoMember = saldoMember;
        this.isMember = isMember;
    }

    public double getSaldoMember() {
        return saldoMember;
    }

    public void setSaldoMember(double saldoMember) {
        this.saldoMember = saldoMember;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }
}
