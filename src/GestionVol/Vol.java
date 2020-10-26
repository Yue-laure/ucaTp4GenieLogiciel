package GestionVol;

import GestionReservation.Reservation;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Vol {
    private String numero;
    private Compagnie compagnie=null;
    private EtatVol etatVol;

    private Aeroport depart;
    private Aeroport arrivee;

    private ZonedDateTime date_depart;
    private ZonedDateTime date_arrivee;

    private ArrayList<Escale> escales = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();


    public Vol( Compagnie compagnie,String numero, ZonedDateTime date_depart, ZonedDateTime date_arrivee, Aeroport depart, Aeroport arrivee) {
        this.numero = numero;
        this.compagnie = compagnie;
        this.date_depart = date_depart;
        this.date_arrivee = date_arrivee;
        this.depart = depart;
        this.arrivee = arrivee;
        setEtatVol(EtatVol.AHEURE);//Vol par defaut AHEURE
        compagnie.addVolFromVolClass(this);
    }
    public Vol( Compagnie compagnie,String numero, ZonedDateTime date_depart, ZonedDateTime date_arrivee, Aeroport depart, Aeroport arrivee,ArrayList<Escale> escales) {
        this.numero = numero;
        this.compagnie = compagnie;
        this.date_depart = date_depart;
        this.date_arrivee = date_arrivee;
        this.depart = depart;
        this.arrivee = arrivee;
        this.escales=escales;
        setEtatVol(EtatVol.AHEURE);//Vol par defaut AHEURE
        compagnie.addVolFromVolClass(this);
    }
    /*
    public Vol(Compagnie compagnie,String numero) {
        this.numero = numero;
        this.compagnie = compagnie;
        compagnie.addVolFromVolClass(this);
    }
    public Vol(Compagnie compagnie) {
        this.compagnie = compagnie;
        compagnie.addVolFromVolClass(this);
    }
    public Vol(String numero) {
    	this.numero = numero;
    }
    public Vol() {}
    */

    public void addEscale(ZonedDateTime date_atterrissage,Aeroport aeroport, ZonedDateTime date_decollage) {
        Escale esc=new Escale(this, date_atterrissage, aeroport, date_decollage);

    }
    public void addEscale(Escale e) {
        e.setVol(this);
        this.escales.add(e);
    }
    public void addEscalefromEscaleClass(Escale e) {
        this.escales.add(e);
    }
    public void addReservation(Reservation res) {
        res.setVol(this);
        this.reservations.add(res);
    }
    public void addReservationFromReservationClass(Reservation res) {
        this.reservations.add(res);
    }


    public enum EtatVol {
        ANNULE,
        RETARDE,
        ARCHIVE,
        AHEURE;
    }

    //Getters & Setters
    /*
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
    */

    public ArrayList<Escale> getEscales() {
        return escales;
    }

    /*
        public ArrayList<Reservation> getReservations() {
            return reservations;
        }

        public void setReservations(ArrayList<Reservation> reservations) {
            this.reservations = reservations;
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
        public EtatVol getEtatVol() {
            return etatVol;
        }
        */
	public void setEtatVol(EtatVol etatVol) {
		this.etatVol = etatVol;
	}
    public void afficher() {
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
	    System.out.println("Vol de "+this.depart.getNom()+" "+this.date_depart.format(formatter)+
                            "\nvers "+this.arrivee.getNom()+" "+this.date_arrivee.format(formatter)
        );
        for (Escale e:this.escales)
        { System.out.println( e.afficher() );}
        System.out.println(this.etatVol.toString());
        for (Reservation r:this.reservations)
        { System.out.println( r.afficher() );}
}
    @Override
    public String toString() {
        return "Vol de " + compagnie+
                " numero " + numero;
    }
    public void setCompagnieFromCompagnieClass(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

}