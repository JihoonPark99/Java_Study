public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;
    private double salary;

    public HourlyEmployee(String name, String ssn, double hours, double wage) {
        super(name, ssn);
        this.hours = hours;
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setwage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public double earnings() {
        if (hours <= 40) {
            salary = wage * hours;
        } else {
            salary = (wage * 40) + ((hours - 40) * wage * 1.5);
        }
        return salary;
    }

    public String print() {
        earnings();
        return "Wage: $" + wage + "\n Hours: " + hours + "\n Salary: $" + salary;
    }

}
