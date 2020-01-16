import java.util.*;
public class boj1551_200116_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),K=sc.nextInt();
		String[] A= sc.next().split(",");
		int[] B = new int[N];
		for(int i=0;i<K;i++)
			for(int j=0;j<N-1;j++)
				if(i==0) B[j]=Integer.parseInt(A[j+1])-Integer.parseInt(A[j]);
				else B[j]=B[j+1]-B[j];
		String ans="";
		for(int i=0;i<N-K;i++) {
			if(K==0) ans+=A[i]+",";
			else ans+=B[i]+",";
		}
		System.out.println(ans.substring(0,ans.length()-1));
	}
}
