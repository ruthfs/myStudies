import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		/*Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
		 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002
		 */
		
		
		Scanner leitor = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Digite a senha: ");
		senha=leitor.nextInt();
		
		while(senha!=2002) {
			System.out.println("Senha Inv�lida!");
			senha=leitor.nextInt();
		}
		
		System.out.println("Acesso permitido!");
	}

}
