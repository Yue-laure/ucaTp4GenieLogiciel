package GestionVol;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Escale {
    private ZonedDateTime date_atterrissage;
    private ZonedDateTime date_decollage;
    private Aeroport aeroport;
    private Vol vol;

    public Escale(ZonedDateTime date_atterrissage, ZonedDateTime date_decollage, Aeroport aeroport,Vol vol) {
        this.date_atterrissage = date_atterrissage;
        this.date_decollage = date_decollage;
        this.aeroport = aeroport;
        this.vol=vol;
    }

    //Getters
    public String getDate_atterrissage() {
        if (date_atterrissage!=null) {
            DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
            return date_atterrissage.format(formatter);
        }
        return null;
    }

    public String getDate_decollage() {
        if (date_decollage!=null) {
            DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
            return date_decollage.format(formatter);
        }
        return null;
    }

    public Aeroport getAeroport() {
        return aeroport;
    }
}
