import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int wnh[][] = new int[num][2];
		int rank[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			rank[i] = 1;
			wnh[i][0] = sc.nextInt();
			wnh[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(wnh[i][0] > wnh[j][0] && wnh[i][1] > wnh[j][1]) {
					rank[j]++;
				}
			}
		}
		for(int i = 0; i < num; i++) {
			System.out.print(rank[i] + " ");
		}
	}
}
