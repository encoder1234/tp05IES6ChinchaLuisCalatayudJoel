package ar.edu.ies6.informatica.punto01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//datos a tener en cuenta
		String nombre="luis";
		int edad=22;
		double altura=150.5;
		double precio=70.5;
		String telefono="3885030842";
		//calculo coseno
		double coseno=Math.cos(0.5);
		//las 5 variables declaradas
		int valor1=8;
		int valor2=5;
		int valor3=1;
		int valor4=20;
		int valor5=9;
		//calculo de promedio
		double promedio=(valor1+valor2+valor3+valor4+valor5)/5.0;
		//mostrando en consola todo
		System.out.println("El nombre es: "+nombre);
		System.out.println("La edad del sujeto es: "+edad+" años ");
		System.out.println("La altura de un edifico es: "+altura);
		System.out.println("El precio del pan es de: "+precio);
		System.out.println("Mi telefono es: "+telefono);
		System.out.println("El coseno es: "+coseno);
		System.out.println("Las variables usadas son;"+valor1+";"+valor2+","+valor3+","+valor4+","+valor5);
		System.out.println("Y su promedio es de; "+promedio);
	}

}
