package exerciciosAdicionais;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		//Fa?a um programa que pe?a dois numeros e imprima o maior deles.
		
		Scanner leitor = new Scanner(System.in);
		
		int num1= leitor.nextInt(), num2=leitor.nextInt();
		
		if(num1>num2) {
			System.out.println("O maior numero ? "+ num1);	
		}
		else {
			System.out.println("O maior numero ? "+ num2);	

		}
		
	}

}
