package model;

import java.util.ArrayList;
import java.util.Date;

public class Spectacle extends Seat{

    private static int idnr = 0;
    private int id;
    private String title;
    private String type;
    private double price;
    private Date date;
    private int length;
    private ArrayList<Boolean> availableSeats;
    private int numberOfSeats;

    public Spectacle() {
        title = "";
        type = "";
        length = 0;
        numberOfSeats = 0;
    }

    public Spectacle(String title, String type, int length, Date date, int numberOfSeats, double price) {
        this.title = title;
        this.type = type;
        this.length = length;
        this.date = date;
        this.price = price;
        this.id = ++idnr;

        availableSeats = new ArrayList<>();
        this.numberOfSeats = numberOfSeats;
        for(int i = 0; i < numberOfSeats; i++) {
            availableSeats.add(false);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public ArrayList<Boolean> getavailableSeats() {
        return availableSeats;
    }

    public void setavailableSeats(int index, boolean type) {
        this.availableSeats.set(index, type);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int nnumberOfSeats) {
        this.numberOfSeats = nnumberOfSeats;
    }

    public boolean checkSeat(int numberSeat) {
        return !availableSeats.get(numberSeat);
    }
    
    public Seat getAvailableSeat() {
        for(int i = 0; i < getNumberOfSeats(); i++) {
            if(!availableSeats.get(i)) {
                availableSeats.set(i, true);
                Seat seat = new Seat(i);
                return seat;
            }
        }
        return null;
    }

    @Override
    public void show() {
        System.out.println("Spectacle: " +
                "\nId: " + getId() +
                "\nTitle: " + getTitle() +
                "\nType: " + getType() +
                "\nDate: " + getDate() +
                "\nLength: " + getLength() +
                "\nNumber of Seats: " + getNumberOfSeats() +
                "\nPrice: " + getPrice() + "\n");
    }
}
