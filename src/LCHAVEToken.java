public class LCHAVEToken implements IAFD{

	@Override
	public Token processa(int pos, String text) {
		char current_char = text.charAt(pos);
		if (current_char == '{') {
			return new Token("LCHAVE", "{", 1);
		}
		return null;

	}
}
