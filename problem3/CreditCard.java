package problem3;
public class CreditCard {
    private Money balance;
    private final Money creditLimit;  // Marked as final
    private final Person owner;       // Marked as final

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        if (balance.add(amount).toCents() > creditLimit.toCents()) {
            System.out.println("Exceeds credit limit");
        } else {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
