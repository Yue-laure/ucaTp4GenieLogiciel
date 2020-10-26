package GestionReservation;

import GestionVol.Vol;
import java.util.ArrayList;

public class Client {
    private String nom;
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public Client(String nom) {
        this.nom = nom;
    }


    public void reserve(Vol vol) {
        //Le client reserve pour lui meme
        new Reservation(this,vol);
    }
    public void reserve(Passager passager,Vol vol) {
        new Reservation(this,passager,vol);
    }
    public void reserve(String nomPassager,Vol vol) {
        new Reservation(this,new Passager(nomPassager),vol);
    }
    public void addReservation(Reservation reservation) {
        reservation.setClient(this);
        this.reservations.add(reservation);
    }
    public void addReservationFromReservationClass(Reservation reservation) {
        this.reservations.add(reservation);
    }


    //Getters
    public String getNom() {
        return nom;
    }


}