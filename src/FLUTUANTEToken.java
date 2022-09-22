public class FLUTUANTEToken implements IAFD{

	@Override
	public Token processa(int pos, String text) {
		char current_char = text.charAt(pos);

		String aux = "";
		while(current_char != '!' && Character.isDigit(current_char)) {
			aux += current_char;
			pos++;
			current_char = text.charAt(pos);
		}

		if(aux.equals(""))
			return null;

		if(current_char == '.'){
			aux += current_char;
			pos++;
			current_char = text.charAt(pos);
		} else {
			return null;
		}
		while(current_char != '!' && Character.isDigit(current_char)) {
			aux += current_char;
			pos++;
			current_char = text.charAt(pos);
		}
		if(current_char == ' ' || current_char == '!')
			return new Token("FLUTUANTE", aux, aux.length());

		return null;

	}
}
