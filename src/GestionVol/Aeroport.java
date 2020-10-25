package GestionVol;

import java.util.ArrayList;
import java.util.List;

public  class Aeroport implements Comparable<Aeroport> {
    private String nom;
    
    private Ville ville;
    private List<Escale> escales = new ArrayList<Escale>();
    
    public Aeroport(String nom, Ville ville){
        this.setNom(nom);
        this.setVille(ville);

    }
    public Aeroport(String nom) {
    	this.setNom(nom);
	}
	public int compareTo(Aeroport aeroport) {//ordered
		return 0;}
    
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
	void afficher() {
		 
		 } 
}
