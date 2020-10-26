package GestionReservation;

import GestionVol.Vol;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private static int next=0;
    private String numero;
    private ZonedDateTime date=null;
    private Passager passager;
    private Client client;
    private Vol vol;
    private boolean confirmation=false;
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes


    public Reservation(Client client,Passager passager,Vol vol) {
        next++;
        this.numero = String.valueOf(next);
        this.passager = passager;
        this.client = client;
        this.vol=vol;
<<<<<<< Updated upstream
        date=ZonedDateTime.now(ZoneId.of("UTC"));
        client.addReservationFromReservationClass(this);
        passager.addReservationFromReservationClass(this);
        vol.addReservationFromReservationClass(this);
=======
        date=date.now(ZoneId.of("UTC"));
        client.addReservation(this);
        vol.addReservation(this);
>>>>>>> Stashed changes
    }
    public Reservation(Client client,Vol vol) {
        //le client reserve pour lui meme
        next++;
        this.numero = String.valueOf(next);
        this.client = client;
        Passager pasager=new Passager(client.getNom());
        this.passager = pasager;
        this.vol=vol;
<<<<<<< Updated upstream
        date=ZonedDateTime.now(ZoneId.of("UTC"));
        client.addReservationFromReservationClass(this);
        pasager.addReservationFromReservationClass(this);
        vol.addReservationFromReservationClass(this);
=======
        date=date.now(ZoneId.of("UTC"));
        client.addReservation(this);
>>>>>>> Stashed changes
    }

	public String afficher() {
        if (client.getNom().equals(passager.getNom())){
            return "reservation de "+this.client.getNom()+" pour lui meme" ;
        }
        return "reservation de "+this.client.getNom()+" pour "+this.passager.getNom() ;
    }
    public void confirmer() {
        setConfirmation(true);
    }
    public void annuler() {
        //jeter l'instance
    }
    public boolean isConfirmed() {
        return confirmation;
    }
    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
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
    public void setClient(Client client) {
        this.client=client;
    }
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}


}

