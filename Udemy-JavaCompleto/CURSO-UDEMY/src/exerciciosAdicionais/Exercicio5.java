package exerciciosAdicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		/*Calcule a m?dia de duas notas, reprocado caso a m?dia seja menor que 7, aprovado caso seja maior que 7, aprovado com distin??o
		 * caso seja, m?dia 10.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Qual a primeira nota ? ");
		nota1 = leitor.nextInt();
		
		System.out.println("Qual a segunda nota ? ");
		nota2 = leitor.nextInt();
		
		media = (nota1+nota2)/2;
		
		if (media<7) {
			System.out.println("Reprovado! Sua m?dia ? "+media);
		}
		else if (media>7 || media <=9) {
			System.out.println("Aprovado! Sua m?dia ?: "+media);
		}
		else if (media==10) {
			System.out.println("Parab?ns! Aprovado com distin??o!! M?dia: "+media);
		}
		else {
			System.out.println("Voc? n?o digitou um n?mero v?lido.");
		}
		
	}
}
