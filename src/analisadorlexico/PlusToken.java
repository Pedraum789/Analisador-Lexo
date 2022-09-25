/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisadorlexico;

/**
 *
 * @author unifpbraga
 */
public class PlusToken implements IAFD {

    @Override
    public Token processa(int pos, String text) {
        char current_char = text.charAt(pos);
        if (current_char == '+') {
            return new Token("SOMA", "+", 1);
        }
        return null;
    }
    
    
}
