package Uninter;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}
	public void  info() {
		System.out.printf("Euro: %.2f \n", valor);
	}

	@Override //Metodo para converter valor depositado em Euro para Real
	public double converter() {
		return valor * 5.34; //Cotação real do dia 09/07/2023
	}
	

}
