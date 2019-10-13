package Harmadik;

import java.util.ArrayList;

/**
 *
 * @author Anastasia
 */
public class Teszt {
    public static Kocsma[] adottItaltKinaloKocsmak(String ital, VendeglatoipariEgyseg[] t) {        
        ArrayList<Kocsma> tmp = new ArrayList<>();
        for (VendeglatoipariEgyseg v : t) {
            if(v instanceof Kocsma) {
                String[] sorlap = ((Kocsma) v).getSorlap();
                for (String s : sorlap) {
                    if(s.contains(ital)) {
                        tmp.add((Kocsma) v);
                    }
                }
            }
        }
        
        for (Kocsma k : tmp) {
            System.out.println(k);
        }
        
        return tmp.toArray(new Kocsma[tmp.size()]);        
    } 
    
    public static void main(String[] args) {        
        String[] sorlap = {"Sio", "Coca-Cola", "Kobanyai"};
        String[] sorlap2 = {"Pepsi", "Ipa", "Pepsi", "Soproni"};
        String[] sorlap3 = {"7UP", "Tuborg", "Dreher"};
        
        VendeglatoipariEgyseg[] t = new VendeglatoipariEgyseg[10];
        t[0] = new Etterem(args, "Etterem_1", 8, false);
        t[1] = new Etterem(args, "Etterem_2", 53, false);
        t[2] = new Etterem(args, "Etterem_3", 78, false);
        t[3] = new Etterem(args, "Etterem_4", 12, false);
        t[4] = new Etterem(args, "Etterem_5", 4, false);
        t[5] = new Kocsma(sorlap, "Kocsma_1", 43, true);
        t[6] = new Kocsma(sorlap2, "Kocsma_2", 11, true);
        t[7] = new Kocsma(sorlap2, "Kocsma_3", 123, true);
        t[8] = new Kocsma(sorlap3, "Kocsma_4", 45, true);
        t[9] = new Kocsma(sorlap2, "Kocsma_5", 65, true);
        
        Kocsma[] k = new Kocsma[3];
        k[0] = new Kocsma(sorlap, "Kocsma_1", 43, true);
        k[1] = new Kocsma(sorlap2, "Kocsma_2", 11, true);
        k[2] = new Kocsma(sorlap2, "Kocsma_3", 123, true);
        
        adottItaltKinaloKocsmak("Sio", t);
    }
}
