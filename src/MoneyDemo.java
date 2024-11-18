public class MoneyDemo {
    public static void main(String[] args) {
        final Money FIRST_AMOUNT = new Money(10.02);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(10.88);

        Money balance = new Money(500);

        System.out.println("The current amount is " + balance.toString());
        balance = balance.add(SECOND_AMOUNT);
        System.out.println("Adding " + SECOND_AMOUNT + " gives " + balance.toString());
        balance = balance.subtract(THIRD_AMOUNT);
        System.out.println("Subtracting " + THIRD_AMOUNT + " gives " + balance.toString());

        System.out.println(SECOND_AMOUNT + (SECOND_AMOUNT.equals(FIRST_AMOUNT) ? " equals " : " does not equal ") + FIRST_AMOUNT);
        System.out.println(THIRD_AMOUNT + (THIRD_AMOUNT.equals(FIRST_AMOUNT) ? " equals " : " does not equal ") + FIRST_AMOUNT);
    }
}