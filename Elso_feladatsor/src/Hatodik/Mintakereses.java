package Hatodik;

import java.util.Random;

/**
 *
 * @author Anastasia
 */
public class Mintakereses {

    public static boolean isConsecutiveFour(int[] values) {
        int index = 1;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                index++;
                if (index >= 4) {
                    return true;
                }
            } else {
                index = 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] values = new int[20];

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(3);
        }

        for (int i = 0; i < values.length; i++) {
            if (i < values.length - 1) {
                System.out.print(values[i] + " ");
            } else {
                System.out.println(values[i]);
            }
        }

        if (isConsecutiveFour(values)) {
            System.out.println("Negy egymást követő azonos szám");
        } else {
            System.out.println("Nem azonos egymást követő szám");
        }
    }
}
