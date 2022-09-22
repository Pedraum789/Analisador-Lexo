public class DIVToken implements IAFD{

	@Override
	public Token processa(int pos, String text) {
		char current_char = text.charAt(pos);
		if (current_char == '/') {
			return new Token("DIV", "/", 1);
		}
		return null;

	}
}
