package Observer;

public class Observable {
   
	public static void main(String[] args) {
		
		Observado observerNew = new Observado();
		ObserverUm leitor1 = new ObserverUm();
		ObserverDois leitor2 = new ObserverDois();
		
		observerNew.addObserver(leitor1);
		observerNew.addObserver(leitor2);
		observerNew.news();
 	}
}
