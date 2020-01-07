import java.util.*;
public class boj10799_200107_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<Character>();
		char[] s = sc.nextLine().toCharArray();
		int ans=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]=='(') st.push(s[i]);
			else {
				if(s[i-1]==')') {
					st.pop();
					ans++;
				}
				else {
					st.pop();
					ans+=st.size();
				}
			}
		}
		System.out.println(ans);
	}
}
