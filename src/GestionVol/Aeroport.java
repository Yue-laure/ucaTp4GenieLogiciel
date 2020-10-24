package GestionVol;

import java.util.ArrayList;
import java.util.List;

public class Aeroport {
    private String nom;
    private Ville ville;
    public List<Ville> dessert = new ArrayList<Ville>();
    
    public Aeroport(String nom, Ville ville){
        this.nom = nom;
        this.ville=ville;
    }

    //Getters & Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

}
