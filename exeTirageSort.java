package livre;

import java.util.Random;

public class exeTirageSort {
	public static void main(String[] args) {
		
		int nombreTantative=0;
		int nb1, nb2,nb3;
		  
		
		Random rd = new Random();
		do {
			nb1=rd.nextInt(1000);
			nb2=rd.nextInt(1000);
			nb3=rd.nextInt(1000);
			
			nombreTantative++;
			System.out.println("nombre 1 :"+nb1+ "nombre 2 :"+nb2+  "nombre 3 :"+nb3 )  ;
		}while(nb1 % 2==1 ⎮⎮ nb2% 2==1   && nb3 % 2==0 );
		
		
		System.out.println(" resultat obtenu en "+ nombreTantative + " essais");
		
		
	}

}
