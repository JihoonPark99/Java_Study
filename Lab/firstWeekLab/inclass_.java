
/**
 * inclass_
 */
import java.util.Scanner;

public class inclass_ {
    public static void main(String[] args) {
        // nextInt()와 nextLine()에 대해서 배우자
        // nextInt() :
        int age;
        String major;
        double score;

        Scanner kb = new Scanner(System.in);
        System.out.println("Age : ");
        age = kb.nextInt();
        System.out.println("Major : ");
        kb.nextLine();

        major = kb.nextLine();
        System.out.println();
        System.out.println("Major : " + major);
        System.out.println("Age : " + age);
    }
}