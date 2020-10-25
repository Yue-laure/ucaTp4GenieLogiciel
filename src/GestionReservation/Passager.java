package GestionReservation;

import java.util.ArrayList;
import java.util.List;

public class Passager {
    private String nom;
    private List<Reservation> reservations = new ArrayList<>();
    public Passager(String nom) {
        this.nom = nom;
    }

    //Getters
    public String getNom() {
        return nom;
    }
}