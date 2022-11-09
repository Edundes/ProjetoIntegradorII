package Classes;
import java.util.Random;

public class ConsultaSerasa {
		
	private Cliente cliente;
	
	Random random = new Random();
	
	public ConsultaSerasa(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String retornaScore(Cliente cliente) {
		int score = random.nextInt(1000);
		return String.format("Score do cliente: %d", score);
	}
	
}
