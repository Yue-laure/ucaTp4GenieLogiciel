import GestionReservation.Client;
import GestionReservation.Passager;
import GestionReservation.Reservation;
import GestionVol.*;

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


        ZonedDateTime dd=ZonedDateTime.of(2020, 01, 01, 07, 30, 0, 0, ZoneId.of("UTC"));
        ZonedDateTime dea=ZonedDateTime.of(2020, 01, 01, 10, 30, 0, 0, ZoneId.of("UTC"));
        ZonedDateTime ded=ZonedDateTime.of(2020, 01, 01, 11, 30, 0, 0, ZoneId.of("UTC"));
        ZonedDateTime da=ZonedDateTime.of(2020, 01, 01, 13, 30, 0, 0, ZoneId.of("UTC"));

        Vol vol = new Vol(AF,"1",dd,da,CMN,PKX);

        //vol.addEscale(dea,CDG,ded);
        Escale escaleParis=new Escale(vol,dea,CDG,ded);

        Client ayoub =new Client("ayoub");
        Passager yue =new Passager("Yue");

        //Reservation reservation1=new Reservation(ayoub,vol);
        //Reservation reservation2=new Reservation(ayoub,yue,vol);
        ayoub.reserve(vol);
        ayoub.reserve(yue,vol);
        //ayoub.reserve("yue",vol);


        vol.afficher();

        
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
