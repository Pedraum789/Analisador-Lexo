/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
public class MinusToken implements IAFD{

    @Override
    public Token processa(int pos, String text) {
        char current_char = text.charAt(pos);
        if (current_char == '-') {
            return new Token("SUB", "-", 1);
        }
        return null;          
    }
    
}
