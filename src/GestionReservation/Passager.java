package GestionReservation;

import java.util.ArrayList;


public class Passager {
    private String nom;
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public Passager(String nom) {
        this.nom = nom;
    }
    public void addReservationFromReservationClass(Reservation reservation) {
        this.reservations.add(reservation);
    }
    //Getters
    public String getNom() {
        return nom;
    }
}