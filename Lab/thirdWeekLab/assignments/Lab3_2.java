package thirdWeekLab.assignments;

import java.util.Random;
import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        // dice game

        String name;
        String yn;
        int cnt;
        cnt = 0;

        int computer_cnt;
        computer_cnt = 0;

        int human_cnt;
        human_cnt = 0;

        Scanner nm = new Scanner(System.in);
        System.out.print("what's is your name:");
        name = nm.nextLine();
        do {
            cnt += 1;
            // Scanner nm = new Scanner(System.in);
            // System.out.print("what's is your name:");
            // name = nm.nextLine();
            // nm.nextLine();

            Random random = new Random();
            // random object

            int computer = random.nextInt(6) + 1;
            System.out.println("computer " + computer);

            int human = random.nextInt(6) + 1;
            System.out.println(name + " " + human);

            System.out.println("Game " + cnt);

            if (computer > human) {
                System.out.println("> Winner : " + computer);
                computer_cnt += 1;
            } else if (computer < human) {
                System.out.println("> Winner : " + name);
                human_cnt += 1;
            } else {
                System.out.println("> Tie");
            }

            // Scanner nm = new Scanner(System.in);
            System.out.print("Play Again? ");
            yn = nm.next();
            System.out.println();

        } while (!yn.equals("n"));

        System.out.println(name + ": computer");
        System.out.println(human_cnt + " : " + computer_cnt);
        if (computer_cnt > human_cnt) {
            System.out.println("Grand Winner: Computer");
        } else if (computer_cnt < human_cnt) {
            System.out.println("Grand Winner: " + name);
        } else {
            System.out.println("Tie");
        }

    }
}
