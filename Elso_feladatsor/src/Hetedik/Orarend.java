package Hetedik;

/**
 *
 * @author Anastasia
 */
public class Orarend {
    public String nap;
    public Ora[] oratomb;
    public int szamlalo;
    
    public Orarend(String nap) {
        this.nap = nap;
        this.szamlalo = 0;
        this.oratomb = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getOratomb() {
        return oratomb;
    }

    public void setOratomb(Ora[] oratomb) {
        this.oratomb = oratomb;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }
    
    public boolean oratHozzaad(Ora ora) {                
        if(this.szamlalo >= 12) {
            System.out.println("Nem lehet több órát hozzáadni!");
            return false;
        }
        else {
            for (int i = 0; i < this.szamlalo; i++) {
                if(this.oratomb[i].getKezdet() == ora.getKezdet()) {
                    System.out.println("Ebben az időpontban már van óra!");
                    return false;
                }
            }
        }
        
        this.oratomb[this.szamlalo++] = ora;
        return true;
    }
    
    @Override
    public String toString() {
        System.out.print("Órarend: " + this.nap + ", órák ezen a napon: ");
        for (int i = 0; i < oratomb.length; i++) {
            if(oratomb[i] == null) continue;
            if(i < oratomb.length-1) System.out.print(oratomb[i] + " ");
            else System.out.print(oratomb[i]);
        }
        System.out.println();
        return "";
    }
}
