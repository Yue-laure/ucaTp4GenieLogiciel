package GestionReservation;

import GestionVol.Vol;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private static int next=0;
    private String numero;
    private ZonedDateTime date=null;
    private Passager passager;
    private Client client;
    private Vol vol;
    private static List<Reservation> reservations = new ArrayList<>();



    public Reservation(Client client,Passager passager,Vol vol) {
        next++;
        this.numero = String.valueOf(next);
        this.passager = passager;
        this.client = client;
        this.vol=vol;
        date=date.now(ZoneId.of("UTC"));
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
        this.vol=vol;
        date=date.now(ZoneId.of("UTC"));
        Reservation.reservations.add(this);
        client.addReservation(this);
    }


    //Getters & Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
        date=date.now(ZoneId.of("UTC"));
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

}
