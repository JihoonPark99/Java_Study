package Lab5.assignment;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        String testpartNo1;
        String testpartNo2;
        String testpartDesc;
        int testquantity;
        double testprice;

        Scanner keyboard = new Scanner(System.in);

        /// First Invoice
        Invoice invoice1 = new Invoice();
        System.out.println(">>>Create first Invoice object<<<");
        System.out.println(">>>Ask for user input<<<");
        System.out.print("Part Number : ");
        testpartNo1 = keyboard.nextLine();

        System.out.print("Part Description : ");
        testpartDesc = keyboard.nextLine();

        System.out.print("Quantity : ");
        testquantity = keyboard.nextInt();

        System.out.print("Price per item : ");
        testprice = keyboard.nextDouble();
        System.out.println();

        System.out.println(">>>Display the First Invoice object<<<");
        invoice1.setpartNo(testpartNo1);
        invoice1.setpartDesc(testpartDesc);
        invoice1.setquantity(testquantity);
        invoice1.setprice(testprice);
        invoice1.setInvoiceAmount(testquantity, testprice);
        System.out.println();

        /// Second Invoice
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println(">>>Ask user input for the 2nd Invoice object<<<");
        System.out.print("Part Number : ");
        testpartNo2 = keyboard2.nextLine();

        System.out.println();
        System.out.print("Part Description : ");
        testpartDesc = keyboard2.nextLine();

        System.out.print("Quantity : ");
        testquantity = keyboard2.nextInt();

        System.out.print("Price per item : ");
        testprice = keyboard2.nextDouble();

        Invoice invoice2 = new Invoice(testpartNo2, testpartDesc, testquantity, testprice);
        System.out.println(">>>Create the 2nd Invoice object");
        System.out.println();
        System.out.println(">>>Display the First Invoice object");
        System.out.println("Part Number : " + invoice2.getpartNo());
        System.out.println("Part Description : " + invoice2.getpartDesc());
        System.out.println("Quantity : " + invoice2.getquantity());
        System.out.println("Price per item : " + invoice2.getprice());
        System.out.println("Invoice amount : " + invoice2.getInvoiceAmount());

    }
}