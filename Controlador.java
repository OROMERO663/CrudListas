package crudListas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {

		int eleccion;
		boolean salir = false;
		Pokemon miPokemon = new Pokemon("", "", "");
		Pokedex Pokedex1 = new Pokedex("");
		String nombre;

		Utilidades.MensajeInicio();

		do {
			Utilidades.MenuPrincipal();

			try {
				Scanner lector = new Scanner(System.in);
				eleccion = lector.nextInt();
				lector.nextLine();

				switch (eleccion) {
				case 1:
					miPokemon = Utilidades.PedirPokemon();
					Pokedex1.addPokemon(miPokemon);
					break;
				case 2:
					miPokemon = Utilidades.PedirNombre();
					Pokedex1.buscar(miPokemon);
					break;
				case 3:
					miPokemon = Utilidades.PedirNombre();
					Pokedex1.modificar(miPokemon);
					break;
				case 4:
					miPokemon = Utilidades.PedirNombre();
					Pokedex1.liberar(miPokemon);
					break;
				case 5:
					salir = true;
					break;

				default:
					System.out.println("No has elegido una opción válida");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes elegir una opción entre 1 y 5");
			}

		} while (!salir);

	}

}
