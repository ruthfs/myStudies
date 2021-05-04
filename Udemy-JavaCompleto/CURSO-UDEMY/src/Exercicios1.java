import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

public class Exercicios1 {
	
	public static void main(String [] args) {
		
		Scanner leitor = new Scanner (System.in); 
		int num1, num2, res;
		
		System.out.println("Digite o valor 1: ");
		num1 = leitor.nextInt();
		System.out.println("Digite o valor 2: ");
		num2 = leitor.nextInt();
		res = num1 + num2;
		
		System.out.println("A soma dos dois valores é: "+res);
		
	}

}
