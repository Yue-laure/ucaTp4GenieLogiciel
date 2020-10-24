package GestionVol;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Escale {
    private ZonedDateTime date_atterrissage;
    private ZonedDateTime date_decollage;
    private Aeroport aeroport;
    private Vol vol;

    public Escale(Aeroport aeroport,int duree ,ZonedDateTime date_atterrissage,ZonedDateTime date_decollage,Vol vol) {
      this.aeroport=aeroport;
      this.vol=vol;
      this.setDate_atterrissage(date_atterrissage);
      this.setDate_decollage(date_decollage);
    } 
	public Aeroport getAeroport() {
		return aeroport;
	}
	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	public int getDuree() {
		// return decolage-atterrissage
        // a calculer plus tard
        return 0;
	}

	public String getDate_decollage() {
        if (date_decollage!=null) {
            DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
            return date_decollage.format(formatter);
        }
        return null;
	}
	public void setDate_decollage(ZonedDateTime date_decollage) {
		this.date_decollage = date_decollage;
	}
	public String getDate_atterrissage() {
        if (date_atterrissage!=null) {
            DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
            return date_atterrissage.format(formatter);
        }
        return null;
	}
	public void setDate_atterrissage(ZonedDateTime date_atterrissage) {
		this.date_atterrissage = date_atterrissage;
	}
/*	public enum EtatVol {
		 ANNULE,
		 RETARDE,
		 ARCHIVE,
		 AHEURE;
		}
*/
}

