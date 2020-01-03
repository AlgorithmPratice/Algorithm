import java.util.*;
public class boj1158_200103_KSH {
	public static void main(String args[]) {
		Queue<Integer> q = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(),i,cnt=0;
		String ans="<";
		for(i=0;i<N;) q.add(++i);
		while(!q.isEmpty()) {
			++cnt;
			if(cnt==M) {
				ans+=q.poll()+", ";
				cnt=0;
			}
			else q.add(q.poll());
		}
		System.out.print(ans.substring(0,ans.length()-2)+">");
	}
}
