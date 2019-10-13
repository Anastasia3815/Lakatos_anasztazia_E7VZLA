package Harmadik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Anastasia
 */

class tavolsag implements Comparable<tavolsag> {

    public int ev;
    public int honap;
    public int nap;
    public String nev;
    public int tav;

    public tavolsag(int ev, int honap, int nap, String nev, int tav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.nev = nev;
        this.tav = tav;
    }

    @Override
    public int compareTo(tavolsag o) {
        if (this.tav == o.tav) {
            if (this.ev == o.ev) {
                if (this.honap == o.honap) {
                    if (this.nap == o.nap) {
                        return this.nev.compareTo(o.nev);
                    }
                    return this.nap - o.nap;
                }
                return this.honap - o.honap;
            }
            return this.ev - o.ev;
        }
        return o.tav - this.tav;
    }
}


public class Budapest_Kupa_1 {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<tavolsag> lista = new ArrayList<>();

        String sor = br.readLine();
        int szam = Integer.parseInt(sor);
        int index = szam;
        int sum = 0;

        while (szam > 0) {
            sum = 0;
            sor = br.readLine();
            String[] t = sor.split(";");

            for (int i = 4; i < t.length; i++) 
                sum += Integer.parseInt(t[i]);
            lista.add(new tavolsag(Integer.parseInt(t[0]), Integer.parseInt(t[1]), Integer.parseInt(t[2]), (t[3]), sum));
            szam--;
        }
            Collections.sort(lista);

            int max = lista.get(0).tav;
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).tav == max) {
                    if (lista.get(j).honap < 10 && lista.get(j).nap < 10) {
                        System.out.println(lista.get(j).ev + ";0" + lista.get(j).honap + ";0" + lista.get(j).nap + ";" + lista.get(j).nev);
                    }
                   
                    if (lista.get(j).honap < 10 && lista.get(j).nap >= 10) {
                        System.out.println(lista.get(j).ev + ";0" + lista.get(j).honap + ";" + lista.get(j).nap + ";" + lista.get(j).nev);
                    }
                    if (lista.get(j).honap >= 10 && lista.get(j).nap < 10) {
                        System.out.println(lista.get(j).ev + ";" + lista.get(j).honap + ";0" + lista.get(j).nap + ";" + lista.get(j).nev);
                    }
                    if (lista.get(j).honap >= 10 && lista.get(j).nap >= 10) {
                        System.out.println(lista.get(j).ev + ";" + lista.get(j).honap + ";" + lista.get(j).nap + ";" + lista.get(j).nev);
                    }
                }
            }
        }
}
