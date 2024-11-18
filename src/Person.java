public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public Person(String last, String first, Address residence) {
        lastName = last;
        firstName = first;
        home = residence;
    }

    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}