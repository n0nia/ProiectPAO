package repositories;

import model.Reservation;

import java.util.ArrayList;

public class ReservationRepository {

    private ArrayList<Reservation> reservations;

    public ReservationRepository() {
        reservations = new ArrayList<>();
    }

    public void add(Reservation reservation) {
        reservations.add(reservation);
    }

    public Reservation getReservationById(int id) {
        for(Reservation reservation : reservations) {
            if(reservation.getId() == id) {
                return reservation;
            }
        }
        return null;
    }

    public ArrayList<Reservation> getAllByUsernameClient(String username) {
        ArrayList<Reservation> nrreservations = new ArrayList<>();
        for(Reservation reservation : reservations) {
            if(reservation.getClient().getUsername().equals(username)) {
                nrreservations.add(reservation);
            }
        }
        return nrreservations;
    }

    public ArrayList<Reservation> getAllByIdSpectacle(int id) {
        ArrayList<Reservation> nrreservations = new ArrayList<>();

        for(Reservation reservation : reservations) {
            if(reservation.getSpectacle().getId() == id){
                nrreservations.add(reservation);
            }
        }
        return nrreservations;
    }


    public ArrayList<Reservation> getAll() {
        return reservations;
    }

    public void remove(Reservation reservation) {
        reservations.remove(reservation);
    }

    public void show(Reservation reservation) {
        reservation.toString();
    }
}
