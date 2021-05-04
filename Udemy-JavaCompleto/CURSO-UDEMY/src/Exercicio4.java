import java.util.Scanner;

public class Exercicio4 {
	/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    *hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    *decimais.*/
	public static void main(String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num;
		double hrsTrabalhadas, res, valorHora;
		
		System.out.println("Digite o numero do funcionário: ");
		num = leitor.nextInt();
		
		System.out.println("Digite o valor de cada hora trabalhada: ");
		valorHora = leitor.nextDouble();
		
		System.out.println("Digite o numero de horas Trabalhadas: ");
		hrsTrabalhadas = leitor.nextDouble();
		
		res = hrsTrabalhadas * valorHora;
		
		System.out.println("O valor a ser pago é: "+ res);
		
	}

}
