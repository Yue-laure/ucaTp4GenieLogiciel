package GestionVol;

import java.util.ArrayList;
import java.util.List;

public class Compagnie {
    private String nom;
    private List<Vol> propose_vol= new ArrayList<>();


    public Compagnie(String nom, List<Vol> vols) {
        this.nom = nom;
        this.setPropose_vol(vols);
    }
    public Compagnie(String nom) {
        this.nom = nom;
    }
    public Compagnie() {}


    //Getters & Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public List<Vol> getPropose_vol() {
		return propose_vol;
	}
	public void setPropose_vol(List<Vol> propose_vol) {
		this.propose_vol = propose_vol;
	}
	//
    public void addVol(Vol vol) {
        this.propose_vol.add(vol);
        vol.setCompagnieFromCompagnieClass(this);
    }
    public void addVolFromVolClass(Vol vol) {
        this.propose_vol.add(vol);
    }

    @Override
    public String toString() {
        return nom ;
    }
	
}
