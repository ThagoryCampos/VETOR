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
public class Atividade_7_encontrar_valor_na_lista {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in); 
        int qtdPosicoes = 5, numeros = 0, selecao = 0;
         
         
         int [] lista = new int[qtdPosicoes];
         
         lista [0] = 1;
         lista [1] = 5;
         lista [2] = 6;
         lista [3] = 8;
         lista [4] = 10;
         
          for (int i = 0; i < 5; i++ ){
              numeros = lista[i];
              System.out.println(numeros);
        }
          
          System.out.println("Selecione um valor da lista acima: ");
          int numop = scanner.nextInt();
          boolean naLista = false;
        
          System.out.println("Numero selecionado: " + numop);
          
          for (int i = 0; i < lista.length; i++){
            if (lista[i]==(numop)){
                naLista = true;
                System.out.println("O numero " + numop + " esta na posição " + i + " da lista!");
                
            }
       }
    }
}

