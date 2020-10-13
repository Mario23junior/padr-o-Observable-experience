package PrimeiroObserver;

import java.util.Observable;

 class News extends Observable {
	
	void news() {
		
		String[] news = {"News 1", "News 1", "New 2"};
		
		for(String s: news) {
			
			// definindo mudança 
			setChanged();
			// notificarObservadores(s);
			notifyObservers(s);
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println("Erro foi o corrido");
			}
		}
	}
  
}
