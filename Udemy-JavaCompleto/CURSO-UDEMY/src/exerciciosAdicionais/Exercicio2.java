package exerciciosAdicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[]args) {
		
		//Mostrar na tela se o valor é positivo ou negativo.
		
		Scanner leitor = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = leitor.nextInt();
		
		if (num >=0) {
			System.out.println("Positivo!");
		}
		else {
			System.out.println("Negativo!");
		}
		
	}
}
