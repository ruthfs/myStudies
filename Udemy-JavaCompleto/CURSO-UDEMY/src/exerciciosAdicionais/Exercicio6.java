package exerciciosAdicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Fa�a um programa que leia 3 numeros e mostre o maior valor.
		
		Scanner leitor = new Scanner(System.in);
		
		int num1=leitor.nextInt(),num2=leitor.nextInt(),num3=leitor.nextInt();
		
		if (num1 > num2 && num1 >num3) {
			System.out.println("O maior numeoro �: "+num1);
		} 
		else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior numeoro �: "+num2);
		}
		else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior numeoro �: "+num3);
		}
		
	}
}
