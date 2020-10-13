package PrimeiroObserver;

import java.util.Observable;
import java.util.Observer;

// primeiro observador
 public class ObserverUm implements Observer{
	 public void update(Observable obj , Object arg) {
		 System.out.println("Observer um recebeu uma nova noticia"+(String)arg);
	 }
}
