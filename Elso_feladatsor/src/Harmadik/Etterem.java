package Harmadik;

/**
 *
 * @author Anastasia
 */
public class Etterem  extends VendeglatoipariEgyseg{
    private String [] etlap;
    
    public Etterem(String [] etlap, String nev, int ferohelyekSzama, boolean dohanyzo) {
        super(nev, ferohelyekSzama, dohanyzo);
        this.etlap = etlap;
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return super.toString() + "Etterem " + "etlap = " + etlap;
    }
    
    
}
