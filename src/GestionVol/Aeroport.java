package GestionVol;

import java.util.ArrayList;
import java.util.List;

public  class Aeroport {
    private String nom;
    private Ville ville;
    private List<Escale> escales = new ArrayList<Escale>();
    
    public Aeroport(String nom, Ville ville){
        this.nom=nom;
        this.ville=ville;

    }
	public boolean equals(Aeroport aeroport) {//unique
    	if (this.nom.equals(aeroport.nom)){ return true; }
		return false;}
    
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
	/*
	void afficher() {
		 
		 }
	 */
}
