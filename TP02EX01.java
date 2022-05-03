import java.util.Scanner;

public class TP02EX01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double n1 = read.nextDouble();
		double n2 = read.nextDouble();
		
		do {
			System.out.println("O segundo número deve superar o primeiro. Tente de novo:");
			n2 = read.nextDouble();
		} while (n1 > n2);
	}
}
