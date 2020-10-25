package GestionReservation;

import GestionVol.Vol;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;
    private List<Reservation> reservations = new ArrayList<>();

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
    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }


    //Getters
    public String getNom() {
        return nom;
    }


}