import java.util.Scanner;

public class Exercicio4 {
	/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
    *hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
    *decimais.*/
	public static void main(String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num;
		double hrsTrabalhadas, res, valorHora;
		
		System.out.println("Digite o numero do funcion�rio: ");
		num = leitor.nextInt();
		
		System.out.println("Digite o valor de cada hora trabalhada: ");
		valorHora = leitor.nextDouble();
		
		System.out.println("Digite o numero de horas Trabalhadas: ");
		hrsTrabalhadas = leitor.nextDouble();
		
		res = hrsTrabalhadas * valorHora;
		
		System.out.println("O valor a ser pago �: "+ res);
		
	}

}
