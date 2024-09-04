package ar.edu.ies6.informatica.punto05.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
//atributos privados
	private String dni;
	private String nombre;
	private LocalDate fechaNac;
	private String provincia;
	//constructores
	//constructo por defecto
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	//constructo parametrizado
	public Persona(String dni, String nombre, LocalDate fechaNac, String provincia){
		// TODO Auto-generated constructor stub
		this.dni=dni;
		this.nombre=nombre;
		this.fechaNac=fechaNac;
		this.provincia=provincia;
	}
	//constructo cambiando a Jujuy
	public Persona(String dni, String nombre, LocalDate fechaNac) {
		// TODO Auto-generated constructor stub
		this.dni=dni;
		this.nombre=nombre;
		this.fechaNac=fechaNac;
		this.provincia="Jujuy";
	}
	//declarar metodos de acceso para cada atributo
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	//calcular edad
	public Integer calcularEdad() {
		return Period.between(this.fechaNac,LocalDate.now()).getYears();
	} 
	//verificar si es mayor ono con if
	public boolean esMayorDeEdad() {
		return calcularEdad()>=18;
	}
	//mostrar en la consola 
public void mostrarDatos() {
	System.out.println("DNI: "+this.dni);
	System.out.println("NOMBRE: "+this.nombre);
	System.out.println("FECHA DE NACIMIENTO: "+this.fechaNac);
	System.out.println("PROVINCIA: "+this.provincia);
	System.out.println("EDAD: "+calcularEdad()+" AÑOS");
	if (esMayorDeEdad()) {
		System.out.println("La persona es mayor de edad.");
	}	else {
			System.out.println("La persona no es mayor de edad");
		}
		
	}
}
