package crudListas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pokedex {

	private String entrenador;
	private ArrayList<Pokemon> miPokedex = new ArrayList<Pokemon>();

	public Pokedex(String entrenador) {
		super();
		this.entrenador = entrenador;
	}

	public String getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}

	public ArrayList<Pokemon> getMiPokedex() {
		return miPokedex;
	}

	public void setMiPokedex(ArrayList<Pokemon> miPokedex) {
		this.miPokedex = miPokedex;
	}

	@Override
	public String toString() {
		return "Pokedex [entrenador=" + entrenador + ", miPokedex=" + miPokedex + "]";
	}

	public void addPokemon(Pokemon nuevo) {
		String nombre = nuevo.getNombre();
		String tipo = nuevo.getTipo();
		String region = nuevo.getRegion();
		nuevo = new Pokemon(nombre, tipo, region);
		miPokedex.add(nuevo);
	}

	public void buscar(Pokemon consulta) {

		String nombre = consulta.getNombre();
		int longitud = miPokedex.size();
		boolean encontrado = false;
		int contador = 0;

		do {
			if (miPokedex.get(contador).getNombre().equals(nombre)) {
				System.out.println("El Pokemon " + nombre + " está en tu Pokedex. Es un Pokemon de tipo "
						+ miPokedex.get(contador).getTipo() + " y pertenece a la región de "
						+ miPokedex.get(contador).getRegion());
				encontrado = true;
			}
			contador++;
			if (contador == longitud && !encontrado) {
				System.out.println(nombre + " no está en tu Pokedex");
			}
		} while (contador < longitud && !encontrado);
		System.out.println("-----------------------------------------------");
		System.out.println("Tu Pokedex actual contiene los siguientes Pokemon :");
		for (int i = 0; i < longitud; i++) {
			System.out.println("Pokemon " + (i + 1) + ": " + miPokedex.get(i).getNombre() + ", Tipo: "
					+ miPokedex.get(i).getTipo() + ", Región: " + miPokedex.get(i).getRegion());
		}
		System.out.println("-----------------------------------------------");

	}

	public void modificar(Pokemon modifica) {

		String nombre = modifica.getNombre();
		int longitud = miPokedex.size();
		boolean encontrado = false;
		int contador = 0;

		do {
			if (miPokedex.get(contador).getNombre().equals(nombre)) {
				System.out.println(
						"El Pokemon " + nombre + " está en tu Pokedex. Introduce los nuevos datos para modificarlo: ");
				encontrado = true;
				modifica = Utilidades.PedirPokemon();
				miPokedex.remove(contador);
				miPokedex.add(contador, modifica);
			}
			contador++;
			if (contador == longitud && !encontrado) {
				System.out.println(nombre + " no está en tu Pokedex");
			}
		} while (contador < longitud && !encontrado);

	}

	public void liberar(Pokemon libera) {

		String nombre = libera.getNombre();
		int longitud = miPokedex.size();
		boolean encontrado = false;
		int contador = 0;

		do {
			if (miPokedex.get(contador).getNombre().equals(nombre)) {
				System.out.println("El Pokemon " + nombre + " Ha sido liberado. ¡Buena suerte " + nombre + "!");
				encontrado = true;
				miPokedex.remove(contador);
			}
			contador++;
			if (contador == longitud && !encontrado) {
				System.out.println("El Pokemon " + nombre + " no está en tu Pokedex");
			}
		} while (contador < longitud && !encontrado);

	}

}
