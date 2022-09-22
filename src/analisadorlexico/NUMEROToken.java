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
public class NUMEROToken implements IAFD{

	@Override
	public Token processa(int pos, String text) {
		char current_char = text.charAt(pos);

		String aux = "";
		while(current_char != '!' && Character.isDigit(current_char)) {
			aux += current_char;
			pos++;
			current_char = text.charAt(pos);
		}
		if (!aux.equals("")) {
			return new Token("NUMERO", aux, aux.length());
		}
		return null;

	}
    
}
