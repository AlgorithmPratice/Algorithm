import java.util.*;
public class boj2979_200116_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),ans=0;
		int[] c= new int[101];
		for(int i=0;i<3;i++) {
			int s=sc.nextInt(),e=sc.nextInt();
			for(int j=s;j<e;j++) c[j]++;
		}
		for(int i=1;i<101;i++) {
			if(c[i]==1) ans+=A*c[i];
			if(c[i]==2) ans+=B*c[i];
			if(c[i]==3) ans+=C*c[i];
		}
		System.out.println(ans);
	}
}
