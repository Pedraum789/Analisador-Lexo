/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisadorlexico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author unifpbraga
 */
public class Lexer {
    
    String texto;
    int pos = 0;
    char atual;
    private List<IAFD> afds;
    int line = 1;
    int col = 1;
    
    
    public Lexer(String text){
        texto = text;
        atual = texto.charAt(pos);
        afds = new ArrayList<IAFD>();
        afds.add(new PlusToken());
        afds.add(new MultToken());
        afds.add(new MinusToken());
        afds.add(new DIVToken());
        afds.add(new COMENTARIOToken());
        afds.add(new RESERVADA_RETURNToken());
        afds.add(new RESERVADA_INTToken());
        afds.add(new RESERVADA_FLOATToken());
        afds.add(new IDToken());
        afds.add(new LPARENToken());
        afds.add(new RPARENToken());
        afds.add(new LCHAVEToken());
        afds.add(new RCHAVEToken());
        afds.add(new FLUTUANTEToken());
        afds.add(new NUMEROToken());
        
        
    }
    
    public void Avancar(int qtd){
        pos+= qtd;
        if(pos>texto.length()-1){
            atual = '!';
        }
        else{
          atual = texto.charAt(pos);  
        }        
    }
    
    public void PularEspaco(){
        while(atual == ' ' || atual == '\r' || atual == '\n'){
            Avancar(1);
        }
    }
    public Token GetNextToken(){
        
        while(atual != '!'){
            if(atual == ' '){
                PularEspaco();
                col++;
                continue;
            }
            if(atual == '\r' || atual == '\n'){
                line++;
                col = 1;
                PularEspaco();
            }
            
            
            for (IAFD afd : afds) {
                Token reconhecido = afd.processa(pos, texto);
                if(reconhecido != null){
                    Avancar(reconhecido.getLength());
                    col+=reconhecido.getLength();
                    return reconhecido;
                }
            }
            Erro(line, col);
        }            
        return new Token("EOF", "!", 1);
    }
    
    public void Erro(int line, int col){
        throw new RuntimeException("Caractere incoreto na linha "+(line)+" e coluna " + (col) +"!");
    }
}
