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
public class Atividade_passada_contador_caracteres {
    public static void main(String args []){
        Scanner scanner = new Scanner (System.in);
                      
        System.out.println("Digite uma palavra");
        String texto = scanner.nextLine();

        int txtCont = texto.length();

        System.out.println("Total de caracteres: " + txtCont);
        
        int txtSemEspaco = texto.replace(" ", "").length();
        System.out.println("Total de caracteres sem contar espaços : " + txtSemEspaco);
    }
}
