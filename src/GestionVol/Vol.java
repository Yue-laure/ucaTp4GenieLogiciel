package GestionVol;


import GestionReservation.Reservation;
import GestionVol.Escale.EtatVol;

import java.sql.Date;
import java.sql.Time;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Vol {
    private String numero;
    private Compagnie compagnie=null;
    private ZonedDateTime date_depart;
    private ZonedDateTime date_arrivee;
    
    private Aeroport depart;
    private Aeroport arrivee;
    private Set<Aeroport> escales = new TreeSet<Aeroport>();
    private Vector<Reservation>reservations;
    
    private EtatVol etatVol; 

    public Vol(Compagnie compagnie, ZonedDateTime date_depart, ZonedDateTime date_arrivee, Aeroport depart, Aeroport arrivee) {
    	this.compagnie=compagnie;
        this.date_depart = date_depart;
        this.date_arrivee = date_arrivee;
        this.depart = depart;
        this.arrivee = arrivee;
        escales =new TreeSet<Aeroport>();
        reservations=new Vector<Reservation>(); 
        setEtatVol(EtatVol.AHEURE);//constante AHEURE de l'ensemble <enum> 
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
    public Vol(String numero) {
    	this.numero = numero;
    }
    public Vol() {}
    
    public Vol(Compagnie c1, Date d1, Date d12, Time t1, Time t2, Aeroport aeroport1, Aeroport aeroport2) {
		// TODO Auto-generated constructor stub
	}

	public void ajouterEscale(Aeroport aeroport,int duree ,ZonedDateTime date_depart, ZonedDateTime date_arrivee) {
    	Escale e=new Escale(aeroport,duree,date_depart,date_arrivee);
    	escales.add(e.getAeroport()); 
   }

	//methods navigabilite

    public void addReservation(Reservation res) {
        this.reservations.add(res);
        //res.setCompagnieFromCompagnieClass(this);
    }
    /*public void addReservationFromReservationClass(Reservation res) {
        this.reservations.add(res);
    }*/
	public void afficher()
	{ System.out.println(" "+this.depart.getNom()+
	 " "+this.date_arrivee+
	 " "+this.arrivee.getNom()+
	 		// ajouter les autres champs
	 " "+this.etatVol.toString()//print peut imprimer l'objet
				);
		for (Aeroport e:this.escales)
			{ e.afficher();}
		for (Reservation r:this.reservations)
			{ r.afficher(); }
	 }
	public void reserver(String i) {
	 {	Reservation r=new Reservation(i,this);// son vol est this
	 	this.reservations.add(r);
	 } 
	 }

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


    public Vector<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Vector<Reservation> reservations) {
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

	public void setEtatVol(EtatVol etatVol) {
		this.etatVol = etatVol;
	}

    @Override
    public String toString() {
        return "Vol de " + compagnie+
                " numero " + numero;
    }


}