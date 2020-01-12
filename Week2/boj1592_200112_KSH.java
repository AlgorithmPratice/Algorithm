import java.util.*;
public class boj1592_200112_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),L=sc.nextInt(),c=1,cnt=0;
		int[] a = new int[N+1];
		while(++a[c]!=M) {
			if(a[c]%2==0) c=(c+L)%N;
			else c=(c-L+N)%N;
			cnt++;
		}System.out.println(cnt);
	}
}
