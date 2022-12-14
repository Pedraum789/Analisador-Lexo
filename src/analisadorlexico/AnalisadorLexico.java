/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisadorlexico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 *
 * @author unifpbraga
 */
public class AnalisadorLexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String pathFile = "C:\\temp\\testeAnalisador.txt";
        String texto = Files.readString(Path.of(pathFile));
//        Scanner input = new Scanner(System.in);
//        System.out.println("Entrada: ");
//        String texto = input.nextLine();
//        
        var lexer = new Lexer(texto);
        var token = lexer.GetNextToken();
        while(!token.tipo.equals("EOF")){
            System.out.println(token);
            token = lexer.GetNextToken();
        }
        
    }
    
}
