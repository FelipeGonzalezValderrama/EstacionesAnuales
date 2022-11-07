package cl.felipeGonzalez;

import java.util.Scanner;

public class SwitchJava {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Ingresa un numero del 1 al 4");
		var numero = sc.nextInt();
		var numeroTexto = "numero desconocido";
		switch (numero) {
		case 1:
			numeroTexto = "numero uno";
			break;
		case 2:
			numeroTexto = "numero dos";
			break;

		case 3:
			numeroTexto = "numero tres";
			break;

		case 4:
			numeroTexto = "numero cuatro";
			break;
		default:
			numeroTexto = "numero no encontrado";
			break;
		}
		System.out.println("numeroTexto es = " + numeroTexto);
	}

}
