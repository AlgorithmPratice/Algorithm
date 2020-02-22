import java.util.*;

public class boj9663_20200222_KSH {
	static int cnt=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=N;i++) {
			int[] arr = new int[N+1];
			arr[1]=i;
			go(arr,1,N);
		}
		System.out.println(cnt);
	}
	static void go(int[] arr,int dep,int N) {
		if(dep==N) cnt++;
		else {
			for(int i=1;i<=N;i++) {
				arr[dep+1]=i;
				if(check(arr,dep+1))
					go(arr,dep+1,N);
			}
		}
	}
	static boolean check(int[] arr, int dep) {
		for(int j=1;j<dep;j++) {
			if(arr[j]==arr[dep]) return false;
			if(Math.abs(j-dep)==Math.abs(arr[j]-arr[dep])) return false;
		}
		return true;
	}
}
