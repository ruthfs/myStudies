package estruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
		Scanner leitor = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num = leitor.nextInt();
		
		if (num < 0) {
			System.out.println("N�mero Negativo!");
		}
		
		else {
			System.out.println("N�mero Positivo!");	
		}
				
	}

}
