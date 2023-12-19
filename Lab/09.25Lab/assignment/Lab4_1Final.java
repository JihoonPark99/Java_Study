package assignment;

import java.util.Scanner;
import java.lang.Math;

public class Lab4_1Final {
    public static void main(String[] args) {

        long number = 10L;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer : ");
        number = kb.nextLong();

        isValid(number);

        if (isValid(number)) {
            System.out.println(number + " is valid");
        } else {
            System.out.println(number + " is invalid");
        }
    }

    public static boolean isValid(long number) {
        boolean valid;
        int digit;
        double startWithnum;
        int total;
        int evenTotal;
        int oddTotal;

        digit = numberOfDigits(number);
        startWithnum = startWith(number);
        oddTotal = sumDoubleDigitOddPlaces(number);
        evenTotal = sumDoubleDigitEvenPlaces(number);
        total = oddTotal + evenTotal;
        if ((digit >= 13 && digit <= 16)
                && (startWithnum == 4. || startWithnum == 5. || startWithnum == 37. || startWithnum == 6.)
                && (total % 10 == 0)) {
            valid = true;
        } else {
            valid = false;
        }
        // System.out.println("Number : " + number);
        // System.out.println("digit : " + digit);
        // System.out.println("startWithnum : " + startWithnum);
        // System.out.println("oddTotal : " + oddTotal);
        // System.out.println("evenTotal : " + evenTotal);
        // System.out.println("total : " + total);
        // System.out.println("Return : " + valid);
        return valid;
    }

    public static int numberOfDigits(long number) {
        int len_digit;
        if (number <= Math.pow(10., 16.)) {
            len_digit = 16;
        } else if (number <= Math.pow(10., 15.)) {
            len_digit = 15;
        } else if (number <= Math.pow(10., 14.)) {
            len_digit = 14;
        } else if (number <= Math.pow(10., 13.)) {
            len_digit = 13;
        } else {
            len_digit = 10; // invalid
        }

        return len_digit;
    }

    public static int startWith(long number) {
        int firstNum;
        int lenDigit = numberOfDigits(number);
        firstNum = (int) (number / ((long) Math.pow(10., lenDigit - 1)));
        if (firstNum == 3) {
            firstNum = (int) (number / ((long) Math.pow(10., lenDigit - 2)));
        }
        return firstNum;
    }

    public static int sumDoubleDigitOddPlaces(long number) {
        int lenDigit = numberOfDigits(number);
        int oddTotal = 0;
        long firststep;
        int secondstep;
        // System.out.println("OddPlaces Test");
        for (int i = 1; i <= lenDigit; i += 2) {
            firststep = number % (long) (Math.pow(10., (double) i));
            secondstep = (int) (firststep / (long) (Math.pow(10., (double) i - 1)));
            oddTotal += secondstep;
            // System.out.println(secondstep + " " + i);
            // System.out.print(i + " ");

        }
        // System.out.println();
        return oddTotal;
    }

    // 1의 자릿수부터 100, 10000, ... Odd자릿수 합 구하기
    public static int sumDoubleDigitEvenPlaces(long number) {
        int lenDigit = numberOfDigits(number);
        int evenTotal = 0;
        long firststep;
        int secondstep;

        int exceptcaseTenth;
        int exceptcaseOneth;
        // int exceptTotal;
        // System.out.println("EvenPlaces Test");
        for (int i = 2; i <= lenDigit; i += 2) {
            firststep = number % (long) (Math.pow(10., (double) i));
            secondstep = (int) (firststep / (long) (Math.pow(10., (double) i - 1))) * 2;
            if (secondstep >= 10) {
                exceptcaseTenth = secondstep / 10;
                exceptcaseOneth = secondstep % 10;
                secondstep = exceptcaseTenth + exceptcaseOneth;
                evenTotal += secondstep;
            } else {
                evenTotal += secondstep;
            }
            // System.out.println(secondstep + " " + i + " " + secondstep);
        }
        // System.out.println();
        return evenTotal;
    }
}