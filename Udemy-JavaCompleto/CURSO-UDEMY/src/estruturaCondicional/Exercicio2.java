package estruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String [] args) {
		
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

		Scanner leitor = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = leitor.nextInt();
		
		
		if (num % 2 == 0) {
			
			System.out.println("Número é par!");
		}
		
		else {
			System.out.println("Número é impar!!");
		}
		
	}
	
}
