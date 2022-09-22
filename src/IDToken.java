public class IDToken implements IAFD{

	@Override
	public Token processa(int pos, String text) {
		char current_char = text.charAt(pos);

		String aux = "";
		while(current_char != '!' && Character.isLetter(current_char)) {
			aux += current_char;
			pos++;
			current_char = text.charAt(pos);
		}
		if (!aux.equals("")) {
			return new Token("ID", aux, aux.length());
		}
		return null;

	}
}
