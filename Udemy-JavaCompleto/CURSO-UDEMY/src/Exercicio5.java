import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
*código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */
	
		Scanner leitor = new Scanner (System.in);
		
		int cod1, cod2;
		double num1, num2, valor1, valor2, res1, res2, total;
		
		System.out.println("Digite o código da peça 1: ");
		cod1 = leitor.nextInt();
		
		System.out.println("Qual o valor unitario da peça? ");
		valor1 = leitor.nextDouble();
		
		System.out.println("Quantas peças serão levadas? ");
		num1 = leitor.nextInt();
		
		System.out.println("Digite o código da peça 2: ");
		num1= leitor.nextDouble();
		
		System.out.println("Qual o valor unitario da peça? ");
		valor2 =leitor.nextDouble();
		
		System.out.println("Quantas peças serão levadas? ");
		num2 = leitor.nextDouble();
		
		res1 =  valor1 * num1;
		res2 = valor2 * num2;
		total = res1 + res2;
		
		System.out.println("O valor total é: "+ total);
		
	}

}
