package Lab6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String name;
        double score;
        String classtitle;
        int cntstudent;
        // String student;

        final int testCount = 3;
        Scanner keyboard = new Scanner(System.in);

        Student student1 = new Student();
        System.out.println("Please input student information");
        System.out.print("Student Name : ");
        name = keyboard.nextLine();
        student1.setuserName(name);

        System.out.print("Test1 : ");
        score = keyboard.nextDouble();
        student1.setScore(0, score);

        System.out.print("Test2 : ");
        score = keyboard.nextDouble();
        student1.setScore(1, score);

        System.out.print("Test3 : ");
        score = keyboard.nextDouble();
        student1.setScore(2, score);

        System.out.println(student1.toString());

        // Class1
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println();
        System.out.println("Please input class information: ");
        System.out.print("Class Name: ");
        classtitle = keyboard1.nextLine();

        System.out.print("How many students in this class: ");
        cntstudent = keyboard1.nextInt();
        Class class1 = new Class(cntstudent);
        class1.setClassName(classtitle);

        for (int i = 0; i < cntstudent; i++) {
            Scanner keyboard2 = new Scanner(System.in);
            System.out.println(">>>Student" + i);
            System.out.print("Name: ");
            name = keyboard2.nextLine();

            Student student2 = new Student();
            student2.setuserName(name);
            // class1.setStudent(i, name);

            for (int j = 0; j < testCount; j++) {
                System.out.print("Test" + j + ": ");
                score = keyboard2.nextDouble();
                student2.setScore(j, score);
            }
            class1.setStudent(i, student2);
        }

        System.out.println(">>> Class Information");
        System.out.println("Class Name: " + class1.getClassName());
        System.out.println();

        System.out.println(">>>Students: ");
        for (int i = 0; i < cntstudent; i++) {
            System.out.println(class1.getStudent(i).toString());
            System.out.println();
        }

        int mean = 0;

        System.out.println(">>>Test Average");
        for (int i = 0; i < cntstudent; i++) {
            for (int j = 0; j < cntstudent; j++) {
                mean += class1.getStudent(j).getScore(i);
                // System.out.println(mean);
            }
            mean = mean / 3;
            System.out.println("Test" + i + ": " + mean);
            mean = 0;
        }
        System.out.println();

    }
}
