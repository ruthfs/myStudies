package exerciciosAdicionais;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/* Fa?a um programa que calcule o s?lario do trabalhador e reajuste senguindo o seguinte crit?rio
		 * 280 - reajuste de 20% ----- 280 e 700 - reajuste de 15% ------ 700 e 1500 - reajuste de 10%
		 * 1500 em diante - reajuste de 5%
		 * mostrar na tela - o salario antes do reajuste, percentual de aumento aplicado, o valor do aumento, novo salario.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		double slrInicial, vlrReajuste, slrFinal;
		
		System.out.println("Digite o valor do sal?rio: ");
		slrInicial = leitor.nextDouble();
		
		if(slrInicial<=280) {
			vlrReajuste = slrInicial * 0.20;
			slrFinal = slrInicial + vlrReajuste;
			System.out.println("Seu sal?rio inicial era de R$ "+slrInicial+", foi apliacado um reajuste de 20%, R$ "+vlrReajuste+"! O novo salario ? de R$ "+slrFinal+".");
		}
		else if(slrInicial<=700) {
			vlrReajuste = slrInicial * 0.15;
			slrFinal = slrInicial + vlrReajuste;
			System.out.println("Seu sal?rio inicial era de R$ "+slrInicial+", foi apliacado um reajuste de 15%, R$ "+vlrReajuste+"! O novo salario ? de R$ "+slrFinal+".");
		}
		else if(slrInicial<=1500) {
			vlrReajuste = slrInicial * 0.10;
			slrFinal = slrInicial + vlrReajuste;
			System.out.println("Seu sal?rio inicial era de R$ "+slrInicial+", foi apliacado um reajuste de 10%, R$ "+vlrReajuste+"! O novo salario ? de R$ "+slrFinal+".");
		}
		else if(slrInicial>=1501) {
			vlrReajuste = slrInicial * 0.05;
			slrFinal = slrInicial + vlrReajuste;
			System.out.println("Seu sal?rio inicial era de R$ "+slrInicial+", foi apliacado um reajuste de 5%, R$ "+vlrReajuste+"! O novo salario ? de R$ "+slrFinal+".");
		}
		
		
		
	}
}
