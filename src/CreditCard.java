public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    /** Constructor to initialize CreditCard with owner and credit limit */
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit); // Use copy constructor for security
        this.balance = new Money(0); // Initialize balance to zero
    }

    /** Accessor to get the balance as a new Money object (for security) */
    public Money getBalance() {
        return new Money(balance); // Return a copy of the balance
    }

    /** Accessor to get the credit limit as a new Money object (for security) */
    public Money getCreditLimit() {
        return new Money(creditLimit); // Return a copy of the credit limit
    }

    /** Accessor to get owner's information as a String */
    public String getPersonals() {
        return owner.toString();
    }

    /** Method to charge an amount to the credit card */
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    /** Method to make a payment on the credit card */
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}