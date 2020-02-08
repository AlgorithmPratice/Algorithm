import java.util.*;
public class boj14502_200208_KSH {
	static int[][] map;
	static int[][] cmap;
	static int N, M, Max=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();M=sc.nextInt();
		map=new int[N][M];
		cmap=new int[N][M];
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				map[i][j]=cmap[i][j]=sc.nextInt();
		Go(0);
		System.out.println(Max);
	}
	static void Go(int depth) {
		if(depth==3) {
			Queue<Pair> q = new LinkedList<>();
			clonemap();
			for(int i=0;i<N;i++)
				for(int j=0;j<M;j++)
					if(cmap[i][j]==2)q.add(new Pair(i,j));
			int[] dx = {1,-1,0,0};
			int[] dy = {0,0,1,-1};
			while(!q.isEmpty()) {
				Pair pair = q.poll();
				for(int i=0;i<4;i++) {
					int nx=pair.x+dx[i];
					int ny=pair.y+dy[i];
					if(nx>=0&&nx<N&&ny>=0&&ny<M) {
						if(cmap[nx][ny]==0) {
							cmap[nx][ny]=2;
							q.add(new Pair(nx,ny));
						}
					}
				}
			}
			int cnt=0;
			for(int i=0;i<N;i++)
				for(int j=0;j<M;j++)
					if(cmap[i][j]==0)cnt++;
			Max=Math.max(cnt, Max);
			return;
		}
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				if(map[i][j]==0) {
					map[i][j]=1;
					Go(depth+1);
					map[i][j]=0;
				}
	}
	static void clonemap() {
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				cmap[i][j]=map[i][j];
	}
	static class Pair{
		private int x;
		private int y;
		Pair(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
}
