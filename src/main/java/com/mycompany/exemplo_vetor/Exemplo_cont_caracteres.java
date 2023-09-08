/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_vetor;

/**
 *
 * @author thagory.8187
 */
public class Exemplo_cont_caracteres {
    public static void main(String args []) {
        String nome;
        
        nome = "Thagory Campos";
        int totalCaracteres = 0;
        
        for (int i = 0; i < nome.length(); i++){
            if(nome.charAt(i) != ' '){          //colocado dentro de aspas simples e ignorado como caracter, aspas duplas somente para texto String
            totalCaracteres++;
            }   
        }
        System.out.println(totalCaracteres);
//        System.out.println(nome.charAt(0));
    }
    
}
