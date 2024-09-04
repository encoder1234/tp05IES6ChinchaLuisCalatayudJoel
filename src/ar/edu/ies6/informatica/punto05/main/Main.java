package ar.edu.ies6.informatica.punto05.main;

import java.time.LocalDate;

import ar.edu.ies6.informatica.punto05.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//usando constructor por defecto
		Persona persona1=new Persona();
		persona1.setDni("43635111");
		persona1.setNombre("Luis Miguel");
		persona1.setFechaNac(LocalDate.of(2001, 10, 01));
		persona1.setProvincia("Buenos Aires");
		persona1.mostrarDatos();
		System.out.println();
//usando constructo parametrizado
		Persona persona2=new Persona("5030842","joel calatayud",LocalDate.of(1995, 3, 21),"Cordoba");
		persona2.mostrarDatos();
		System.out.println();
// usando ponstructo de jujuy
		Persona persona3=new Persona("74842262","david cruz",LocalDate.of(2010, 8, 22));
		persona3.mostrarDatos();
		System.out.println();
		
		
	}

}