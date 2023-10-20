/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p1_danielelvir;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Lab1P1_DanielElvir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("Ingrese su opción: ");
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        opcion = sc.nextInt();
        while(opcion !=4){
            if(opcion==1){
                System.out.println("Ingrese Dividendo: ");
                int dividendo = 0;
                dividendo = sc.nextInt();
                System.out.println("Ingrese Divisor: ");
                int divisor = 0;
                divisor = sc.nextInt();
                
                int acumulador = 0;
                int contador = 0;
                
                while(acumulador<dividendo){
                    acumulador=acumulador+divisor;
                    contador=contador+1;
                }
                
                if(acumulador>dividendo){
                    contador=contador-1;
                }
                if(dividendo%divisor !=0){
                    System.out.println("El resultado de la división es: " + contador + "con un residuo de: " + dividendo%divisor);
                }else{
                    System.out.println("El resultado de la división es: " + contador);
                }
            }else if(opcion==2){
                System.out.println("Cuantos valores quiere ver luego del 0 y el 1?");
                int repetir = 0;
                repetir = sc.nextInt();
                int numero1 = 0;
                int numero2 = 1;
                int respuesta = 0;
                int contador = 0;
                if(contador==0){
                while(contador<repetir+2){
                    if(contador==0){
                        System.out.println("0");
                    }else if(contador==1){
                        System.out.println("1");
                    }else{
                        respuesta=numero1+numero2+1;
                        System.out.println(respuesta);
                        numero1=numero2;
                        numero2=respuesta;
                        respuesta=0;
                    }
                    contador=contador+1;
                    }
                }
            }else if(opcion==3){
                
            
            
            System.out.println("Ingrese un numero para realizar su suma alternante");
            int alter = 0;
            alter = sc.nextInt();
            int contador=0;
            int respuesta=0;
            while(contador<alter){
             if(contador%2==0){
                  respuesta += contador; 
             }else{
                 respuesta -= contador;
             }
             contador=contador+1;
            }
                System.out.println("La suma alternante del numero que ingresó es " +respuesta);
            }
            System.out.println("Menu");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("Ingrese su opción: ");
            opcion = sc.nextInt();
    }
        }
}
                
        // TODO code application logic here
    

