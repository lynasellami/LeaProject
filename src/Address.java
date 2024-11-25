/**
 * This class defines an address using a street, city, state, and zip code.
 */
public class Address {
    private String street; // The street number and name
    private String city;   // The city
    private String state;  // The state
    private String zip;    // The zip code

    /**
     * Constructor
     * @param road Describes the street number and name
     * @param town Describes the city
     * @param st Describes the state
     * @param zipCode Describes the zip code
     */
    public Address(String road, String town, String st, String zipCode) {
        street = road;
        city = town;
        state = st;
        zip = zipCode;
    }

    /**
     * The toString method
     * @return Information about the address
     */
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
