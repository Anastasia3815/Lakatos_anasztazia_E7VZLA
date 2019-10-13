package Hetedik;

/**
 *
 * @author Anastasia
 */
public class Ora {
    public int id;
    public String nev;
    public int kezdet;
    
    public Ora(int id, String nev, int kezdet) {
        this.id = id;
        this.nev = nev;
        if(8 <= kezdet && kezdet <= 19) this.kezdet = kezdet;
        else if(kezdet < 8) this.kezdet = 8;
        else if(kezdet > 19) this.kezdet = 19;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "\nID = " + this.id + ", Név = " + this.nev + ", Óra kezdés = " + this.kezdet;
    }
}
