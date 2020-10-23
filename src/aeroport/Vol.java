package aeroport;

public class Vol {
    private String numero;
    private String id_compagnie;
    private ZonedDateTime date_depart;
    private ZonedDateTime date_arrivee;
    private Aeroport depart;
    private Aeroport arrivee;
    private ArrayList <Escale> escales = new ArrayList<Escale>();


}
