package estruturaCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		 * Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em 
		 * ordem crescente ou decrescente.
		 */

		Scanner leitor = new Scanner(System.in);
		
		int num1=leitor.nextInt(), num2=leitor.nextInt(), res;
		
		if (num1 % num2 == 0 || num2 % num1==0) {
			System.out.println("S�o M�ltiplos!");
		}
		else if (num1 % num2 !=0 || num2 % num1 !=0) {
			System.out.println("N�o s�o M�ltiplos!");
		}
	
	}

}
