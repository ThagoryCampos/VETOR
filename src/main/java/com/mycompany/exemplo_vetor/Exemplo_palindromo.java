/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_vetor;

import java.util.Scanner;

/**
 *
 * @author thagory.8187
 */
public class Exemplo_palindromo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        String palavra;
        
        System.out.println("Informe a palavra: ");
        palavra =  scanner.nextLine();
        
        
        char[] letraPalavraNormal = new char[palavra.length()];
        char[] letraPalavraInvertida = new char[palavra.length()];
        
        int contInv = palavra.length();
        
        boolean palindromo = true;
        
        for(int i = 0; i< palavra.length(); i++){
            contInv--;
            letraPalavraNormal[i] = palavra.charAt(i);
            letraPalavraInvertida[i] = palavra.charAt(i);
         }
        
        for (int  i = 0; i < palavra.length(); i++){
        if(letraPalavraNormal[i] != letraPalavraInvertida[i]){
            palindromo = false;
            break;
        }
    }
    
    if (palindromo){
            System.out.println("A palavra " + palavra + "é um palindromo!");
    }else{
        System.out.println("A palavra " + palavra + "é um palindromo!");
        }        
    }
}    
