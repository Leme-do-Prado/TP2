import java.util.Scanner;

public class TP02EX09 {
	public static void main(String[] args) {

	Scanner read = new Scanner(System.in);

int rows = read.nextInt();
int cols = read.nextInt();
int[][] array = new int[rows][cols];   

if(rows<10 && cols<10) {
	for(int i = 0; i<rows; i++) {
		for(int j=0; j<cols; j++) {
			array[i][j] = read.nextInt();
		}
	}
	
	if(rows<10 && cols<10) {
		for(int i = 0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(array[j][i]);
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
	}
}

