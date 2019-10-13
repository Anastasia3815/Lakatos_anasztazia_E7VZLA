package Negyedik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Anastasia
 */

class hullam implements Comparable<hullam> {

    public String hullamvasut_neve;
    public String vilag_neve;
    public int legkisebb_magassag;
    public int varakozasi_ido;

    public hullam(String hullamvasut_neve, String vilag_neve, int legkisebb_magassag, int varakozasi_ido) {
        this.hullamvasut_neve = hullamvasut_neve;
        this.vilag_neve = vilag_neve;
        this.legkisebb_magassag = legkisebb_magassag;
        this.varakozasi_ido = varakozasi_ido;
    }

    @Override
    public int compareTo(hullam o) {
        if (this.varakozasi_ido == o.varakozasi_ido) {
            if (this.legkisebb_magassag == o.legkisebb_magassag) {
                return this.hullamvasut_neve.compareTo(o.hullamvasut_neve);
            }
            return o.legkisebb_magassag - this.legkisebb_magassag;
        }
        return this.varakozasi_ido - o.varakozasi_ido;
    }

}

public class Hullamvasutak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<hullam> lista = new ArrayList<>();

        String sor;
        String[] t;
        int szam = Integer.parseInt(br.readLine());

        while (szam > 0) {
            sor = br.readLine();
            t = sor.split(";");
            
            lista.add(new hullam(t[0], t[1], Integer.parseInt(t[2]), Integer.parseInt(t[3])));
            szam--;

        }
        Collections.sort(lista);
        
        for (hullam h : lista) {
            System.out.println(h.hullamvasut_neve +" ("+ h.vilag_neve +"): "+ h.varakozasi_ido);
        }
    }
}
