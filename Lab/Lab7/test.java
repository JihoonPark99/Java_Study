package Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int choice;
        String firstName;
        String lastName;
        long phoneNumber;
        String email;
        int index;

        ArrayList<Contact> list = new ArrayList<Contact>();

        Scanner kb = new Scanner(System.in);

        // if
        do {
            System.out.println("Choose from the following");
            System.out.println("0) Quit");
            System.out.println("1) Add new contacts");
            System.out.println("2) List all contacts");
            System.out.println("3) Search contacts by name and display");
            System.out.println("4) Search contacts by name and remove");
            choice = kb.nextInt();
            kb.nextLine();

            if (choice == 1) {

                System.out.println(">>>Add Contact<<<");
                System.out.print("Please enter firstName: ");
                firstName = kb.nextLine();
                System.out.print("Please enter lastName: ");
                lastName = kb.nextLine();
                System.out.print("Please enter first  phone number: ");
                phoneNumber = kb.nextLong();
                kb.nextLine();
                System.out.print("Please enter the email : ");
                email = kb.nextLine();

                Contact addList = new Contact(firstName, lastName, phoneNumber, email);
                addList.setfirstName(firstName);
                addList.setlastName(lastName);
                addList.setphoneNumber(phoneNumber);
                addList.setemail(email);
                list.add(addList);

                System.out.println(">>> Contact Added <<<");

            } else if (choice == 2) {
                System.out.println(">>>All Contacts>>>");
                for (Contact element : list) {
                    System.out.println(element.toString());
                }

            } else if (choice == 3) {
                System.out.println(">>> Search a Contact <<<");
                System.out.print("Please enter first name : ");
                firstName = kb.nextLine();
                System.out.print("Please enter last name : ");
                lastName = kb.nextLine();

                for (Contact element : list) {
                    if (element.getfirstName().equalsIgnoreCase(firstName)
                            && element.getlastName().equalsIgnoreCase(lastName)) {
                        System.out.println(element.toString());
                    } else {
                        System.out.println(">>> Not Found <<<");
                    }
                }

            } else if (choice == 4) {
                System.out.println(">>> Remove a Contact <<<");
                System.out.print("Please enter first name : ");
                firstName = kb.nextLine();
                System.out.print("Please enter last name : ");
                lastName = kb.nextLine();

                // for loop to get index of target value
                index = 0;
                for (Contact element : list) {

                    if (element.getfirstName().equalsIgnoreCase(firstName)
                            && element.getlastName().equalsIgnoreCase(lastName)) {
                        System.out.println(">>> Found and Deleted <<<");
                        list.remove(index);
                        break;
                    } else {
                        index += 1;
                    }
                }
                System.out.println(">>> Not Found <<<");

            } else if (choice > 4) {
                System.out.println(">>> Invalid Option, Please input again <<<");
            }

            // System.out.println("Please enter first name firstName: ");
            // firstName = kb.nextLine();
            // System.out.println("Please enter first name lastName: ");
            // lastName = kb.nextLine();

        } while (choice != 0);
        System.out.println("Bye!");
    }
}
