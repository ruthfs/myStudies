import java.util.Scanner;

public class WhileAdicional {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num1=leitor.nextInt(),num2=leitor.nextInt();
		
		while (num1!=num2) {
			
			if (num1>num2) {
				System.out.println("Decrescente!");
			}
			else {
				System.out.println("Crescente!");
			}
			num1=leitor.nextInt();
			num2=leitor.nextInt();
		}
		leitor.close();
	}
}
