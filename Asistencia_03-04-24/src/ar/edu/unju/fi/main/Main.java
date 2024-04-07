package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNotas;

// NOS PIDEN QUE PARA EL ALUMNO  ARIEL VEGA SE REGISTRE LAS NOTAS FINALES DE 4 MATERIAS CUALQUIERA
public class Main {

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el legajo: ");
		Integer legajo = sc.nextInt();
		System.out.println("Ingrese el Apellido: ");
		String apellido = sc.next();
		System.out.println("Ingrese el Nombre: ");
		String nombre = sc.next();
		
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		System.out.println(alumno.toString());
		
		int numMaterias = 1;
		while (numMaterias <=1) {
			//Cargar materias
			System.out.println("Ingrese el codigo de la materia: ");
			String codigoMateria = sc.next();
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = sc.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo del registro de nota: ");
			String codigoNota = sc.next();
			System.out.println("Ingrese la nota final: ");
			Float nota = sc.nextFloat();
			
			RegistroNotas registroNotas = new RegistroNotas(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNotas.toString());
			
			numMaterias ++;
		}
		sc.close();
	}

}
