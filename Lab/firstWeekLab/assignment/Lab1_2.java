package assignment;

import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        // assignment #2
        System.out.println("------ Assignment #2 ------");

        // Input
        // Score 1: 98
        // Score 2: 85.5
        // Score 3: 100
        // First Name: John
        // Middle Name Initial: A
        // Last Name: Smith
        // ID: 1234567
        // Major: Computer Science

        Scanner sc = new Scanner(System.in);
        System.out.print("Score1 : ");
        int score1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Score2 : ");
        double score2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Score3 : ");
        int score3 = sc.nextInt();
        sc.nextLine();

        System.out.print("First Name : ");
        String firstName = sc.next();
        sc.nextLine();

        System.out.print("Middle Name Initial : ");
        String middleNameInitial = sc.nextLine();
        // sc.nextLine();

        System.out.print("Last Name : ");
        String lastName = sc.nextLine();
        // sc.nextLine();

        System.out.print("ID : ");
        int ID = sc.nextInt();
        sc.nextLine();

        System.out.print("Major : ");
        String major = sc.nextLine();

        System.out.println();

        double avgScore = (score1 + score2 + score3) / 3;
        // Print
        // Student information:
        // John A. Smith, ID# 1234567
        // Major: Computer Science
        // Test average: 94.5
        System.out.println("Student information : ");
        System.out.println(firstName + " " + middleNameInitial + ". " + lastName + ", ID#" + major);
        System.out.println("Test average : " + avgScore);

    }
}
