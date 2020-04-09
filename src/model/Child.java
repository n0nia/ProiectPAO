package model;

public class Child extends Person {

    private final double discount = 100;

    public Child(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public double getDiscount() {
        return discount;
    }

    public double getPrice(double price) {
        return 0;
    }

    @Override
    public void show() {
        System.out.println("Client: " +
                ", Id:" + getId() +
                "\nLastName: " + getLastName() +
                "\nFirstName: " + getFirstName() +
                "\nDiscount: " + "free" + "\n");

    }
}
