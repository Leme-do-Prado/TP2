import java.util.Scanner;

public class TP02EX10 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int m = read.nextInt();
		
		int[][] array = new int[m][m];
		
		if(m<=10) {
			for(int i = 0; i<m; i++) {
				for(int j= 0; j<m; j++) {
					array[i][j] = read.nextInt();
				}
			}
			System.out.println("Matriz:");
			for(int i = 0; i<m; i++) {
				for(int j= 0; j<m; j++) {
					System.out.print(array[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println("Matriz transposta correspondente:");
			for(int i = 0; i<m; i++) {
				for(int j= 0; j<m; j++) {
					System.out.print(array[j][i]);
					System.out.print(" ");
				}
				System.out.println();
			}
		}
