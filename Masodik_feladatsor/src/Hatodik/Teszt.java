package Hatodik;

import java.util.Scanner;

/**
 *
 * @author Anastasia
 */
public class Teszt {
     public static void rendezes(Masfel_millio_lepes[] tomb) {
        for (int i = 0; i < tomb.length-1; i++) {
            for (int j = i+1; j < tomb.length; j++) {
                if(tomb[i].kek == tomb[j].kek) {
                    if(tomb[i].egyeb == tomb[j].egyeb) {
                        if(tomb[i].nev.compareTo(tomb[j].nev) > 0) {
                            Masfel_millio_lepes tmp = tomb[i];
                            tomb[i] = tomb[j];
                            tomb[j] = tmp;
                        }
                    }
                    else {
                        if(tomb[i].egyeb < tomb[j].egyeb) {
                            Masfel_millio_lepes tmp = tomb[i];
                            tomb[i] = tomb[j];
                            tomb[j] = tmp;
                        }
                    }
                }
                else {
                    if(tomb[i].kek < tomb[j].kek) {
                        Masfel_millio_lepes tmp = tomb[i];
                        tomb[i] = tomb[j];
                        tomb[j] = tmp;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meret = Integer.parseInt(sc.nextLine());
        
        Masfel_millio_lepes[] szemelyek = new Masfel_millio_lepes[meret];
        
        for (int i = 0; i < meret; i++) {
            String[] token = sc.nextLine().split(";");
            int kek = 0;
            int egyeb = 0;
            for (int j = 0; j < token[1].length(); j++) {
                if(token[1].charAt(j) == 'K') kek++;
                else if(token[1].charAt(j) != '.') egyeb++;
            }
            szemelyek[i] = new Masfel_millio_lepes(token[0], kek, egyeb);
        }
        rendezes(szemelyek);
        
        for (int i = 0; i < szemelyek.length; i++) {
            System.out.println(szemelyek[i].toString());
        }
    }
}
