import java.util.*;
public class boj1018_200118_KSH{
	public static void main(String[] args) {
		char[][] wmap = {{'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},
	            {'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},
	            {'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},
	            {'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'}};
		char[][] bmap = {{'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},
	            {'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},
	            {'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},
	            {'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'}};
		int ans=Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),M = sc.nextInt();
		char[][] map = new char[N][M];
		for(int i=0;i<N;i++) map[i]=sc.next().toCharArray();
		for(int i=0;i<=N-8;i++) {
			for(int j=0;j<=M-8;j++) {
				int wcnt=0,bcnt=0;
				for(int k=0;k<8;k++)
					for(int l=0;l<8;l++)
						if(map[k+i][l+j]!=wmap[k][l]) wcnt++;
				for(int k=0;k<8;k++)
					for(int l=0;l<8;l++)
						if(map[k+i][l+j]!=bmap[k][l]) bcnt++;
				ans=Math.min(ans,Math.min(wcnt, bcnt));
			}
		}
		System.out.println(ans);
	}
}
