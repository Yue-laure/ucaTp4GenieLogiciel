package GestionVol;

import java.time.ZonedDateTime;

public class Escale {
    private ZonedDateTime date_atterrissage;
    private ZonedDateTime date_decollage;
    private Aeroport aeroport;
    private Vol vol;
    private int duree ; 
    
    public Escale(Aeroport aeroport,int duree ,ZonedDateTime date_atterrissage,ZonedDateTime date_decollage)
    { this.aeroport=aeroport;
      this.setDuree(duree);
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
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public ZonedDateTime getDate_decollage() {
		return date_decollage;
	}
	public void setDate_decollage(ZonedDateTime date_decollage) {
		this.date_decollage = date_decollage;
	}
	public ZonedDateTime getDate_atterrissage() {
		return date_atterrissage;
	}
	public void setDate_atterrissage(ZonedDateTime date_atterrissage) {
		this.date_atterrissage = date_atterrissage;
	}
}
