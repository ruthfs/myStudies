import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		/*
		 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
		 * um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
		 * 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
		 * que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
		 * exemplo.
		 */
	
		Scanner leitor = new Scanner(System.in);
	
		char tipo;
		int alcool=0,gasolina=0,diesel=0;
	
		System.out.println("Qual o tipo de conbustivel ? 1.�lcool 2.Gasolina 3.Diesel 4.Fim");
		tipo=leitor.next().charAt(0);
		
		while (tipo!='4') {
			
			if(tipo=='1') {
				alcool+=1;
			}
			else if(tipo=='2') {
				gasolina+=1;
			}
			else if (tipo=='3') {
				diesel+=1;
			}
			
			tipo=leitor.next().charAt(0);
			
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("�lcool "+alcool);
		System.out.println("Gasolina "+gasolina);
		System.out.println("Diesel "+diesel);
	}

}
