import java.util.*;
public class boj9517_200126_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K=sc.nextInt();
		int N=sc.nextInt();
		int time=0;
		for(int i=1;i<=N;i++) {
			int T=sc.nextInt();
			String A=sc.next();
			time+=T;
			if(time>=210) {
				System.out.println(K);
				break;
			}
			if(A.equals("T")) {
				K++;
				if(K==9) K=1;
			}
		}
	}
}
