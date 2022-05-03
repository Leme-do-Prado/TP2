import java.util.Scanner;

public class TP02EX02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int maior = 0;
		int incrementador = 0;
		
		for(int i=0; i<10; i++) {
			int n = read.nextInt();
			if(n>maior) {
				maior = n;
			}
			incrementador += n;
		}
		
		double media  = incrementador / 10;
		
		System.out.println(maior);
		System.out.println(media);
	}
}
