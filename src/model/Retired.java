package model;

public class Retired extends Person{

    private final double discount = 50;

    public Retired(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public double getDiscount() {
        return discount;
    }

    public double getPrice(double price) {
        return price * (100 - discount) / 100;
    }

    @Override
    public void show() {
        System.out.println("Client: " +
                ", Id:" + getId() +
                "\nLastName: " + getLastName() +
                "\nFirstName: " + getFirstName() +
                "\nDiscount: " + "50%" + "\n");
    }
}
