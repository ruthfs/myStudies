import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		/*Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
		 * Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
		 * essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		 */
		
		Scanner leitor=new Scanner(System.in);
		
		int N, X, in=0, out=0;
		
		System.out.print("Quantidade de repeti��es: ");
		N=leitor.nextInt();
		
		for (int i=0; i<N;i++) {
			X=leitor.nextInt();
			if(X>=10 && X<=20) {
				in = in +1;
			}
			else {
				out = out +1;
			}
		}
		System.out.println("in "+in);
		System.out.println("out "+out);
		leitor.close();
	}

}
