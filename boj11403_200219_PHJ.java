import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static int[][] arr;
	static java.util.Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		arr = new int[N][N];
		int temp; 
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(arr[i][j] == 1) {
					queue.add(j);
				}
			}
			while(!queue.isEmpty()) {
				temp = queue.poll();
				bfs(i,temp);
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				bw.write(arr[i][j]+ " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		
	}
	
	public static void bfs(int i, int temp) {
		arr[i][temp] = 1;
		for(int j = 0; j < arr.length; j++) {
			if(arr[temp][j] == 1 && arr[i][j] != 1) {
				queue.add(j);
			}
		}
	}
}
