package secondWeekLab.assignment;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {

        // Lab Week2 Assignment #1

        Scanner dp = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        int pointX = dp.nextInt();
        int pointY = dp.nextInt();
        dp.nextLine();

        // condition
        if (((pointX < 5) && (pointX > -5)) && ((pointX < 2.5) && (pointX > -2.5))) {
            System.out.println("Point (" + (float) pointX + "," + (float) pointY + ") is in the rectangle");
        } else {
            System.out.println("Point (" + (float) pointX + "," + (float) pointY + ") is not in the rectangle");
        }

        // condition Y

    }
}
