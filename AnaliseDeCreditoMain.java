package Classes;
import javax.swing.JOptionPane;

public class AnaliseDeCreditoMain {

	public static void main(String[] args) {
		

		Renda rendaCliente = new Renda(1700);

		Cliente c1 = new Cliente("Eduardo Mendes Nunes", "999.888.777.66");
		Endereco e1 = new Endereco("Rua Dom Pedro", 10, 20, 18, "74652-200", "Goiânia", null);
		
		JOptionPane.showMessageDialog(null, "A renda mensal do cliente é R$" + rendaCliente.getRenda() + ".");
		JOptionPane.showMessageDialog(null, rendaCliente.avaliaRenda());
	
		c1.setEndereco(e1);
		JOptionPane.showMessageDialog(null, c1.retornaDados());
		ConsultaSerasa consulta = new ConsultaSerasa(c1);
		JOptionPane.showMessageDialog(null, consulta.retornaScore(c1));

		String cliente1 = c1.retornaDados();

		char[] arraycliente1 = cliente1.toCharArray();
		String textoCifradoCliente = CriptografiaCliente.cripto(c1, arraycliente1);

		// JOptionPane.showMessageDialog(null, textoCifradoCliente,"Dados do Cliente cifrados", INFORMATION_MESSAGE, null);
		
		String textoDecifradoCliente = CriptografiaCliente.descripto(textoCifradoCliente);
		
		JOptionPane.showMessageDialog(null, textoDecifradoCliente);
	}

}