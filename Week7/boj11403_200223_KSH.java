import java.util.*;

public class boj11403_200223_KSH {
	static int[][] map;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		map = new int[N][N];
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				map[i][j]=sc.nextInt();
		for(int i=0;i<N;i++) {
			visited = new boolean[N];
			for(int j=0;j<N;j++) {
				if(map[i][j]==1&&visited[j]==false) bfs(i, j, N);
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++)
				System.out.print(map[i][j]+" ");
			System.out.println();
		}
	}
	static void bfs(int x,int y,int N) {
		visited[y]=false;
		Queue<Integer> q = new LinkedList<>();
		q.add(y);
		while(!q.isEmpty()) {
			int tmp=q.poll();
			for(int i=0;i<N;i++) {
				if(visited[i]==false&&map[tmp][i]==1) {
					q.add(i);
					map[x][i]=1;
					visited[i]=true;
				}
			}
		}
	}
}
