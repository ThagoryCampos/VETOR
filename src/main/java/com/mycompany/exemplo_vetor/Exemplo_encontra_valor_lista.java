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
public class Exemplo_encontra_valor_lista {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        
        int valorBusca;
        
        int [] valores = new int[5];
        
        valores [0] = 15;
        valores [1] = 5;
        valores [2] = 675;
        valores [3] = 134;
        valores [4] = 78;
        
        boolean encontrado = false;
        
        for(int i = 0; i< valores.length; i++){
            System.out.println(+ valores[i]);
        }
        
        System.out.println("Qual o valor deseja encontrar no vetor?");
        valorBusca = scanner.nextInt();
        
        for(int i = 0; i < valores.length; i++){
            if(valores[i] == valorBusca){
                encontrado = true;
                System.out.println("O valor " + valorBusca + " está na lista na posição " + i);
                break;
            }
        }
        if (!encontrado){
            System.out.println("O valor " + valorBusca + "não esta na lista.");
        }
    }
    
}
