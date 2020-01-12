package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class boj3986_200113_PHJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			Stack<Character> stack = new Stack<Character>();
			char[] chars = sc.nextLine().toCharArray();
			
			for(int j = 0; j < chars.length; j++) {
				if(!stack.isEmpty()) {
					if(stack.peek() == chars[j]) {
						stack.pop();
					}else {
						stack.push(chars[j]);
					}
				}else {
					stack.push(chars[j]);
				}
			}
			if(stack.isEmpty()) result += 1;
		}
		System.out.println(result);
	}
}
