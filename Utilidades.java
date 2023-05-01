package crudListas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {

	public static void MenuPrincipal() {

		System.out.println("¿Qué quieres hacer con tu Pokèdex?");
		System.out.println("1 - Añadir un Pokemon");
		System.out.println("2 - Consultar mis Pokemon");
		System.out.println("3 - Modificar un Pokemon");
		System.out.println("4 - Liberar un Pokemon");
		System.out.println("5 - Salir");

	}

	public static void MensajeInicio() {
		System.out.println("Bienvenido entrenador");
	}

	public static Pokemon PedirPokemon() {

		Scanner lector = new Scanner(System.in);
		String nombre = " ";
		String tipo = " ";
		String region = " ";

		System.out.println("Introduce el nombre del Pokemon:");
		nombre = lector.nextLine();
		System.out.println("Introduce el tipo de " + nombre + ":");
		tipo = lector.nextLine();
		System.out.println("Introduce la región a la que pertenece " + nombre + ":");
		region = lector.nextLine();
		lector.nextLine();

		return new Pokemon(nombre, tipo, region);
	}

	public static Pokemon PedirNombre() {
		Scanner lector = new Scanner(System.in);
		String nombre = " ";
		String tipo = " ";
		String region = " ";

		System.out.println("Introduce el nombre del Pokemon:");
		nombre = lector.nextLine();

		return new Pokemon(nombre, tipo, region);

	}

}
