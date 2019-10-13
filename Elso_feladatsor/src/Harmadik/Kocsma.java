package Harmadik;

import java.util.Arrays;

/**
 *
 * @author Anastasia
 */
public class Kocsma extends VendeglatoipariEgyseg{
    private String [] sorlap;

    public Kocsma(String [] sorlap, String nev, int ferohelyekSzama, boolean dohanyzo) {
        super(nev, ferohelyekSzama, dohanyzo);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    public void setSorlap(String[] sorlap) {
        this.sorlap = sorlap;
    }

    @Override
    public String toString() {
        return super.toString() + "Kocsma " + "sorlap = " + Arrays.toString(sorlap);
    }
    
    
    
}
