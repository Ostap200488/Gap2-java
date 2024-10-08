package problem3;
public class Money {
    private long dollars;
    private long cents;

    // Constructor
    public Money(double amount) {
        dollars = (long) amount;
        cents = (long) ((amount - dollars) * 100);
    }

    // Copy Constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Add method
    public Money add(Money other) {
        long totalCents = this.toCents() + other.toCents();
        return new Money(totalCents / 100.0);
    }

    // Subtract method
    public Money subtract(Money other) {
        long totalCents = this.toCents() - other.toCents();
        return new Money(totalCents / 100.0);
    }

    // Convert to total cents
    public long toCents() {  // Changed from private to public
        return dollars * 100 + cents;
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
