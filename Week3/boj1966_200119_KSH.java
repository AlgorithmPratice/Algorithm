import java.util.*;
public class boj1966_200119_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=0;t<tc;t++) {
			int N = sc.nextInt(),M = sc.nextInt();
			int[] a = new int[N];
			for(int i=0;i<N;i++) a[i]=sc.nextInt();
			int[] s = a.clone();
			Arrays.sort(s);
			int idx=0,sidx=s.length-1,cnt=0;
			while(true) {
				if(a[idx]==s[sidx]) {
					cnt++;
					sidx--;
					if(M==idx) {
						System.out.println(cnt);
						break;
					}
				}
				idx++;
				if(idx==s.length)idx=0;
			}
		}
	}
}
