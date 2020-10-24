import GestionVol.Aeroport;
import GestionVol.Compagnie;
import GestionVol.Ville;
import GestionVol.Vol;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Start {
    public static void main(String[] args) {
        Compagnie AF = new Compagnie("AIR FRANCE");
        Compagnie RAM = new Compagnie("Royal Air Maroc");

        ZonedDateTime dd1=ZonedDateTime.of(2020, 01, 01, 10, 30, 0, 0, ZoneId.of("UTC"));
        ZonedDateTime da1=ZonedDateTime.of(2020, 01, 01, 13, 30, 0, 0, ZoneId.of("UTC"));

        Aeroport CMN=new Aeroport("CMN",new Ville("Casablanca"));
        Aeroport CDG=new Aeroport("CDG",new Ville("Paris"));

        Vol vol1 = new Vol(AF,"1",dd1,da1,CMN,CDG);
        Vol vol2 = new Vol(AF,"2");
        Vol vol3 = new Vol(RAM,"1");

        //Reservation res=new Reservation();
        System.out.println("hey Yue <3 :)");

        System.out.println("VOL");
        System.out.println("vol a :"+vol1.getDate_depart());

/*
        System.out.println("DOUBLE NAVIGABILITE");
        System.out.println("les vols de AF: "+ AF.getVols());
        System.out.println("les vols de RAM: "+ RAM.getVols());
        System.out.println("la compagnie du vol1: "+ vol1.getCompagnie());
        System.out.println("la compagnie du vol2: "+ vol2.getCompagnie());
        System.out.println("la compagnie du vol3: "+ vol3.getCompagnie());
*/

        System.out.println("RESERVATION");
        //System.out.println("reservation "+res.getNumero()+" a : "+res.getDate());

    }
}
