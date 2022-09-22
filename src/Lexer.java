/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    
    
    public Lexer(String text){
        texto = text;
        atual = texto.charAt(pos);
        afds = new ArrayList<IAFD>();
        afds.add(new PlusToken());
        afds.add(new MultToken());
        afds.add(new MinusToken());
        afds.add(new RESERVADA_INTToken());
        afds.add(new RESERVADA_RETURNToken());
        afds.add(new RESERVADA_FLOATToken());
        afds.add(new IDToken());
        afds.add(new FLUTUANTEToken());
//        afds.add(new);
//        afds.add(new);
//        afds.add(new);
//        afds.add(new);
//        afds.add(new);
        
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
        while(atual == ' '){
            Avancar(1);
        }
    }
    public Token GetNextToken(){
        while(atual != '!'){
            if(atual == ' '){
                PularEspaco();
                continue;
            }
            for (IAFD afd : afds) {
                Token reconhecido = afd.processa(pos, texto);
                if(reconhecido != null){
                    Avancar(reconhecido.getLength());
                    return reconhecido;
                }
            }
            Erro();
        }            
        return new Token("EOF", "!", 1);
    }
    
    public void Erro(){
        throw new RuntimeException("Caractere incoreto!");
    }
}
