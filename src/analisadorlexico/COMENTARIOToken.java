/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisadorlexico;

/**
 *
 * @author Pedro
 */
public class COMENTARIOToken implements IAFD{

	@Override
	public Token processa(int pos, String text) {
		char current_char = text.charAt(pos);

		if (current_char != '"')
			return null;

		String aux = Character.toString(current_char);
                pos++;
                current_char = text.charAt(pos);
		while(current_char != '!' && (Character.isLetter(current_char) || Character.isDigit(current_char) || current_char == ' ' )) {
			aux += current_char;
			pos++;			
			current_char = text.charAt(pos);
		}
		if (current_char == '"') {
                        aux += current_char;
			return new Token("COMENTARIO", aux, aux.length());
		}
		return null;

	}
    
}
