import GestionVol.Compagnie;
import GestionVol.Vol;

public class Start {
    public static void main(String[] args) {
        Compagnie AF = new Compagnie("AIR FRANCE");
        Compagnie RAM = new Compagnie("Royal Air Maroc");
        Vol vol1 = new Vol(AF,"1");
        Vol vol2 = new Vol(AF,"2");
        Vol vol3 = new Vol(RAM,"1");

        System.out.println("DOUBLE NAVIGABILITE");
        System.out.println("les vols de AF: "+ AF.getVols());
        System.out.println("les vols de RAM: "+ RAM.getVols());
        System.out.println("la compagnie du vol1: "+ vol1.getCompagnie());
        System.out.println("la compagnie du vol2: "+ vol2.getCompagnie());
        System.out.println("la compagnie du vol3: "+ vol3.getCompagnie());

    }
}
