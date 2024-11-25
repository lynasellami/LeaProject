/**
 * This class represents non-negative amounts of money.
 */
public class Money {
    private long dollars; // The number of dollars
    private long cents;   // The number of cents

    /**
     * Constructor
     * @param amount The amount in decimal format
     */
    public Money(double amount) {
        if (amount < 0) {
            System.out.println("Error: Negative amounts of money are not allowed.");
            System.exit(0);
        } else {
            long allCents = Math.round(amount * 100);
            dollars = allCents / 100;
            cents = allCents % 100;
        }
    }

    /**
     * Copy constructor
     * @param other The Money object to copy
     */
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public Money add(Money otherAmount) {
        Money sum = new Money(0);
        sum.cents = this.cents + otherAmount.cents;
        long carryDollars = sum.cents / 100;
        sum.cents %= 100;
        sum.dollars = this.dollars + otherAmount.dollars + carryDollars;
        return sum;
    }

    public Money subtract(Money amount) {
        Money difference = new Money(0);
        if (this.cents < amount.cents) {
            this.dollars -= 1;
            this.cents += 100;
        }
        difference.dollars = this.dollars - amount.dollars;
        difference.cents = this.cents - amount.cents;
        return difference;
    }

    public int compareTo(Money amount) {
        if (this.dollars < amount.dollars) return -1;
        if (this.dollars > amount.dollars) return 1;
        if (this.cents < amount.cents) return -1;
        if (this.cents > amount.cents) return 1;
        return 0;
    }

    public boolean equals(Money amount) {
        return this.dollars == amount.dollars && this.cents == amount.cents;
    }

    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}