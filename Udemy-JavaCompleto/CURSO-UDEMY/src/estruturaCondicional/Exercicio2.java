package estruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String [] args) {
		
		//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.

		Scanner leitor = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um n�mero: ");
		num = leitor.nextInt();
		
		
		if (num % 2 == 0) {
			
			System.out.println("N�mero � par!");
		}
		
		else {
			System.out.println("N�mero � impar!!");
		}
		
	}
	
}
