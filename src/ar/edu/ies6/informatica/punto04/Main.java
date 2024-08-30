package ar.edu.ies6.informatica.punto04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner (System.in);
		int numero;
		System.out.println("ingrese un numero del 1 al 9");
		numero= entrada.nextInt();
		if (numero<1||numero>9) {
			System.out.println("el valor ingresado esta fuera del rango");	
		} else {
			System.out.println("la tabla de multiplicar del "+numero+" es;");
			for (int i=1; i<= 10;i++) {
				System.out.println(numero+"x"+i+"="+(numero*i));
				entrada.close();
			}
		}
	}

}
