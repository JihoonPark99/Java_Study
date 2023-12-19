public abstract class Employee {
    private String name;
    private String ssn;

    public Employee(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public abstract double earnings();

    public abstract String print();

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public String toString() {
        return "Name: " + name + "\n Ssn: " + ssn;
    }
}
