package GestionVol;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Ville {
    private String nom;
    private ArrayList<Aeroport> aeroports=new ArrayList<>();

    
	public Ville(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}


	public void ajouterAeroport(Aeroport aeroport) {
		this.aeroports.add(aeroport);

	}
	public void ajouterAeroport(String nom) {
		Aeroport aeroport = new Aeroport(nom,this);
		this.aeroports.add(aeroport);

	}


}
