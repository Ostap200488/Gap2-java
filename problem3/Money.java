package problem3;
public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        dollars = (long) amount;
        cents = (long) ((amount - dollars) * 100);
    }
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }
    public Money add(Money other) {
        long totalCents = this.toCents() + other.toCents();
        return new Money(totalCents / 100.0);
    }
    public Money subtract(Money other) {
        long totalCents = this.toCents() - other.toCents();
        return new Money(totalCents / 100.0);
    }
    public long toCents() {  
        return dollars * 100 + cents;
    }
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
