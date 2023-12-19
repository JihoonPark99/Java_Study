public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, String ssn, double salary) {
        super(name, ssn);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double earnings() {
        return salary;
    }

    public String print() {
        return "Salary: " + salary;
    }
}
