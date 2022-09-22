/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
//        switch(current_char){
//           case '-':                    
//                    return new Token("SUB", "-", 1);
//                case '*':
//                    return new Token("MULT", "*", 1);
//                case '/':
//                    return new Token("DIV", "/", 1); 
//                case '(':
//                    return new Token("LPAREN", "(", 1); 
//                case ')':
//                    return new Token("RPAREN", ")", 1);
//                default:
//                    if(Character.isDigit(current_char)){
//                        return new Token("INTEGER",  String.valueOf(current_char), 1); 
//                    }
//                    else if(Character.isLetter(current_char))
//                    {
//                         return new Token("ID", String.valueOf(current_char), 1);        
//                    }
//        }
    
    
}
