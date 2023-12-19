package Lab6;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        int cntstudent;

        Scanner keyboard = new Scanner(System.in);
        // Class class1 = new Class() ;

        System.out.println("Please input student information");
        cntstudent = keyboard.nextInt();
        Class class1 = new Class(cntstudent);

    }

}
