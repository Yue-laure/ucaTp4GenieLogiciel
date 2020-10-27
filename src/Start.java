import GestionReservation.Client;
import GestionReservation.Passager;
import GestionVol.*;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Start {
    public static void main(String[] args) {
        Compagnie AF = new Compagnie("AIR FRANCE");
        Compagnie RAM = new Compagnie("Royal Air Maroc");
        Compagnie AC=new Compagnie("AIR CHINA");

        Ville casablanca=new Ville("Casablanca");   //Mohammed V
        Ville paris=new Ville("Paris");             //Paris Charles de Gaulle
        Ville pekin=new Ville("Pekin");             //Pekin Daxing

        Aeroport CMN=new Aeroport("CMN",casablanca);
        Aeroport CDG=new Aeroport("CDG",paris);
        Aeroport PKX=new Aeroport("PKX",pekin);


        Duration dureeDepart =Duration.ofMinutes(0);
        Duration dureeArrivee =Duration.ofHours(2);
        Trajet casa_pekin=new Trajet(CMN,PKX,dureeDepart,dureeArrivee);

        ZonedDateTime dd=ZonedDateTime.of(2020, 01, 01, 07, 30, 0, 0, ZoneId.of("UTC"));
        ZonedDateTime da=ZonedDateTime.of(2020, 01, 01, 13, 30, 0, 0, ZoneId.of("UTC"));
        ZonedDateTime dd2=ZonedDateTime.of(2020, 02, 01, 07, 30, 0, 0, ZoneId.of("UTC"));
        ZonedDateTime da2=ZonedDateTime.of(2020, 02, 01, 13, 30, 0, 0, ZoneId.of("UTC"));
        Vol vol = new Vol(AF,"1",dd,da,casa_pekin);
        Vol volRegulier = new Vol(AF,"2",dd2,da2,casa_pekin);


        Duration dea=Duration.ofHours(3);
        Duration ded=Duration.ofHours(4);
        // On ajoute differentes instances du meme escale pour tester l uniciter
        casa_pekin.addEscale(dea,CDG,ded);
        casa_pekin.addEscale(dea,CDG,ded);
        Escale escaleParis=new Escale(casa_pekin,dea,CDG,ded);

        Client ayoub =new Client("Ayoub");
        Passager yue =new Passager("Yue");


        System.out.println("Un Client AYOUB reserve pour lui et pour un passager YUE un vol vers Pekin de Casablanca");
        System.out.println("AYOUB reserve pour un autre Passager IMANE le meme vol mais du mois prochain pour qu elle  puisse les rejoindre");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");

        //Reservation reservation1=new Reservation(ayoub,vol);
        //Reservation reservation2=new Reservation(ayoub,yue,vol);
        ayoub.reserve(vol);
        ayoub.reserve(yue,vol);


        volRegulier.setEtatVol(Vol.EtatVol.RETARDE);
        ayoub.reserve("Imane",volRegulier);


        vol.afficher();
        System.out.println("------------------------------------------");
        volRegulier.afficher();





        System.out.println("hey Yue <3 :)");



    }
}
