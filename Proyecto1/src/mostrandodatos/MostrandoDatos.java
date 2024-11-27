package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public MostrandoDatos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");
		String nombre = scanner.nextLine();

		System.out.print("Introduce tu apellido: ");
		String apellido = scanner.nextLine();

		System.out.println("Nombre completo: " + nombre + " " + apellido);

		scanner.close();
	}

}
