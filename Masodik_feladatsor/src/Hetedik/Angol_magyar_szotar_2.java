package Hetedik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Anastasia
 */

class szavak implements Comparable<szavak>{
    public String szo;

    public szavak(String szo) {
        this.szo = szo;
    }

    @Override
    public int compareTo(szavak o) {
        return this.szo.compareTo(o.szo);
    }  
}

public class Angol_magyar_szotar_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<szavak> lista = new ArrayList<>();
        String sor;
        String []t;
        int szam = Integer.parseInt(sor = br.readLine());
        
        while(szam > 0){
           // t = sor.split(":");
            lista.add(new szavak(sor = br.readLine()));
            szam--;
        }
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).szo);
        }
    }   
}
