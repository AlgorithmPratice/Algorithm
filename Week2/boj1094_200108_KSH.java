//V1
import java.util.*;

public class boj1094_200108_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(),cnt=0;
		while(X!=0) {
			if(X%2==1)cnt++;
			X/=2;
		}System.out.println(cnt);
	}
}

//V2
import java.util.*;

public class boj1094_200108_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		System.out.println(Integer.bitCount(X));
	}
}
