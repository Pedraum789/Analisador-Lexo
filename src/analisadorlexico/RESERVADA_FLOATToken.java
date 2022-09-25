package analisadorlexico;


import analisadorlexico.IAFD;
import analisadorlexico.Token;

public class RESERVADA_FLOATToken implements IAFD{

	@Override
	public Token processa(int pos, String text) {
		char current_char = text.charAt(pos);

		if (current_char != 'f')
			return null;

		String aux = "";
		Integer i = 0;
		while(current_char != '!' && Character.isLetter(current_char) && i < 6) {
			aux += current_char;
			pos++;
			i++;
			current_char = text.charAt(pos);
		}
		if (aux.equals("float")) {
			return new Token("RESERVADA_FLOAT", "float", "float".length());
		}
		return null;

	}
}
