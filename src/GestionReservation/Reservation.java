package GestionReservation;

import java.util.Calendar;
import java.util.Date;

public class Reservation {
	private int numero;
	private Date date;
	private Vol vol; 
	private boolean etat;
	
	public Reservation(int n,Vol v)
	 { date=Calendar.getInstance().getTime();
	   numero=n;
	   vol=v;
	   etat=false;
	} 
	public void confirmer()
	 {etat=true;}
	
	 void annuler() {	 
	 }
	  
	} 



