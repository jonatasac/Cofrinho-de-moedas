package Uninter;

public abstract class Moeda {
	double valor;
	
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}

	public abstract double converter();
	public abstract void info();

//Metodo equals para encontrar um valor igual na lista, usado para remover uma moeda exata do cofrinho.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	
}
