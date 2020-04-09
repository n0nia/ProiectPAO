package service;

import model.Reservation;
import model.Seat;
import repositories.ReservationRepository;

public class ReservationService {

    private ReservationRepository reservationRepository = new ReservationRepository();
    private static ReservationService instance = new ReservationService();

    public static ReservationService getInstance() {
        return instance;
    }

    public void cancelReservationById(int id) {
        Reservation reservation = reservationRepository.getReservationById(id);
        if(reservation == null) {
            System.out.println("Reservation doesn't exist.\n");
        }
    }
}
