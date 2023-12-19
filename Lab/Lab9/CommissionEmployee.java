public class CommissionEmployee extends Employee {

    private double commissionRate;
    private long grossSales;

    public CommissionEmployee(String name, String ssn, double commissionRate, long grossSales) {
        super(name, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(long grossSales) {
        this.grossSales = grossSales;
    }

    public double getcommissionRate() {
        return commissionRate;
    }

    public long getGrossSales() {
        return grossSales;
    }

    public double earnings() {
        return commissionRate * grossSales;
    }

    public String print() {
        return "Commission rate: " + commissionRate + "\n Sale total: $"
                + grossSales + "\n Salary: $" + commissionRate * grossSales;
    }
}
