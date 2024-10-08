package problem3;
public class Person {
    private String firstName, lastName;
    private Address home;

    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + ", " + home;
    }
}
