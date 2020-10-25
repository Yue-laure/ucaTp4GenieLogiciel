package GestionReservation;

import GestionVol.Vol;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Reservation {
    private static int next=0;
    private String numero;
    private ZonedDateTime date=null;
    private Passager passager;
    private Client client;
    private Vol vol;
    private boolean  etatRes=false;
    private static List<Reservation> reservations = new ArrayList<>();



    public Reservation(Client client,Passager passager,Vol vol) {
        next++;
        this.numero = String.valueOf(next);
        this.passager = passager;
        this.client = client;
        this.setVol(vol);
        date=ZonedDateTime.now(ZoneId.of("UTC"));
        Reservation.reservations.add(this);
        client.addReservation(this);
        vol.addReservation(this);
    }
    public Reservation(Client client,Vol vol) {
        //le client reserve pour lui meme
        next++;
        this.numero = String.valueOf(next);
        this.client = client;
        this.passager = new Passager(client.getNom());
        this.setVol(vol);
        date=ZonedDateTime.now(ZoneId.of("UTC"));
        Reservation.reservations.add(this);
        client.addReservation(this);
    }
    public Reservation(String n,Vol v)
    { 
    	date=ZonedDateTime.now(ZoneId.of("UTC"));
    	numero=n;
    	setVol(v);
    	setEtatRes(false);
   } 
    public Reservation() {}
    public void confirmer() {
    	setEtatRes(true);
    }
	
	void annuler() {	
        //... 
	}

	public void afficher() {
		 // à remplir
		 } 
    //Getters & Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
        date=ZonedDateTime.now(ZoneId.of("UTC"));
    }

    public String getDate() {
        if (date!=null) {
            DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
            return date.format(formatter);
        }
        return null;
    }

    public Passager getPassager() {
        return passager;
    }

    public Client getClient() {
        return client;
    }
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	public boolean isEtatRes() {
		return etatRes;
	}
	public void setEtatRes(boolean etatRes) {
		this.etatRes = etatRes;
	}
    
}

