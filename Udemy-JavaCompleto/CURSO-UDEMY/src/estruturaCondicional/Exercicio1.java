package estruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner leitor = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num = leitor.nextInt();
		
		if (num < 0) {
			System.out.println("Número Negativo!");
		}
		
		else {
			System.out.println("Número Positivo!");	
		}
				
	}

}
