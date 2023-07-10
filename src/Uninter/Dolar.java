package Uninter;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
	}
	public void  info() {
		System.out.printf("Dolar: %.2f \n", valor);
	}

	@Override //Metodo para converter valor depositado em Dolar para Real
	public double converter() {
		return valor * 4.87; //Cotação real do dia 09/07/2023
	}
	
}
