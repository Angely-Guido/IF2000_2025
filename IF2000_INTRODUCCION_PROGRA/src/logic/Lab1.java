/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Scanner;

/**
 *
 * @author josse
 */
public class Lab1 {
    
    Scanner sc = new Scanner(System.in);
    
    public void ejercicio_1(){
        
        int numero = 0;
    
    System.out.println("Ingrese un numero");
    numero = sc.nextInt();
    
    if (numero % 2 ==0){
    
    System.out.print("Es un numero par");
    }
    
    else{
        System.out.print("Es un numero impar");
            
            }
    }//end method
    
    public void ejercicio_2(){
        
        int numero = 0;
        
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        
        if(numero > 0){
        System.out.print("El valor absoluto es: " + numero);
        } if (numero < 0){
        numero = numero - (numero*2);
        System.out.print("El valor absoluto es: " + numero);
        }
    
    }//end method
    
    
    
    
    
    }
    

