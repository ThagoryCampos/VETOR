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
public class Atividade_passada_palindromo {
    public static void main (String args []){
        Scanner scanner = new Scanner (System.in);
        
    		System.out.println("Informe uma palavra: ");
    		String palavra = scanner.nextLine();
    		String palindromo = "";
    		
    		for(int i = palavra.length() -1; i >= 0; i--){
    			
    			palindromo += palavra.charAt(i);
                }
    		
                if(palindromo.equals(palavra)) {
    			System.out.print(/*palindromo + */"\n" + "É um palíndromo!");
    		}
    		else {
    			System.out.print(/*palindromo + */"\n" + "Não é um palíndromo!" );
    		}
    		//scanner.close();
    	}

}