package Classes;
public class Endereco {
	
	private String rua;
	private int numero;
	private int quadra;
	private int lote;
	private String cep;
	private String cidade;
	private String estado;
	//private char[] aux;
	
	public Endereco(String rua, int numero, int quadra, int lote, String cep, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.quadra = quadra;
		this.lote = lote;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		//this.aux = aux;
	}

	// transforma o endereço em um array de caracteres que será criptografado
	public static char[] toCharArray(Endereco endereco) {
		char [] aux = Endereco.toCharArray(endereco);
        return aux;
    }
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuadra() {
		return quadra;
	}
	public void setQuadra(int quadra) {
		this.quadra = quadra;
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", quadra=" + quadra + ", lote=" + lote + ", cep=" + cep
				+ ", cidade=" + cidade + ", estado=" + estado + "]";
	}
} 