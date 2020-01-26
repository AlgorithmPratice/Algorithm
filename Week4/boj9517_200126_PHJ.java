import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int BombTime = 210;
		
		for(int i = 0; i < N; i++) {
			String[] TnZ = br.readLine().split(" ");
			int T = Integer.parseInt(TnZ[0]);
			String Z = TnZ[1];
			
			BombTime -= T;
			if(BombTime <= 0) {
				System.out.println(K);
				break;
			}
			if(Z.equals("T")) {
				K += 1;
			}
			if(K > 8) {
				K %= 8;
			}
		}
		
	}

}
