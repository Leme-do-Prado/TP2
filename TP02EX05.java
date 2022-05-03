import java.util.Scanner;

public class TP02EX05 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int array[][] = new int[3][2]; 
		
for(int j=0;j<3;j++) {
	for(int i=0; i<2; i++) {
		array[j][i] = read.nextInt();
	}
		}

for(int j=0;j<3;j++) {
	for(int i=0; i<2; i++) {
		System.out.print(array[j][i]);
		System.out.print(" ");
	}
	System.out.println();
		}

	}
}
