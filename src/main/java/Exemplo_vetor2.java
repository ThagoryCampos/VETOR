
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thagory.8187
 */
public class Exemplo_vetor2 {
    public static void main(String args []){
        Scanner scanner = new Scanner (System.in);
        
        int[] numeros = new int [5];
        
        for (int i = 0; i < 5; i++ ){
            System.out.println("Digite o valor[" + i + "] :");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("----- valores informados-----");
        for(int i = 0; i < 5; i++){
            System.out.println("Valor na posicao [" + i + "]: " + numeros[i]);
        
        }
        
    }
    
}
