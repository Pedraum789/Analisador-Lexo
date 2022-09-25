package analisadorlexico;

public class RPARENToken implements IAFD{

	@Override
	public Token processa(int pos, String text) {
		char current_char = text.charAt(pos);
		if (current_char == ')') {
			return new Token("RPAREN", ")", 1);
		}
		return null;

	}
}
