package Hetedik;

import java.util.Scanner;

/**
 *
 * @author Anastasia
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Melyik naphoz szeretnel orat hozzaadni? ");
        String nap = sc.nextLine();
        System.out.println("Hány orat szeretnel hozzaadni? ");
        int orakSzama = Integer.parseInt(sc.nextLine());
        
        Ora[] oratombok = new Ora[orakSzama];        
        Orarend orarend = new Orarend(nap);
        System.out.println("Kérlek írd be az órák adatait szóközzel elválasztva, majd nyomj Entert! (id, név, kezdés): ");
        
        for (int i = 0; i < orakSzama; i++) {              
            String[] token = sc.nextLine().split(" ");
            oratombok[i] = new Ora(Integer.parseInt(token[0]), token[1], Integer.parseInt(token[2]));
            if(orarend.oratHozzaad(oratombok[i])) System.out.println("Óra hozzáadása sikeres!");
            else System.out.println("Óra hozzáadása sikertelen!");
        }
        
        orarend.toString();
    }
}
