package com.mycompany.laboratoriosemana4;

import java.util.Scanner;

public class Metodos {
    Scanner leer = new Scanner(System.in);
    int num1, num2;
    
    private void validar(int num1, int num2){
        while (num1 == num2){
            System.out.println("Los numeros ingresados son iguales");
            System.out.println("Ingresa numeros distintos");
            System.out.println("Ingrese el primer numero: ");
            num1 = leer.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            num2 = leer.nextInt();
            
        }
    }
    
    public void suma (){
        System.out.println("Ingrese el 1er numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el 2do numero: ");
        num2 = leer.nextInt();
        
        validar(num1,num2);
        
        System.out.println("Resultado: "+ (num1+num2));
    }
    
    public void resta (){
        System.out.println("Ingrese el 1er numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el 2do numero: ");
        num2 = leer.nextInt();
        
        validar(num1,num2);
        
        System.out.println("Resultado: "+ (num1-num2));
    }
    
    public void mult() {
        System.out.println("Ingrese el 1er numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el 2do numero: ");
        num2 = leer.nextInt();
        
        validar(num1, num2);
        System.out.println("Resultado: " + (num1 * num2));
    }
    
    public void division() {
        System.out.println("Ingrese el primer numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = leer.nextInt();
        
        validar(num1, num2);
        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede dividir por cero.");
        } else if (num1 < 0 && num2 < 0){
            System.out.println("Ambos numeros ingresados son negativos");
        } else if (num1 < 0){
            System.out.println("Error. El 1er numero es negativo");
        } else if (num2 < 0){
            System.out.println("Error. El 2do numero es negativo");
        } else {
            int resultado = num1 / num2;
            int resto = num1 % num2;
            System.out.println("Resultado: " + resultado);
            System.out.println("Resto: " + resto);
        }
    }
    
    public boolean esPalindromo(String palabra) {
        if (palabra.length() <= 1) {
            return true;
        } else {
            char primerChar = palabra.charAt(0);
            char ultimoChar = palabra.charAt(palabra.length() - 1);
            
            // Si los caracteres al inicio y al final son diferentes, no es un palíndromo
            if (primerChar != ultimoChar) {
                return false;
            } else {
                // Llamada recursiva con la palabra sin los caracteres extremos
                return esPalindromo(palabra.substring(1, palabra.length() - 1));
            }
        }
    }
    
    public void palindromo(){
        System.out.println("Ingresa una palabra: ");
        String palabra = leer.nextLine().toLowerCase();
        
        if (palabra.length() == 1){
            System.out.println("Una letra no es un palindromo");
        } else {
            char primeraLetra = palabra.charAt(0);
            char ultimaLetra = palabra.charAt(palabra.length() - 1);
            
            if (primeraLetra != ultimaLetra){
                System.out.println("La palabra: " + palabra + ", no es palindromo");
            } else {
                System.out.println("La palabra: " + palabra + ", es un palindromo");
            }
        }
    }
}