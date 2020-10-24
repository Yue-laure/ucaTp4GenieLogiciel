package GestionVol;

import java.util.ArrayList;
import java.util.List;

public class Compagnie {
    private String nom;
    private List<Vol> vols = new ArrayList<>();


    public Compagnie(String nom, List<Vol> vols) {
        this.nom = nom;
        this.vols = vols;
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

    public List<Vol> getVols() {
        return vols;
    }

    public void setVols(List<Vol> vols) {
        this.vols = vols;
        for (Vol vol: vols) {
            vol.setCompagnie(this);
        }
    }

    public void addVol(Vol vol) {
        this.vols.add(vol);
        vol.setCompagnie(this);
    }

    @Override
    public String toString() {
        return nom ;
    }
}
