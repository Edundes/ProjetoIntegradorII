package Classes;
public class TipoCredito {
	
	private double valor;
	private String tipo;

	public TipoCredito(double valor, String tipo) {
		super();
		this.valor = valor;
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}