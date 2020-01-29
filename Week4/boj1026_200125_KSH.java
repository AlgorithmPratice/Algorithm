import java.util.*;
public class boj1026_200125_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int S = 0;
		for(int i=0;i<N;i++) A[i]=sc.nextInt();
		for(int i=0;i<N;i++) B[i]=sc.nextInt();
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i=0;i<N;i++) S+=A[i]*B[N-1-i];
		System.out.println(S);
	}
}
