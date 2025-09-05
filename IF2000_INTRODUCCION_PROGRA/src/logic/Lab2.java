

package logic;
import java.util.Scanner;


public class Lab2 {
    
     Scanner sc = new Scanner(System.in);
    
    public void ejercicio_13(){
        //Realizar la suma de todos los números pares entre 2 y 1000.
        
       int num =2;
       int suma =0;
       
       while (num <=1000){
           
           suma +=num;
           num +=2;
           
       }
       System.out.println("La suma de todos los numeros pares entre 2 y 1000 es: "+ suma);
       
    }
    
       public void ejercicio_14(){
    //Realizar un algoritmo que permita convertir temperaturas dadas en grados Celsius
    //a temperaturas en grados Fahrenheit. F=9/5 * (C + 32)
    
    int celsius = 0;
    int Fahrenheit =0;
    
     System.out.println("Ingrese la temperatura en grados Celsius: ");
     celsius = sc.nextInt();
     
     Fahrenheit = 9/5 * (celsius+ 32);
     
     System.out.println("La temperatura en grados Fahrenheit es: "+  Fahrenheit);
     
       }
       
        public void ejercicio_15(){
    //Programa que lee un numero entero X y otro número entero Ny, calcula la enésima
    //potencia de X. X^n
          int x;
          int y;
          int resultado = 1;
          
          System.out.println("Ingrese X: ");
          x = sc.nextInt();
          
          System.out.println("Ingrese y: ");
          y = sc.nextInt();
          
         
          for( int i =0; i<y; i++){
              
              resultado *=x;             
          }
          System.out.println("El resultado de la potenia es: "+ resultado);
    
        }
        
         public void ejercicio_16(){
    //Elabore un DF que reciba del teclado un número e imprima el mes del año al cual
    //corresponde ese número.    

         System.out.print("Digite un numero entre el 1 y el 12: ");
        int numero = sc.nextInt();
        
        String mes;
        
        switch (numero) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "Número inválido. Debe ser del 1 al 12.";
        }
        
        System.out.println("El mes que corresponde al numero que ingresas es: " + mes);
        
        sc.close();
    
         }
         
          public void ejercicio_17(){
              
    //Calcular e imprimir el resultado de la evaluación de la siguiente funcion:
    //F(x)= {x+5, ∀ x > 0
    //{X², ∀ x < 0
    //{1, x=0
    
       System.out.print("Digite un valor para X: ");
       double X = sc.nextDouble();
       
       if (X > 0){
           X = X+5;
           System.out.print("El resultado de la funcion corresponde a: "+ X);
       }
       if (X<0){
           X = X*X;
           System.out.print("El resultado de la funcion corresponde a: "+ X);
       }
        if (X ==0){
            X=1;
            System.out.print("El resultado de la funcion corresponde a: "+ X);
        }
        
              
          }
          
          public void ejercicio_18(){
        //Diseñar un algoritmo que calcule el área de un triángulo en funcion de las
         //longitudes de sus lados.
         
         double lado1 =0;
         double lado2 =0;
         double base =0;
         double area =0;
         double semiperimetro = 0;
         
         System.out.println("Digite un lado del tiangulo");
         lado1 = sc.nextInt();
         
         System.out.println("Digite el otro lado del tiangulo");
         lado2 = sc.nextInt();
         
         System.out.println("Digite la base del triangulo");
          base =sc.nextInt();
          
          
        semiperimetro = (lado1 + lado2 + base) / 2 ;
        
        area = Math.sqrt(semiperimetro * ( semiperimetro - lado1) * ( semiperimetro - lado2) * ( semiperimetro - base));
         
         System.out.println("El area del triangulo es:" + area);
            
          }
          
          public void ejercicio_19(){
    //Realizar un algoritmo que permita intercambiar entre si los valores de dos
    //variables A y B. 
    
        int a;
        int b;
        int temp;
        
        System.out.println("Digite el primer numero: ");
        a = sc.nextInt();
        
        System.out.println("Digite el segundo numero: ");
        b = sc.nextInt();
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("Ahora el primer numero corresponde a " + a + "y el segundo a "+b);
             
          }
          
        public void ejercicio_20(){
    //Elabore un diagrama de flujo que permita encontrar la ecuación de la recta
    //y=mx+b donde M= (Y₀-Y₁)/(X₀-X₁) b=y-mx 
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double m = 0;
        double b = 0;
        double y = 0;
        
         System.out.println("Ingrese x1: ");
         x1 = sc.nextDouble();
         System.out.println("Ingrese y1: ");
         y1 = sc.nextDouble();
         
         System.out.println("Ingrese x2: ");
         x2 = sc.nextDouble();
         System.out.println("Ingrese y2: ");
         y2 = sc.nextDouble();
        
        m = (y1 - y2) / (x1 - x2);
        b = y1 - ((x1)* (m));
        
        System.out.println("La ecuacion de la recta es: y = " + m + "x + " + b);
            
        }
          
          
          public void ejercicio_21(){
        //Realizar un algoritmo que lea un numero natural K e imprima la suma de todos los
        //números naturales que sean menores a él.       
              int num = 0;
              int sum = 0;
              
              System.out.print("Ingrese un numero:");
              num = sc.nextInt();
              
              for (int i =1; i<=num; i++){
                  
                  sum = sum + i;   
                  
              }
               System.out.println("El resultado de la suma de los numeros: "+ sum);
              
          }
          
          public void ejercicio_22(){
              //Calcular la media (promedio) de una serie de números positivos. El promedio es la
             //suma total de los números leídos entre la cantidad de números. 
         int num = 1;
         int suma = 0;
         double promedio = 0;
         int contador = 0;
    
    
            while(num > 10){
            System.out.println("Digite un numero positivo o 0 para detener el ciclo" );
            num = sc.nextInt();
            if(num > 0){
            suma+= num;
            contador += 1;
            }
        }
    
        promedio = suma / contador;
        System.out.print("El promedio de todos los numeros es: " + promedio);
              
          }
          
          public void ejercicio_23(){
         //Dados 10 números enteros, visualizar la suma de los números pares de la lista.
     //¿Cuántos números pares e impares existen?, ¿Cuál es la suma total de los números y
    //cuanto es la suma de los impares y los pares por separado?
     
        int numeros = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        int contNumeros = 0;
        int sumaTotal = 0;
        
        while (contNumeros < 10){
        System.out.print("Digite un numero: " );
        numeros = sc.nextInt();
        contNumeros += 1;
        
        if(numeros % 2 == 0){
        sumaPares += numeros;
        contadorPares += 1;
        } else{
        sumaImpares += numeros;
        contadorImpares += 1;
        }
        
        }
        sumaTotal = sumaPares + sumaImpares ;
        System.out.println("De los 10 numeros " + contadorPares + " son pares.");
        System.out.println("La suma de estos es de: " +sumaPares);
        
        System.out.println("De los 10 numeros " + contadorImpares + " son impares");
        System.out.println("La suma de los numeros impares es de: " +sumaImpares);
        System.out.println("La suma total es de: " + sumaTotal);
         
          }
          
          public void ejercicio_24(){
         //Se desea calcular independientemente la suma de los números pares e impares
        //comprendidos entre 1 y 200.   
         
        int num = 1;
        int sumaPares = 0;
        int sumaImpares = 0;
     
        for ( num = 1; num <= 200; num++) {
            if(num % 2 == 0){
            sumaPares += num;
            } else {
            sumaImpares += num;
            }
        }
        
        System.out.println("La suma de todos los numeros pares hasta el 200 es de " + sumaPares);
        System.out.println("La suma de todos los numeros impares hasta el 200 es de " + sumaImpares);
            
          }
          
          public void ejercicio_25(){
          //Calcular la suma de los cuadrados de los 100 primeros números naturales    
              
               int num = 0;
               int valorCuadrado = 0;
               int sumaCuadrados = 0;
    
        for (num = 1; num <= 100; num++) {
            valorCuadrado = num * num;
            sumaCuadrados += valorCuadrado;
        }
        
        System.out.println("La suma de los cuadrados de los numeros naturales hasta el 100 es de: " + sumaCuadrados);
              
          }
          
          public void ejercicio_26(){
              // Desarrollar el algoritmo necesario para calcular el factorial de un numero entero
             //positivo N que responde a la formula; 
              
        int num = 0;
        int resultFact = 1;
                
        System.out.print("Ingrese el numero a factorizar: ");
        num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            resultFact *= i;
        }
        
        System.out.println("El resultado es" + resultFact);
              
          }
          
          public void ejercicio_27(){
      //Calcular el valor máximo de una serie de 10 números. 
              
        int []num = new int[10];
       
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite un numero: ");
            num[i] = sc.nextInt(); 
                
            }
        int valorMaximo = num[0];
        
        for (int i = 1; i < num.length; i++) {
            if(num[i] > valorMaximo){
            valorMaximo = num[i];
            }
        }
            System.out.println("El mayor valor de la serie es " + valorMaximo);
              
          }    
          
}
