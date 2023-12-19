import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //
        String road;
        String town;
        String st;
        String zipCode;

        Scanner kb = new Scanner(System.in);
        System.out.println("Road : ");
        road = kb.nextLine();
        System.out.println("Town : ");
        town = kb.nextLine();
        System.out.println("St : ");
        st = kb.nextLine();
        System.out.println("zipCode : ");
        zipCode = kb.nextLine();

        Address address = new Address(road, town, st, zipCode);

    }
}
