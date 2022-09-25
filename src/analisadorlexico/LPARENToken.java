package analisadorlexico;

public class LPARENToken  implements IAFD{

	@Override
	public Token processa(int pos, String text) {
		char current_char = text.charAt(pos);
		if (current_char == '(') {
			return new Token("LPAREN", "(", 1);
		}
		return null;

	}
}
