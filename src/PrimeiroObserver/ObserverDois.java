package PrimeiroObserver;

import java.util.Observable;
import java.util.Observer;

public class ObserverDois implements Observer{
    
	public void update(Observable obj, Object arg) {
		System.out.println("Segundo observador recebeu uma nova noticia"+(String)arg);
	}
}
