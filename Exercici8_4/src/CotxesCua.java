/*
 * CotxeLinked.java        1.0 22/09/2015
 *
 * class CotxeLinked
 *
 * Copyright 2015 Jordi Llonch Neira <jordill14@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.LinkedList;
import java.util.PriorityQueue;


public class CotxesCua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Cotxe> car = new LinkedList<Cotxe>();
		
		Cotxe Alfa = new Cotxe("Alfa Romeo", "Giulia", 2900, 6);
		car.add(Alfa);
		Cotxe Dacia = new Cotxe("Dacia", "Sandero", 1200, 4);
		car.add(Dacia);
		Cotxe Ford = new Cotxe("Ford", "Focus", 2000, 4);
		car.add(Ford);
		Cotxe Opel = new Cotxe("Opel", "Insignia", 2200, 4);
		car.add(Opel);
		Cotxe ibiza = new Cotxe("Seat", "Ibiza", 1600, 4); 
		car.add(ibiza);
		Cotxe Audi = new Cotxe("Audi", "A8", 4600, 8);
		car.add(Audi);
		
		
		LinkedList<Cotxe> lifoAutos = (LinkedList) car.clone();
		LinkedList<Cotxe> fifoAutos = (LinkedList) car.clone();
		
		PriorityQueue<Cotxe> n = new PriorityQueue<Cotxe>();
		PriorityQueue<Cotxe> n2 = new PriorityQueue<Cotxe>();
		for(Cotxe s : car){
			n.offer(s);
			n2.offer(s);
			System.out.println(s + "\n");
		}
		 while(!n.isEmpty()){
			 System.out.println(n.poll().toString()+"\n");
			 
		 }
		 Cotxe Fiat = new Cotxe("Fiat", "Panda", 900, 2);
	
		 lifoAutos.offerLast(Fiat);
		 fifoAutos.offerFirst(Fiat);
		 n2.offer(Fiat);
		 while(!n2.isEmpty()){
			 System.out.println(n2.poll().toString()+"\n");
			 System.out.println(lifoAutos.poll().toString()+"\n");
			 System.out.println(fifoAutos.poll().toString()+"\n");
		 }

}
}