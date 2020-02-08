import java.util.*;
public class boj1260_200208_KSH {
	static int[][] graph;
	public static int[] visited;
	static int N,M,V;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();M=sc.nextInt();V=sc.nextInt();
		graph=new int[N+1][N+1];
		visited=new int[N+1];
		for(int i=1;i<=M;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			graph[a][b]=graph[b][a]=1;
		}
		DFS(V);
		for(int i=0;i<N+1;i++) visited[i]=0;
		System.out.println();
		BFS(V);
	}
	public static void DFS(int i) {
		visited[i]=1;
		System.out.print(i+" ");
		for(int j=1;j<=N;j++)
			if(graph[i][j]==1&&visited[j]==0)DFS(j);
		
	}
	public static void BFS(int i) {
		Queue<Integer> q = new LinkedList<>();
		q.add(i);
		visited[i]=1;
		System.out.print(i+" ");
		while(!q.isEmpty()) {
			int tmp=q.poll();
			for(int j=1;j<=N;j++) {
				if(graph[tmp][j]==1&&visited[j]==0) {
					q.add(j);
					visited[j]=1;
					System.out.print(j+" ");
				}
			}
		}
	}
}
