import java.util.Scanner;

public class TP02EX07 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int array[][] = new int[3][4]; 
		
for(int j=0;j<3;j++) {
	for(int i=0; i<4; i++) {
		array[j][i] = read.nextInt();
	}
		}

System.out.println("Constante multiplicativa?");
int n = read.nextInt();

for(int j=0;j<3;j++) {
	for(int i=0; i<4; i++) {
		array[j][i] *= n;
	}
		}


	}
}
