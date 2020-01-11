import java.util.*;

public class boj2161_200111_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new LinkedList<Integer>();
		String ans ="";
		int N=sc.nextInt();
		for(int i=1;i<=N;i++) q.add(i);
		while(q.size()!=1) {
			ans += q.poll().toString()+" ";
			q.add(q.poll());
		}
		System.out.print(ans+q.poll());
	}
}
