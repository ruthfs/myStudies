import java.util.Scanner;

public class OPCIONAL {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num=leitor.nextInt(), soma=0;
		
		while (num!=0) {
			soma = soma + num;
			num = leitor.nextInt();
		}
		
		System.out.println(soma);

		leitor.close();
	}

}
