package repositories;

import model.*;

import java.util.ArrayList;

public class SeatRepository {
    
    private ArrayList<Seat> seats;

    public SeatRepository() {
        seats = new ArrayList<>();
    }
    
    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public void removeSeat(Seat seat) {
        seats.remove(seat);
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }
    
    public ArrayList<Balcony> getAllBalconySeats() {
        ArrayList<Balcony> nrseats = new ArrayList<>();
        for(Seat seat: seats) {
            if(seat instanceof Balcony) {
                Balcony balcony = (Balcony) seat;
                nrseats.add(balcony);
            }
        }
        return nrseats;
    }

    public ArrayList<Loge> getAllLogeSeats() {
        ArrayList<Loge> nrseats = new ArrayList<>();
        for(Seat seat: seats) {
            if(seat instanceof Loge) {
                Loge loge = (Loge) seat;
                nrseats.add(loge);
            }
        }
        return nrseats;
    }

    public ArrayList<Standard> getAllStandardSeats() {
        ArrayList<Standard> nrseats = new ArrayList<>();
        for(Seat seat: seats) {
            if(seat instanceof Standard) {
                Standard standard = (Standard) seat;
                nrseats.add(standard);
            }
        }
        return nrseats;
    }

    public Seat getSeatByType(String type) {
        for(Seat seat : seats) {
            if(seat.getType().equals(type)) {
                return seat;
            }
        }
        return null;
    }

    public ArrayList<Seat> getAllByIdSpectacle(int id) {
        ArrayList<Seat> nrseats = new ArrayList<>();

        for(Seat seat : seats) {
            if(seat.getSpectacle().getId() == id){
                nrseats.add(seat);
            }
        }
        return nrseats;
    }

    /*public ArrayList<Seat> getAllByUsername(String username) {
        ArrayList<Seat> nrseats = new ArrayList<>();

        for(Seat seat : seats) {
            if(seat.getSpectacle().getUsername().equals(username)){
                nrseats.add(seat);
            }
        }
        return nrseats;
    }*/

    public ArrayList<Seat> getAll() {
        return seats;
    }

    public void show(Seat seat) {
        seat.show();
    }
}
