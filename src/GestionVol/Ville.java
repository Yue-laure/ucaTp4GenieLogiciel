package GestionVol;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Ville {
    private String nom;
    private Vector<Aeroport> aeroports=new Vector<Aeroport>(); 
    
    
	public Ville(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Vector<Aeroport> getAeroports() {
		return aeroports;
	}
	public void setAeroports(Vector<Aeroport> aeroports) {
		this.aeroports = aeroports;
	}
	public void ajouterAeroport(Aeroport vol) {
		this.aeroports.add(vol);
		
	}
	public void ajouterAeroport(String nom) {
		Aeroport aeroport = new Aeroport(nom);
		this.aeroports.add(aeroport);
		
	}
	

}
