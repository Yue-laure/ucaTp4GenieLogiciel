import GestionVol.Aeroport;
import GestionVol.Compagnie;
import GestionVol.Ville;
import GestionVol.Vol;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import GestionReservation.Reservation;

public class Start {
    public static void main(String[] args) {
        Compagnie AF = new Compagnie("AIR FRANCE");
        Compagnie RAM = new Compagnie("Royal Air Maroc");
        Compagnie AA=new Compagnie("airAlgérie");
        ZonedDateTime dd1=ZonedDateTime.of(2020, 01, 01, 10, 30, 0, 0, ZoneId.of("UTC"));
        ZonedDateTime da1=ZonedDateTime.of(2020, 01, 01, 13, 30, 0, 0, ZoneId.of("UTC"));
        Ville ville1=new Ville("Oran");
        Ville ville2=new Ville("Constantine");
        Ville ville3=new Ville("Alger");
        ville1.ajouterAeroport("ahmed BenBella");
        ville2.ajouterAeroport("Mohamed Boudiaf");
        ville3.ajouterAeroport("Boulmediane");
        Aeroport CMN=new Aeroport("CMN",new Ville("Casablanca"));
        Aeroport CDG=new Aeroport("CDG",new Ville("Paris"));
        Vol vol1 = new Vol(AF,"1",dd1,da1,CMN,CDG);
        Vol vol2 = new Vol(AF,"2");
        Vol vol3 = new Vol(RAM,"1");
        Aeroport aeroport1;
        Aeroport aeroport2;
        
        aeroport1=ville1.getAeroports().get(0);// le premier aeroport de la ville Oran
        aeroport2=ville2.getAeroports().get(0);// le premier aeroport de constantine 
        Vol vol = new Vol(AA,dd1,da1,aeroport1,aeroport2);
        vol.ajouterEscale(ville3.getAeroports().get(0),1,dd1,da1); //les declarer avant, 
        vol.afficher();
        vol.reserver("12");
        vol.reserver("13"); 
        vol.afficher();
        vol.getReservations().get(1).confirmer();
        
        //Reservation res=new Reservation();
        
        System.out.println("hey Yue <3 :)");

       /* System.out.println("VOL");
        System.out.println("vol a :"+vol1.getDate_depart());


        System.out.println("DOUBLE NAVIGABILITE");
        System.out.println("les vols de AF: "+ AF.getPropose_vol());
        System.out.println("les vols de RAM: "+ RAM.getPropose_vol());
        System.out.println("la compagnie du vol1: "+ vol1.getCompagnie());
        System.out.println("la compagnie du vol2: "+ vol2.getCompagnie());
        System.out.println("la compagnie du vol3: "+ vol3.getCompagnie());


        System.out.println("RESERVATION");
        System.out.println("reservation "+res.getNumero()+" a : "+res.getDate());
        */

    }
}
