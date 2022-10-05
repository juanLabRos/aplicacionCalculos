/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacioncalculos;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jon
 */
public class AplicacionCalculos {

    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	System.out.println("Aplicación Cáculos");
	menu();
    }

    public static void menu() {
	Scanner sn = new Scanner(System.in);
	boolean salir = false;
	int opcion; //Guardaremos la opcion del usuario

	while (!salir) {

	    System.out.println("1. Opcion 1");
	    System.out.println("2. Opcion 2");
	    System.out.println("3. Opcion 3");
	    System.out.println("4. Salir");

	    try {

		System.out.println("Escribe una de las opciones");
		opcion = sn.nextInt();

		switch (opcion) {
		    case 1:
			System.out.println("Has seleccionado la opcion 1");
			suma();
			break;
		    case 2:
			System.out.println("Has seleccionado la opcion 2");
			multiplicar();
			break;
		    case 3:
			System.out.println("Has seleccionado la opcion 3");
			dividir();
			break;
		    case 4:
			salir = true;
			break;
		    default:
			System.out.println("Solo números entre 1 y 4");
		}
	    } catch (InputMismatchException e) {
		System.out.println("Debes insertar un número");
		sn.next();
	    }
	}

    }

    public static void suma() {
	int i;
	int j;
	
	System.out.println("Ha entrado en la aplicación de suma. \n"
		+ "Introduzca los dos números que quiere sumar: ");
	 i = sc.nextInt();
	 System.out.println("Ha introducido el "+i+". Introduzca el segundo número: ");
	 j = sc2.nextInt();
	 System.out.println("El resultado de la suma es: "+(i+j));

    }
    
    public static void multiplicar(){
	int i;
	int j;
	
	System.out.println("Ha entrado en la aplicación de multiplicación. \n"
		+ "Introduzca los dos números que quiere multiplicar: ");
	 i = sc.nextInt();
	 System.out.println("Ha introducido el "+i+". Introduzca el segundo número: ");
	 j = sc2.nextInt();
	 System.out.println("El resultado de la multipilicación  es: "+(i*j));

    }
    
    public static void dividir(){
	double i;
	double j;
	System.out.println("Ha entrado en la aplicación de división. \n"
		+ "Introduzca los dos números que quiere dividir: ");
	 i = sc.nextInt();
	 System.out.println("Ha introducido el "+i+". Introduzca el segundo número: ");
	 j = sc2.nextInt();
	 System.out.println("El resultado de la división  es: "+(i/j));
	 
	 //Por terminar
	 System.out.println("El resto es: (en construcción) ");
    }
}
