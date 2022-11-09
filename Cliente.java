package Classes;
public class Cliente {
	
	public String nomeCliente;
	private String cpf;
	private Endereco endereco;
	private Renda renda;

	public Cliente(String nome, String cpf) {
		super();
		this.nomeCliente = nome;
		this.cpf = cpf;
		
	}


	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Renda getRenda() {
		return renda;
	}

	public void setRenda(Renda renda) {
		this.renda = renda;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco e1) {
		this.endereco = e1;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String retornaDados() {
		return String.format("Nome do cliente: %s\nCPF: %s\nEndereço: %s", nomeCliente, cpf, endereco);
		// return String.format("Nome do cliente: %s\nCPF: %s\n", nomeCliente, cpf);
	}

	public static char[] toCharArray(Cliente cliente) {
		char [] aux = Cliente.toCharArray(cliente);
        return aux;
	}
	
}