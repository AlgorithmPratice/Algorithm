import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int num = 0;
		
		while(N > 0) {
			num++;
			String str = Integer.toString(num);
			
			if(str.contains("666")) {
				N--;
			}
		}
		
		System.out.println(num);
	}

}
