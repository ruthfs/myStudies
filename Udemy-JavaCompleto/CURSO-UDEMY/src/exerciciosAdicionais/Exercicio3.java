package exerciciosAdicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		 
		char genero;
		
		System.out.println("Qual seu g�nero ? Feminino (F), Masculino (M), N�o Bin�rio (N)");
		genero= leitor.next().charAt(0);
		
		if (genero=='F' || genero=='f') {
			System.out.println("Voc� escolher Feminino!");
		}
		else if (genero=='M' || genero=='m') {
			System.out.println("Voc� escolher Masculino!");
		}
		else if (genero=='N' || genero=='n') {
			System.out.println("Voc� escolher N�o Bin�rio!");
		}
		else {
			System.out.println("Voc� n�o escolheu nenhuma das op��es!");
		}
		
		leitor.close();

	}

}
