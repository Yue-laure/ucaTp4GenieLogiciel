package GestionVol;


import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Vol {
    private String numero;
    private Compagnie compagnie=null;
    private ZonedDateTime date_depart;
    private ZonedDateTime date_arrivee;
    private Aeroport depart;
    private Aeroport arrivee;
    private HashMap<Integer, Escale> escales = new HashMap<>();


    public Vol( Compagnie compagnie,String numero, ZonedDateTime date_depart, ZonedDateTime date_arrivee, Aeroport depart, Aeroport arrivee, HashMap<Integer, Escale> escales) {
        this.numero = numero;
        this.compagnie = compagnie;
        this.date_depart = date_depart;
        this.date_arrivee = date_arrivee;
        this.depart = depart;
        this.arrivee = arrivee;
        this.escales = escales;
        compagnie.addVol(this);

    }
    public Vol( Compagnie compagnie,String numero, ZonedDateTime date_depart, ZonedDateTime date_arrivee, Aeroport depart, Aeroport arrivee) {
        this.numero = numero;
        this.compagnie = compagnie;
        this.date_depart = date_depart;
        this.date_arrivee = date_arrivee;
        this.depart = depart;
        this.arrivee = arrivee;
        compagnie.addVol(this);

    }
    public Vol(Compagnie compagnie,String numero) {
        this.numero = numero;
        this.compagnie = compagnie;
        compagnie.addVol(this);
    }
    public Vol(Compagnie compagnie) {
        this.compagnie = compagnie;
        compagnie.addVol(this);
    }
    public Vol() {}

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
        compagnie.addVol(this);
    }

    public HashMap<Integer, Escale> getEscales() {
        return escales;
    }

    public void setEscales(HashMap<Integer, Escale> escales) {
        this.escales = escales;
    }

    public ZonedDateTime getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(ZonedDateTime date_depart) {
        this.date_depart = date_depart;
    }

    public ZonedDateTime getDate_arrivee() {
        return date_arrivee;
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
