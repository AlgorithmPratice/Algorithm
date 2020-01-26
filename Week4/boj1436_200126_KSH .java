////////////V1
import java.util.*;
public class boj1436_200126_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt=1;
		int stn=666;
		while(cnt!=N) {
			stn++;
			int tmp=stn;
			int c6=0;
			while(tmp>0) {
				if(tmp%10==6) c6++;
				else if(c6<3) c6=0;
				tmp/=10;
			}
			if(c6>=3) cnt++;
		}
		System.out.println(stn);
	}
}
/////////V2
import java.util.*;
public class boj1436_200126_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int stn=666;
		while(N>1) {
			++stn;
			if(Integer.toString(stn).contains("666"))N--;
		}
		System.out.println(stn);
	}
}
