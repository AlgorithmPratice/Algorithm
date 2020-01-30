import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 시간이 나면.. 다른 언어로 다시 풀어야 하는 문제..
public class Main {
	// 왼 아래 오른쪽 위쪽
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static char[][] map = new char[12][6];
	static boolean[][] visited;
	static ArrayList<Point> list;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static void solve() throws IOException {
		int ans = 0;
		
		for(int i = 0; i < 12; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		while(true) {
			boolean flag = false;
			visited = new boolean[12][6];
			
			for(int i = 0; i < 12; i++) {
				for(int j = 0; j < 6; j++) {
					if(!visited[i][j] && map[i][j] != '.') {
						list = new ArrayList<Point>();
						dfs(i, j, map[i][j]);
						if(list.size() >= 4) {
							flag = true;
							for (Point p : list) {
								map[p.y][p.x] = '.';
							}
						}
					}
				}
			}
			
			if(!flag) {
				break;
			}else {
				ans++;
			}
			
			paint();
		}
		System.out.println(ans);
	}
	
	public static void dfs(int y, int x, char ch) {
		for(int i = 0; i < 4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			
			if(0 <= nx && nx < 6 && 0 <= ny && ny < 12) {
				if(!visited[ny][nx] && map[ny][nx] == ch) {
					list.add(new Point(ny, nx));
					visited[ny][nx] = true;
					dfs(ny,nx,ch);
				}
			}
		}
	}
	
	public static void paint() {
		for(int i = 0; i < 6; i++) {
			for(int j = 10; j >= 0; j--) {
				for(int k = 11; k > j; k--) {
					if(map[j][i] != '.' && map[k][i] == '.') {
						map[k][i] = map[j][i];
						map[j][i] = '.';
						break;
					}
				}
			}
		}
	}
	
	public static class Point{
		int x, y;
		
		Point(int y, int x){
			this.y = y;
			this.x = x;
		}
	}
	
	public static void main(String[] args) throws IOException {
		solve();
	}

}
