package aeroport;

public class Aeroport {
	private String nom;
    public Ville ville;
    public List<Ville> dessert = new ArrayList<Ville>();

    public Aeroport(String nom, Ville ville){
        this.nom = nom;
        this.ville=ville;
        this.ville.add_aeroport(this);
    }

}
