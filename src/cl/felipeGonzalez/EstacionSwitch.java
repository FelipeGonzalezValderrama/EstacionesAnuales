package cl.felipeGonzalez;

import java.util.Scanner;

public class EstacionSwitch {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Ingresa una estacion del año numerica del 1 al 12");
		var mes = sc.nextInt();
		var estacion = "Estacion Desconocida";

		switch (mes) {
		case 1:
		case 2:
		case 12:
			estacion = "Verano";

			break;
		case 3:
		case 4:
		case 5:
			estacion = "Otono";
			break;
		case 6:
		case 7:
		case 8:
			estacion = "Invierno";
			break;

		case 9:
		case 10:
		case 11:
			estacion = "Primavera";
			break;

		}
		System.out.println("La Estacion del Ano es: " + estacion);
	}

}
