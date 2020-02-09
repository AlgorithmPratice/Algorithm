import java.util.*;
public class boj7576_200209_KSH {
	public static void main(String[] args) {
		Queue<Pair> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int M=sc.nextInt();int N = sc.nextInt();
		int[][] map=new int[N][M];
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++) {
				map[i][j]=sc.nextInt();
				if(map[i][j]==1) q.add(new Pair(i,j));
			}
		int[] dx = {1,-1,0,0};
		int[] dy = {0,0,1,-1};
		while(!q.isEmpty()) {
			Pair pair = q.poll();
			for(int i=0;i<4;i++) {
				int nx=pair.x+dx[i];
				int ny=pair.y+dy[i];
				if(nx>=0&&nx<N&&ny>=0&&ny<M) {
					if(map[nx][ny]==0) {
						map[nx][ny]=map[pair.x][pair.y]+1;
						q.add(new Pair(nx,ny));					
					}
				}
			}
		}
		int max=0;
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++) {
				if(map[i][j]==0) {
					System.out.println(-1);
					return;
				}
				if(map[i][j]>max)max=map[i][j];
			}
		System.out.println(max-1);
		
	}
	static class Pair{
		private int x;
		private int y;
		Pair(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
}
