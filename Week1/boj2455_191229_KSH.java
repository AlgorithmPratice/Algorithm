import java.util.*;

public class boj2455_191229_KSH {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int tp=0, ans=0;
		for(int i=0;i<4;i++) {
			tp-=sc.nextInt();
			tp+=sc.nextInt();
			if(ans<tp)ans=tp;
		}
		System.out.println(ans);
	}
}
