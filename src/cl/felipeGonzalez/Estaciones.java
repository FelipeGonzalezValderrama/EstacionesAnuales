package cl.felipeGonzalez;

import java.util.Scanner;

public class Estaciones {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Ingresa una estacion del año en formato numerico del 1 al 12");
		var mes = sc.nextInt();
		var estacion = "estacion desconocida";
		if (mes == 1 || mes == 2 || mes == 12) {
			estacion = "verano";

		} else if (mes == 3 || mes == 4 || mes == 5) {
			estacion = "Otono";
		} else if (mes == 6 || mes == 7 || mes == 8) {
			estacion = "Invierno";
		} else if (mes == 9 || mes == 10 || mes == 11) {
			estacion = "Primavera";
		} else {
			System.out.println("ingreso una estacion fuera del rango de los 12");
		}
			System.out.println("La estacion del año es: " + estacion);
		}

	}


