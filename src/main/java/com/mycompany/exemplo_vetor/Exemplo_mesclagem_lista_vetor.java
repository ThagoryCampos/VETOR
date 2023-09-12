/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_vetor;

/**
 *
 * @author thagory.8187
 */
public class Exemplo_mesclagem_lista_vetor {
    public static void main(String args []){
        int qtdPosicoes = 5, qtdPosicoes2 = 5;
        
        int [] lst1 = new int [qtdPosicoes]; 
        
        lst1 [0] = 1;
        lst1 [1] = 2;
        lst1 [2] = 3;
        lst1 [3] = 4;
        lst1 [4] = 5;
        
        int [] lst2 = new int [qtdPosicoes2]; 
        
        lst2 [0] = 6;
        lst2 [1] = 7;
        lst2 [2] = 8;
        lst2 [3] = 9;
        lst2 [4] = 10;
        
        
        int [] lstMesc = new int[lst1.length + lst2.length];
        
        for(int i = 0; i < lst1.length; i++){
            lstMesc [i] = lst1[i];
            //System.out.println(lista1);
        }
        
        for(int i = 0; i < lst2.length; i++){
            lstMesc[lst1.length + i] = lst2[i];
            //System.out.println(lista2);
        }
        
        for(int i = 0; i < lstMesc.length; i++ ){
            System.out.println(lstMesc[i]);
        }
    }
}
