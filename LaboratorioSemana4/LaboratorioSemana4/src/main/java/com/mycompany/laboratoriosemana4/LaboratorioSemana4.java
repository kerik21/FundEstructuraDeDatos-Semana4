package com.mycompany.laboratoriosemana4;

import java.util.Scanner;

public class LaboratorioSemana4 {

    public static void main(String[] args) {
        int menu = 0;
        while (menu == 0) {
            System.out.println("Bienvenido a su calculadora");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicacion");
            System.out.println("4- Division");
            System.out.println("5- Validar palindromo");
            System.out.println("6- Salir");

            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Metodos mostrarSuma = new Metodos();
                    mostrarSuma.suma();
                    break;
                case 2:
                    Metodos mostrarResta = new Metodos();
                    mostrarResta.resta();
                    break;
                case 3:
                    Metodos mostrarMult = new Metodos();
                    mostrarMult.mult();
                    break;
                case 4:
                    Metodos mostrarDivision = new Metodos();
                    mostrarDivision.division();
                    break;
                case 5:
                    Metodos validarPalindromo = new Metodos();
                    validarPalindromo.palindromo();
                    break;
                case 6:
                    System.out.println("Gracias por utilizar el programa.");
                    menu = 1;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }
    }
}
