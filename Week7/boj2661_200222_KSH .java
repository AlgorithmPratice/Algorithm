import java.util.*;

public class boj2661_200222_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		go("",N);
	}
	static void go(String S, int depth) {
		if(S.length()==depth) {
			System.out.println(S);
			System.exit(0);
		}else {
			for(int i=1;i<=3;i++)
				if(check(S+i))go(S+i,depth);
		}
	}
	static boolean check(String S) {
		for(int i=1;i<=S.length()/2;i++)
			if(S.substring(S.length()-i).equals(S.substring(S.length()-2*i,S.length()-i)))
						return false;
		return true;
	}
}
