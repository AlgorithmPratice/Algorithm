import java.util.*;
public class boj3986_200111_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int cnt=0;
		while(N-->0) {
			Stack<Character> st = new Stack<>();
			char[] tmp=sc.next().toCharArray();
			for(int j=0;j<tmp.length;j++) {
				if(!st.isEmpty()) {
					if(tmp[j]==(char) st.peek()) st.pop();
					else st.push(tmp[j]);
				}else st.push(tmp[j]);
			}
			if(st.isEmpty()) cnt++;
		}System.out.println(cnt);
	}
}
