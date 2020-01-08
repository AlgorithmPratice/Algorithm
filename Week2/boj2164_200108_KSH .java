import java.util.*;

public class boj2164_200108_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new LinkedList<Integer>();
		int N=sc.nextInt();
		for(int i=1;i<=N;i++) q.add(i);
		while(q.size()!=1) {
			q.poll();
			q.add(q.poll());
		}
		System.out.println(q.poll());
	}
}
