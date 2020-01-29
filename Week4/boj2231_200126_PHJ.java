import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int size = String.valueOf(n).length();
		int start = n - (9 * size);
		int ans = 0;

		for(int i = start; i < n; i++) {
			int sum = i;
			int k = i;
			while(k > 0) {
				sum += k % 10;
				k /= 10;
			}
			if(sum == n) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}
