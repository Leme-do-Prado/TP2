
import java.util.Scanner;

public class TP02EX06 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String[][] array = new String[2][3];
		
for(int j=0;j<2;j++) {
	for(int i=0; i<3; i++) {
		array[j][i] = read.nextLine();
	}
		}

for(int j=0;j<2;j++) {
	for(int i=0; i<3; i++) {
		System.out.print(array[j][i]);
		System.out.print(" ");
	}
	System.out.println();
		}

	}
}
