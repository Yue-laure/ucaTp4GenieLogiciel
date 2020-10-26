package GestionVol;


import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Escale {
    private Duration date_atterrissage;
    private Duration date_decollage;
    private Aeroport aeroport;

    private boolean exists=false;

    private Trajet trajet;

    public  Escale(Trajet trajet,Duration date_atterrissage,Aeroport aeroport,Duration date_decollage)
    {
        this.vol=vol;
        this.aeroport=aeroport;
        this.date_atterrissage=date_atterrissage;
        this.date_decollage=date_decollage;
        if (vol.getEscales().isEmpty()){
            vol.addEscalefromEscaleClass(this);
            this.exists=true;
        }
        else{
            for (Escale e:vol.getEscales()) {
                if(!(
                        e.date_atterrissage.toString().equals(this.date_atterrissage.toString())
                        && e.date_decollage.toString().equals(this.date_decollage.toString())
                        && e.aeroport.getNom().equals(this.aeroport.getNom())
                )) {
                    this.exists=true;
                }
            }
            if (exists){
                vol.addEscalefromEscaleClass(this);
            }
        }
/*
	  this.trajet=trajet;
	  trajet.addEscalefromEscaleClass(this);
	  this.aeroport=aeroport;
      this.date_atterrissage=date_atterrissage;
      this.date_decollage=date_decollage;
    }
*/
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
	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escale escale = (Escale) o;
        return Objects.equals(date_atterrissage, escale.date_atterrissage) &&
                Objects.equals(date_decollage, escale.date_decollage) &&
                Objects.equals(aeroport, escale.aeroport) &&
                Objects.equals(vol, escale.vol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date_atterrissage, date_decollage, aeroport, trajet);
    }

// ****   public String afficher() {
// ***       DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
// ***    return "escale en "+this.aeroport.getNom()+" de "+this.date_atterrissage.format(formatter)+" a "+this.date_decollage.format(formatter);
//	}


}



