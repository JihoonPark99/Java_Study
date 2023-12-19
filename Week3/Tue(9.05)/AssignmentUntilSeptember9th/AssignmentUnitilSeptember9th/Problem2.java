package AssignmentUnitilSeptember9th;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // V = (R - 2E) / S
        // ask user to input following :
        // R : length of the row, in feet
        // E : amount of space used by an end-post assembly
        // S : amount of space between the vines, in feet

        Scanner kb = new Scanner(System.in);
        System.out.println("Length of the row(in feet) : ");
        double r = kb.nextDouble();
        kb.nextLine();

        System.out.println("Amount of space used by an end-post assembly : ");
        double e = kb.nextDouble();
        kb.nextLine();

        System.out.println("Amout of space between the vines(in feet) : ");
        double s = kb.nextDouble();
        kb.nextLine();

        double v = (r - 2 * e) / s;

        System.out.println("The number of grapevines \n that will fit in the row");
        System.out.println(v);

    }
}
