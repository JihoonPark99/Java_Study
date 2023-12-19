package assignment;

import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        // Compound Interest

        Scanner ob = new Scanner(System.in);

        System.out.print("Principal Amount : ");
        double P = ob.nextDouble();
        ob.nextLine();

        System.out.print("Annual Interest Rate : ");
        double r = ob.nextDouble();

        System.out.print("Number of Times per year : ");
        double n = ob.nextDouble();

        System.out.print("Specified Number of Years : ");
        double t = ob.nextDouble();

        double A = P * Math.pow((1 + r / n), (n * t));

        System.out.println("Pricipal Amount : " + P);
        System.out.println("Annual Interest Rate : " + r);
    }
}
