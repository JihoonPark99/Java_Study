public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // argument constructor
    public CreditCard(Person person, Money credit_limit) {
        owner = person;
        creditLimit = new Money(credit_limit);
        balance = new Money(0); // by Kaiden Thank you
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        if (amount.add(balance).compareTo(creditLimit) != 1) {
            balance = balance.add(amount);
        } else {
            System.out.println("Exceeds Credit Limit");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}
