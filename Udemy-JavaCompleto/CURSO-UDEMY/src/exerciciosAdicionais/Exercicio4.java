package exerciciosAdicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//Fa�a um programa que identifique se a letra digitada � vogal ou consoante.
		
		Scanner leitor = new Scanner(System.in);
		
		char letra;
		
		System.out.println("Digite alguma letra do alfabeto: ");
		letra = leitor.next().charAt(0);
		
		if (letra=='A' || letra=='E' ||letra=='I' ||letra=='O' ||letra=='U' || letra=='a' || letra=='e' ||letra=='i' ||letra=='o' ||letra=='u' ) {
				System.out.println("Vogal!");
		}
		else {
			System.out.println("Consoante!");
		}
	}

}
