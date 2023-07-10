package Uninter;

import java.util.ArrayList;
//Classe contendo os metodos do menu principal
public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}
	
	public void remover(Moeda m) {
		listaMoedas.remove(m);
	}
	
	public void listagemMoedas() {
		if(listaMoedas.isEmpty()) {
			System.out.println("Cofrinho Vazio");
			return;
		}
		for(Moeda m : listaMoedas) {
			m.info();
		}
	}
	
	public void totalConvertido() {
		double total = 0;
		for (Moeda m : listaMoedas) {
			total += m.converter();
		}
		System.out.println("Total no cofrinho em reais: " + total);
	}
}
