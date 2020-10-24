package GestionVol;


import GestionReservation.Reservation;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Vol {
    private String numero;
    private Compagnie compagnie=null;
    private ZonedDateTime date_depart;
    private ZonedDateTime date_arrivee;
    private Aeroport depart;
    private Aeroport arrivee;
    private HashMap<Integer, Escale> escales = new HashMap<>();
    private List<Reservation> reservations = new ArrayList<>();


    public Vol( Compagnie compagnie,String numero, ZonedDateTime date_depart, ZonedDateTime date_arrivee, Aeroport depart, Aeroport arrivee, HashMap<Integer, Escale> escales) {
        this.numero = numero;
        this.compagnie = compagnie;
        this.date_depart = date_depart;
        this.date_arrivee = date_arrivee;
        this.depart = depart;
        this.arrivee = arrivee;
        this.escales = escales;
        compagnie.addVolFromVolClass(this);

    }
    public Vol( Compagnie compagnie,String numero, ZonedDateTime date_depart, ZonedDateTime date_arrivee, Aeroport depart, Aeroport arrivee) {
        this.numero = numero;
        this.compagnie = compagnie;
        this.date_depart = date_depart;
        this.date_arrivee = date_arrivee;
        this.depart = depart;
        this.arrivee = arrivee;
        compagnie.addVolFromVolClass(this);

    }
    public Vol(Compagnie compagnie,String numero) {
        this.numero = numero;
        this.compagnie = compagnie;
        compagnie.addVolFromVolClass(this);
    }
    public Vol(Compagnie compagnie) {
        this.compagnie = compagnie;
        compagnie.addVolFromVolClass(this);
    }
    public Vol() {}


    //methods navigabilite

    public void addReservation(Reservation res) {
        this.reservations.add(res);
        //res.setCompagnieFromCompagnieClass(this);
    }
    /*public void addReservationFromReservationClass(Reservation res) {
        this.reservations.add(res);
    }*/




    //Getters & Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Compagnie getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(Compagnie compagnie) {
        this.compagnie = compagnie;
        compagnie.addVolFromVolClass(this);
    }
    public void setCompagnieFromCompagnieClass(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

    public HashMap<Integer, Escale> getEscales() {
        return escales;
    }

    public void setEscales(HashMap<Integer, Escale> escales) {
        this.escales = escales;
    }

    public String getDate_depart() {
        if (date_depart!=null) {
            DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
            return date_depart.format(formatter);
        }
        return null;
    }

    public void setDate_depart(ZonedDateTime date_depart) {
        this.date_depart = date_depart;
    }

    public String getDate_arrivee() {
        if (date_arrivee!=null) {
            DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
            return date_arrivee.format(formatter);
        }
        return null;
    }

    public void setDate_arrivee(ZonedDateTime date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public Aeroport getDepart() {
        return depart;
    }

    public void setDepart(Aeroport depart) {
        this.depart = depart;
    }

    public Aeroport getArrivee() {
        return arrivee;
    }

    public void setArrivee(Aeroport arrivee) {
        this.arrivee = arrivee;
    }

    @Override
    public String toString() {
        return "Vol de " + compagnie+
                " numero " + numero;
    }
}
