package GestionVol;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import GestionReservation.Reservation;

public class Trajet {
	private Aeroport aeroport_dpart;
	private Aeroport aeroport_arrivee;
	private ArrayList<Escale> escales = new ArrayList<>();
	private Duration date_depart= Duration.ofMinutes(0);
	private Duration date_arrivee;

	
	public Trajet(Aeroport aeroport_dpart, Aeroport aeroport_arrivee, Duration date_depart,
			Duration date_arrivee) {
		super();
		this.aeroport_dpart = aeroport_dpart;
		this.aeroport_arrivee = aeroport_arrivee;
		this.date_depart = date_depart;
		this.date_arrivee = date_arrivee;
	}

	public Trajet(Aeroport aeroport_dpart, Aeroport aeroport_arrivee, ArrayList<Escale> escales,
			Duration date_depart, Duration date_arrivee) {
		super();
		this.aeroport_dpart = aeroport_dpart;
		this.aeroport_arrivee = aeroport_arrivee;
		this.escales = escales;
		this.date_depart = date_depart;
		this.date_arrivee = date_arrivee;
	}
	
	public Aeroport getAeroport_dpart() {
		return aeroport_dpart;
	}
	public void setAeroport_dpart(Aeroport aeroport_dpart) {
		this.aeroport_dpart = aeroport_dpart;
	}
	public Aeroport getAeroport_arrivee() {
		return aeroport_arrivee;
	}
	public void setAeroport_arrivee(Aeroport aeroport_arrivee) {
		this.aeroport_arrivee = aeroport_arrivee;
	}
	public ArrayList<Escale> getEscales() {
		return escales;
	}
	public void setEscales(ArrayList<Escale> escales) {
		this.escales = escales;
	}
	public Duration getDate_depart() {
		return date_depart;
	}
	public void setDate_depart(Duration date_depart) {
		this.date_depart = date_depart;
	}
	public Duration getDate_arrivee() {
		return date_arrivee;
	}
	public void setDate_arrivee(Duration date_arrivee) {
		this.date_arrivee = date_arrivee;
	}
	
	
	
	
    public void addEscale(ZonedDateTime date_atterrissage,Aeroport aeroport, ZonedDateTime date_decollage) {
    //****    Escale esc=new Escale(this, date_atterrissage, aeroport, date_decollage);

    }
    public void addEscale(Escale e) {
        e.setTrajet(this);
        this.escales.add(e);
    }
    public void addEscalefromEscaleClass(Escale e) {
        this.escales.add(e);
    }
//    public void afficher() {
//        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
//	    System.out.println("Vol de "+this.depart.getNom()+" "+this.date_depart.format(formatter)+
//                            "\nvers "+this.arrivee.getNom()+" "+this.date_arrivee.format(formatter)
//        );
//        for (Escale e:this.escales)
//        { System.out.println( e.afficher() );}
//        System.out.println(this.etatVol.toString());
//        for (Reservation r:this.reservations)
//        { System.out.println( r.afficher() );}
//}

	
	
	
	
	
	
	
	
	
}
