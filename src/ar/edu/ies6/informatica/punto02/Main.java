package ar.edu.ies6.informatica.punto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generamos un valor
		Scanner entrada= new Scanner(System.in);
		//le damos un identificador
		int numero;
		//pedimos que se diguite
		System.out.println("Digite un numero entero");
		//comando para que dijite el numero
		numero= entrada.nextInt();
		//estructura de control para saber si es par o impar
		if (numero%2==0) {
			System.out.println("El numero es par. Su multiplo es; "+(numero*3));
		} else {
			System.out.println("El numero es impar. Su doble es; "+(numero*2));
		}
		entrada.close();
	}

}
