import java.util.*;
public class boj7568_200125_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N][3];
		for(int i=0;i<N;i++)
			for(int j=0;j<2;j++) a[i][j] = sc.nextInt();		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				if(a[i][0]<a[j][0]&&a[i][1]<a[j][1]) a[i][2]++;
		for(int i=0;i<N;i++)
			System.out.print(a[i][2]+1+" ");
	}
}
