package exerciciosAdicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		 
		char genero;
		
		System.out.println("Qual seu gênero ? Feminino (F), Masculino (M), Não Binário (N)");
		genero= leitor.next().charAt(0);
		
		if (genero=='F' || genero=='f') {
			System.out.println("Você escolher Feminino!");
		}
		else if (genero=='M' || genero=='m') {
			System.out.println("Você escolher Masculino!");
		}
		else if (genero=='N' || genero=='n') {
			System.out.println("Você escolher Não Binário!");
		}
		else {
			System.out.println("Você não escolheu nenhuma das opções!");
		}
		
		leitor.close();

	}

}
