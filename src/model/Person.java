package model;

public class Person extends Client{

    private String lastName;
    private String firstName;

    Person() {
        super("");
        lastName = "";
        firstName = "";
    }

    Person(String lastName, String firstName) {
        super(lastName);
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getPrice(double price) {
        return price;
    }

    public void show() {
        System.out.println("Person " + getId() + ": " + getLastName() + " " + getFirstName());
    }
}
