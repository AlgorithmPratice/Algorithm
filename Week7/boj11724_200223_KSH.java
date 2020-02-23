import java.util.*;
public class boj11724_200223_KSH {
	static int[][] map;
	static int[] visited;
	static int cnt=0,N,M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		map= new int[N+1][N+1];
		visited=new int[N+1];
		for(int i=0;i<M;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			map[x][y]=map[y][x]=1;
		}
		for(int i=1;i<=N;i++)
			if(visited[i]==0) {
				cnt++;
				dfs(i,cnt);
			}
		System.out.println(cnt);
	}
	static void dfs(int x,int cnt) {
		visited[x]=cnt;
		for(int i=1;i<=N;i++ ) {
			if(map[x][i]==1&&visited[i]==0)
				dfs(i,cnt);
		}
	}
}
