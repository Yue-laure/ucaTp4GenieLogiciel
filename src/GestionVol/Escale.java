package GestionVol;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Escale {
    private ZonedDateTime date_atterrissage;
    private ZonedDateTime date_decollage;
    private Aeroport aeroport;
    private Vol vol;

    public  Escale(Vol vol,ZonedDateTime date_atterrissage,Aeroport aeroport,ZonedDateTime date_decollage)
    {
	  this.vol=vol;
	  vol.addEscalefromEscaleClass(this);
	  this.aeroport=aeroport;
      this.date_atterrissage=date_atterrissage;
      this.date_decollage=date_decollage;
    }
/*
	public Aeroport getAeroport() {
		return aeroport;
	}
	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	public Vol getVol() {
		return vol;
	}
	*/
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	/*
	public int getDuree() {
    	// la duree est calculer a partir du decollage-atterrissage
		// attribue derivé .. pas besoin de l'ajouter comme attribut
		return 0;
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
*/

    @Override
    public int hashCode() {
        return Objects.hash(date_atterrissage, date_decollage, aeroport, vol);
    }

    public String afficher() {
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
        return "escale en "+this.aeroport.getNom()+" de "+this.date_atterrissage.format(formatter)+" a "+this.date_decollage.format(formatter);
	}


}



