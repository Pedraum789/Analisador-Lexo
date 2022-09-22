package analisadorlexico;

public class RESERVADA_INTToken implements IAFD{

	@Override
	public Token processa(int pos, String text) {
		char current_char = text.charAt(pos);

		if (current_char != 'i')
			return null;

		String aux = "";
		Integer i = 0;
		while(current_char != '!' && Character.isLetter(current_char) && i < 4) {
			aux += current_char;
			pos++;
			i++;
			current_char = text.charAt(pos);
		}
		if (aux.equals("int")) {
			return new Token("RESERVADA_INT", "int", 3);
		}
		return null;

	}
}
