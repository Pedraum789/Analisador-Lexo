/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifpbraga
 */
public class Token {
    
    String tipo;
    String valor;
    private int length;

    
    public Token(String type, String value, int length){
        tipo = type;
        valor = value;
        this.length = length;
        
    }
    
    @Override
    public String toString(){
        return "<"+tipo+", "+valor+">";
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getValor(){
        return valor;
    }
    public int getLength(){
        return length;
    }
    
}
