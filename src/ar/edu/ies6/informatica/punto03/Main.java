package ar.edu.ies6.informatica.punto03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		int numero;
		System.out.println("INGRESE UN NUMERO DEL 0 A 10");
		 numero= entrada.nextInt();
		if (numero< 0||numero>10) {
			System.out.println("El numero ingresado no esta en el rango establecido");
		} else {
		int factorial=1;
		int valor=numero;
		while (valor>0) {
			factorial*=valor;
			valor--;
		}
		System.out.println("el factorial de "+numero+ " es; "+factorial);
		entrada.close();
		}
	}

}
