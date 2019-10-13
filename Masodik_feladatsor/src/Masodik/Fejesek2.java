package Masodik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Anastasia
 */
class sapi {

    public String nev;
    public String elotte;

    public sapi(String nev, String elotte) {
        this.nev = nev;
        this.elotte = elotte;
    }

}

public class Fejesek2 {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<sapi> lista = new ArrayList<>();

        String sor = br.readLine();
        String[] t = sor.split(";");

        int szam = Integer.parseInt(t[0]);
        String elso = t[1];
        String keres = t[2];
        int db = 1, piros, kek;
        int index = szam;

        while (szam > 1) {
            sor = br.readLine();
            t = sor.split(";");

            lista.add(new sapi(t[0], t[1]));
            szam--;
        }
        int hanyadik = 0;
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (elso.equals(lista.get(j).elotte)) {
                    if (keres.equals(lista.get(j).nev)) {
                        hanyadik = db;
                    }
                    elso = lista.get(j).nev;
                    db++;
                }

            }
        }
        if (hanyadik % 2 != 0) {
            piros = (hanyadik + 1) / 2;
            kek = (hanyadik - 1) / 2;
            System.out.println(piros + " " + kek);
        } else {
            piros = (hanyadik) / 2;
            kek = (hanyadik) / 2;
            System.out.println(piros + " " + kek);
        }

    }
}
