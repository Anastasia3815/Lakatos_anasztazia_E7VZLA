package Otodik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Anastasia
 */

class homerseklet implements Comparable<homerseklet> {

    public String varos;
    public int fok;

    public homerseklet(String varos, int fok) {
        this.varos = varos;
        this.fok = fok;
    }

    @Override
    public int compareTo(homerseklet o) {
        if (this.fok == o.fok) {
            return this.varos.compareTo(o.varos);
        }
        return o.fok - this.fok;
    }
}

public class Izzaszto_feladat {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<homerseklet> lista = new ArrayList<>();

        String sor, keresett_varos, sor2;
        String[] t;
       // String[] token;
        
        sor = br.readLine();
        t = sor.split(" ");
        int szam = Integer.parseInt(t[0]), index = 0;
        keresett_varos = t[1];

        while (szam > 0) {
            sor = br.readLine();
            t = sor.split(":");
           
            lista.add(new homerseklet(t[0], Integer.parseInt(t[1])));
            szam--;
        }
        Collections.sort(lista);
        int fok1 = 0;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).varos.equals(keresett_varos))
                fok1 = lista.get(i).fok;
            if(lista.get(i).fok > fok1){
                System.out.println(lista.get(i).varos +" ("+ lista.get(i).fok +")");
                index = 1;
            }            
        }
        if(index == 0)
            System.out.println("Missing data");
    }
}
