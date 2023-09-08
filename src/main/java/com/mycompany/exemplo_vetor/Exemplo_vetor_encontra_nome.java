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
public class Exemplo_vetor_encontra_nome {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        
        String [] nomes = new String [5];
        
        nomes [0] = "Jose";
        nomes [1] = "Maria";
        nomes [2] = "Joao";
        nomes [3] = "Pedro";
        nomes [4] = "Lucas";
        
        
        
        System.out.println("Informe o nome: ");
        String nome = scanner.next();
        boolean naLista = false;
        System.out.println("Bem Vindo(a): " + nome );
       
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equals(nome)){
                naLista = true;
                System.out.println("O nome " + nome + " esta na posição " + i + " da lista!");
                
            }
        
        }
        if(!naLista){
        System.out.println(nome + " não esta na lista!");
        }
    }
    
}
