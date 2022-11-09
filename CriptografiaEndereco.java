/* package Classes;
public class CriptografiaEndereco {

	private Endereco endereco;
	//private static char[] aux;

	public static String cripto(Endereco endereco, char[] aux) {
		// Cria um laço de repetição que recebe um array de caracteres como argumento
		for (int i = 0; i < aux.length; i++) {
			
			// Criptografa cada caractere do array de bytes com a Cifra de César
			aux[i] = (char) (aux[i] + 3);
		}
		// Cria uma string do array de caracteres com a mensagem cifrada
		String textocifrado = new String(aux);
		
		// Devolve a mensagem criptografada
		return textocifrado;
	}
		// Cria o método descriptografar que recebe como argumento um texto cifrado 
		public static String descripto(String textoCifrado) {
			
			// Transforma a String em uma cadeia de caracteres
			char[] auxiliar = textoCifrado.toCharArray();

			// Cria um laço para descriptografar a mensagem
			for (int i = 0; i < auxiliar.length; i++) {
				// System.out.println(x[i])
				auxiliar[i] = (char) (auxiliar[i] - 3);
			}

			// Transforma o array de caracteres em uma string
			String textocifrado = new String(auxiliar);
			
			// // Devolve a mensagem descriptografada
			return textocifrado;
		}
		} */