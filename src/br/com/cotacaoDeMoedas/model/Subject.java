package br.com.cotacaoDeMoedas.model;
//Interação do Model
import br.com.cotacaoDeMoedas.view.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();	
}
