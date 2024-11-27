package sumando;

import java.util.Scanner;

public class Sumando {

	public Sumando() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int num1 = scanner.nextInt();

		System.out.print("Introduce el segundo número: ");
		int num2 = scanner.nextInt();

		System.out.println("La suma es: " + (num1 + num2));

		scanner.close();
	}

}
