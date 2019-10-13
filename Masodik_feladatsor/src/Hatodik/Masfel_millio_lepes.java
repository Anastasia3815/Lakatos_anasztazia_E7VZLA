package Hatodik;

/**
 *
 * @author Anastasia
 */

public class Masfel_millio_lepes {
    String nev;
    int kek;
    int egyeb;

    public Masfel_millio_lepes(String nev, int kek, int egyeb) {
        this.nev = nev;
        this.kek = kek;
        this.egyeb = egyeb;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKek() {
        return kek;
    }

    public void setKek(int kek) {
        this.kek = kek;
    }

    public int getEgyeb() {
        return egyeb;
    }

    public void setEgyeb(int egyeb) {
        this.egyeb = egyeb;
    }

    @Override
    public String toString() {
        return nev;
    }
}

