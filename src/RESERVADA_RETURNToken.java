public class RESERVADA_RETURNToken implements IAFD{

	@Override
	public Token processa(int pos, String text) {
		char current_char = text.charAt(pos);

		if (current_char != 'r')
			return null;

		String aux = "";
		Integer i = 0;
		while(current_char != '!' && Character.isLetter(current_char) && i < 7) {
			aux += current_char;
			pos++;
			i++;
			current_char = text.charAt(pos);
		}
		if (aux.equals("return")) {
			return new Token("RESERVADA_RETURN", "return", "return".length());
		}
		return null;

	}
}
