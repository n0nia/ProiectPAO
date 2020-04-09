package service;

import model.Reservation;
import model.Seat;
import model.Spectacle;
import repositories.SeatRepository;

import java.util.ArrayList;

public class SeatService {

    private SeatRepository seatRepository = new SeatRepository();
    private static SeatService instance = new SeatService();

    private SeatService() { }

    public static SeatService getInstance() {
        return instance;
    }

    public void showSeat(Seat seat) {
        seatRepository.show(seat);
    }


    public boolean checkAvaibleSeat(Seat seat) {
        int number = seat.getNumber();
        if(number < seat.getSpectacle().getNumberOfSeats()) {
            return seat.getSpectacle().checkSeat(number);
        }
        return false;
    }

    public void addSeat(Seat seat) {
        if (checkAvaibleSeat(seat)) {
            seat.getSpectacle().getAvailableSeat();
            seatRepository.addSeat(seat);
        } else {
            System.out.println("Seat unavailable.");
        }
    }

    /*public void removeSeatById(int id) {
        seat.getSpectacle().setavailableSeats(seat.getNumber(), false);
        seatRepository.removeSeat(seat);
    }*/

    public Seat getSeatByType(String type) {
        return seatRepository.getSeatByType(type);
    }

    /*public Seat getSeatByUsername(String username) {
        return seatRepository.getSeatByUsername(username);
    }*/

    public ArrayList<Seat> getAllSeats() {
        return seatRepository.getAll();
    }

    public double getTotal(int id) {
        SpectacleService spectacleService = SpectacleService.getInstance();
        Spectacle spectacle = spectacleService.getSpectacleById(id);
        double total = 0.0;
        ArrayList<Seat> seats = seatRepository.getAllByIdSpectacle(id);
        for(Seat seat : seats) {
            total += seat.getPrice() + seat.getSpectacle().getPrice();

        }
        return total;
    }

    /*public void removeSeatByClientId(int id) {
        seatRepository.removeSeatByClientId(id);
    }*/
}
