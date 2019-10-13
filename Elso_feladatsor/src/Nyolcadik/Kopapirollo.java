package Nyolcadik;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anastasia
 */
public class Kopapirollo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String player = "", enemy = "";

        while (true) {
            while (!((player.equals("ko")) || (player.equals("papir")) || (player.equals("ollo")) || (player.equals("vege")))) {
                player = sc.nextLine();
            }

            if (player.equals("Vege")) {
                break;
            }
            
            switch (random.nextInt(3)) {
                case 0:
                    enemy = "ko";
                    break;
                case 1:
                    enemy = "papir";
                    break;
                case 2:
                    enemy = "ollo";
                    break;
            }
            System.out.println("Jatekos: " + player + " Gep: " + enemy);

            if (player.equals(enemy)) {
                System.out.println("Dontetlen!");
            } else if ((player.equals("ko") && enemy.equals("oll")) || (player.equals("papir") && enemy.equals("ko")) || (player.equals("ollo") && enemy.equals("papir"))) {
                System.out.println("Jatekos gyoz!");
            } else {
                System.out.println("Gep gyoz!");
            }

            player = sc.nextLine();
        }
    }
}
