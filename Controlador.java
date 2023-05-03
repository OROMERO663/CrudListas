package crudListas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Controlador. Programa Principal, ejecuta los metodos necesarios para
 * poder incluir, consultar, modificar o liberar Pokemon de una Pokedex usando
 * POO y listas de Arrays.
 * 
 * @author Oscar
 * @version 1
 */
public class Controlador {

	/**
	 * Metodo Principal muestra el menu de opciones y llama al metodo
	 * correspondiente para ejecutar la opcion elegida. 
	 * Interaccion por consola: pide al usuario elegir un nombre de entrenador y posteriormente una opcion del menu. 
	 * Mensajes por consola: saca un mensaje de bienvenida al juego y pregunta el nombre al usuario.
	 * Mensajes por consola: saca un mensaje con la lista acciones que el usuario puede realizar.
	 * Mensajes por consola: saca un mensaje de error si el dato introducido no es valido.
	 * 
	 * @author Oscar
	 * @param args Dato de entrada
	 */
	public static void main(String[] args) {

		int eleccion, eleccion2;
		boolean salir = false;
		Pokemon miPokemon = new Pokemon("", "", "");
		Pokedex Pokedex1 = new Pokedex("");
		String nombre;
		String nombreEntrenador = ("");

		do {
			Utilidades.MensajeInicio();
			try {
				nombreEntrenador = Utilidades.PedirEntrenador();
				if (nombreEntrenador.equals("")) {
					System.out.println("Introduce un nombre de entrenador");
				} else {
					Pokedex1.addEntrenador(nombreEntrenador);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (nombreEntrenador == "");

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
					Utilidades.MenuConsular();
					try {
						Scanner lector2 = new Scanner(System.in);
						eleccion2 = lector.nextInt();
						lector.nextLine();
						switch (eleccion2) {
						case 1:
							miPokemon = Utilidades.PedirNombre();
							Pokedex1.buscarNombre(miPokemon);
							break;
						case 2:
							miPokemon = Utilidades.PedirTipo();
							Pokedex1.buscarTipo(miPokemon);
							break;
						case 3:
							miPokemon = Utilidades.PedirRegion();
							Pokedex1.buscarRegion(miPokemon);
							break;
						case 4:
							Pokedex1.pokedexCompleta();
							break;

						default:
							System.out.println("No has elegido una opción válida");
							break;
						}

					} catch (InputMismatchException e) {
						System.out.println("Debes elegir una opción entre 1 y 4");
					}

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
