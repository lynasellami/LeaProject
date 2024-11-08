public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    /** Constructor to initialize CreditCard with owner and credit limit */
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        // TODO: Use the copy constructor for creditLimit for security
        this.balance = new Money(0); // Initialize balance to zero
    }

    /** Accessor to get the balance as a new Money object (for security) */
    public Money getBalance() {
        // TODO: Return a new Money object with the balance amount
        return null;
    }

    /** Accessor to get the credit limit as a new Money object (for security) */
    public Money getCreditLimit() {
        // TODO: Return a new Money object with the credit limit amount
        return null;
    }

    /** Accessor to get owner's information as a String */
    public String getPersonals() {
        // TODO: Call toString on the owner object
        return "";
    }

    /** Method to charge an amount to the credit card */
    public void charge(Money amount) {
        // TODO: Check if the charge exceeds the credit limit before adding
    }

    /** Method to make a payment on the credit card */
    public void payment(Money amount) {
        // TODO: Subtract the payment amount from the balance
    }
}