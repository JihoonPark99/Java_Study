import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        // create an array list of three employee objects
        ArrayList<Employee> eList = new ArrayList<>(3);

        // add three objects, each of a different type of employee
        eList.add(new SalariedEmployee("John Smith", "123456789", 250.67));
        eList.add(new HourlyEmployee("Mary Jones", "987654321", 15, 11.2));
        eList.add(new CommissionEmployee("James Bond", "007", .12, 120000));

        // call the print function for all objects
        for (int counter = 0; counter < 3; counter++) {
            System.out.println(eList.get(counter).toString());
            System.out.println(eList.get(counter).print());
            System.out.println();
        }
    }
}
