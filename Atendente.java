package Classes;
public class Atendente {
	
	private String nomeAtendente;
	private int matricula;
	
	public Atendente(String nomeAtendente, int matricula) {
		super();
		this.nomeAtendente = nomeAtendente;
		this.matricula = matricula;
	}

	Renda renda = new Renda(1600);
	String name = renda.avaliaRenda();

	public String getNomeAtendente() {
		return nomeAtendente;
	}

	public void setNomeAtendente(String nomeAtendente) {
		this.nomeAtendente = nomeAtendente;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	

}
