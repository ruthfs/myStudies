import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
*c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago. */
	
		Scanner leitor = new Scanner (System.in);
		
		int cod1, cod2;
		double num1, num2, valor1, valor2, res1, res2, total;
		
		System.out.println("Digite o c�digo da pe�a 1: ");
		cod1 = leitor.nextInt();
		
		System.out.println("Qual o valor unitario da pe�a? ");
		valor1 = leitor.nextDouble();
		
		System.out.println("Quantas pe�as ser�o levadas? ");
		num1 = leitor.nextInt();
		
		System.out.println("Digite o c�digo da pe�a 2: ");
		num1= leitor.nextDouble();
		
		System.out.println("Qual o valor unitario da pe�a? ");
		valor2 =leitor.nextDouble();
		
		System.out.println("Quantas pe�as ser�o levadas? ");
		num2 = leitor.nextDouble();
		
		res1 =  valor1 * num1;
		res2 = valor2 * num2;
		total = res1 + res2;
		
		System.out.println("O valor total �: "+ total);
		
	}

}
