import java.util.Scanner;

public class TP02EX03 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int n = 0;
		
		while(n < 20 && n <= 0) {
			System.out.println("Digite um número. Este deve ser inferior a 20 e positivo.");
			n = read.nextInt();
		}
		
		int nn = 0;
		int np = 0;
		int maior = 0;
		int menor = 0;
		int incrementador = 0;
		
		for(int i = 0; i<n; i++) {
			
			int nq = read.nextInt();
			
			if(nq > maior) {
				maior = nq;
			}
			if(nq<menor) {
				menor = nq;
			}
			if(nq<0) {
				nn++;
			}
			if(nq>1) {
				np++;
			}
			
			incrementador += nq;
		}
		
		double media  = incrementador / n;
		
		System.out.println(maior);
		System.out.println(menor);
		System.out.println(np);
		System.out.println(nn);
		System.out.println(incrementador);
		System.out.println(media);
	}
}
