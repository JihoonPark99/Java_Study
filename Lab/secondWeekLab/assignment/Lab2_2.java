package secondWeekLab;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {

        // Lab Week2 Assignment #2

        Scanner kb = new Scanner(System.in);

        // weight
        System.out.println("Weight(Kg): ");
        int weight = kb.nextInt();
        kb.nextLine();

        // Fee
        double fee = 0.0;
        if (weight > 20) {
            System.out.println("Fail - Weight " + weight + "kg - Too heavy");
        } else if (weight > 10) {
            fee = 4.8;
            System.out.println("Weight(Kg): " + weight);
        } else if (weight > 6) {
            fee = 3.7;
            System.out.println("Weight(Kg): " + weight);
        } else if (weight > 2) {
            fee = 2.2;
            System.out.println("Weight(Kg): " + weight);
        } else if (weight > 0) {
            fee = 1.1;
            System.out.println("Weight(Kg): " + weight);
        } else {
            System.out.println("Fail - Weight " + weight + "kg - Invalid weight");
        }
        System.out.println();

        // Distnace
        System.out.println("Distance(mi): ");
        int distance = kb.nextInt();
        kb.nextLine();
        System.out.println();

        if (distance < 10) {
            System.out.println("Fail - Distance " + distance + " - Too short");
        } else if (distance > 3000) {
            System.out.println("Fail - Distance " + distance + " - Too far");
        } else {
            System.out.println("Distance(mi): " + distance);
        }

        // times
        double total = 0.0;
        if (distance % 500 == 0) {
            total = fee * (distance / 500);
        } else {
            total = fee * ((distance / 500) + 1);
        }

        System.out.println("Total Fee: " + total);

    }
}
