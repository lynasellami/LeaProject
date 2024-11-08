public class Money {
    private long dollars;
    private long cents;

    /** Constructor to initialize Money object with an amount */
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

    /** Copy constructor to create a copy of another Money object */
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    /** Equals method to compare two Money objects */
    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    /** toString method to format Money object as currency */
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    /** Method to add another Money object to this one */
    public Money add(Money otherAmount) {
        Money sum = new Money(0);
        sum.cents = this.cents + otherAmount.cents;
        long carryDollars = sum.cents / 100;
        sum.cents = sum.cents % 100;
        sum.dollars = this.dollars + otherAmount.dollars + carryDollars;
        return sum;
    }

    /** Method to subtract another Money object from this one */
    public Money subtract(Money amount) {
        Money difference = new Money(0);
        if (this.cents < amount.cents) {
            this.dollars = this.dollars - 1;
            this.cents = this.cents + 100;
        }
        difference.dollars = this.dollars - amount.dollars;
        difference.cents = this.cents - amount.cents;
        return difference;
    }
}