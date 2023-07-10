package Uninter;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
	}
	public void  info() {
		System.out.printf("Real: %.2f \n", valor);
	}

	@Override //Metodo para retornar o valor depositado em real
	public double converter() {
		return valor;
	}
	
	
}
