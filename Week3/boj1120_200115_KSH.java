import java.util.*;

public class boj1120_200115_KSH {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next(),B = sc.next();
		int min=A.length();
		for(int i=0;i<=B.length()-A.length();i++) {
			int tmp=0;
			for(int j=0;j<A.length();j++)
				if(A.charAt(j)!=B.charAt(i+j)) tmp++;
			min=Math.min(tmp, min);
		}
		System.out.println(min);
	}
}
