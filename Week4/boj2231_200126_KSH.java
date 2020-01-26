import java.util.*;
public class boj2231_200126_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans=0;
		for(int i=0;i<N;i++) {
			int sum=i;
			int k=i;
			while(k>0) {
				sum+=k%10;
				k/=10;
			}
			if(sum==N) {
				ans=i;
				break;
			}
		}
		System.out.println(ans);
	}
}
