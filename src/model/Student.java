package model;

public class Student extends Person {

    private final double discount = 25;

    public Student(String firstName, String lastName) {
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
                "\nDiscount: " + "25%" + "\n");
    }
}
