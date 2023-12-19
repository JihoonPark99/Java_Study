package thirdWeekLab.assignments;

import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        System.out.println(">>> Labor Day Sale <<< ");
        System.out.println("P: Package Platinum");
        System.out.println("G: Package Gold");
        System.out.println("S: Package Silver");
        System.out.println("Q: Quit");

        // Scanner pk = new Scanner(System.in);

        // System.out.print("Package > ");
        // String Package = pk.nextLine();
        // pk.nextLine();
        String Package;

        do {
            Scanner pk = new Scanner(System.in);
            System.out.print("Package > ");
            Package = pk.next();
            // pk.nextLine();
            switch (Package) {
                case "P":
                    System.out.println("70'' Smart TV \n iPhone 13 Pro Max \n MacBook Pro");
                    break;
                case "p":
                    System.out.println("70'' Smart TV \n iPhone 13 Pro Max \n MacBook Pro");
                    break;
                case "G":
                    System.out.println("iPhone 13 Pro Max \n MacBook Pro");
                    break;
                case "g":
                    System.out.println("iPhone 13 Pro Max \n MacBook Pro");
                    break;
                case "S":
                    System.out.println("MacBook Pro");
                    break;
                case "s":
                    System.out.println("MacBook Pro");
                    break;
                case "Q":
                case "q":
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid Package");
            }

        } while (!Package.equals("Q") && !Package.equals("q"));

    }
}