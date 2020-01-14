import java.io.*;
public class boj18258_200114_KSH {
	static class Node{
		int value;
		Node next;
		Node(int value) { this.value = value; }
	}
	static Node start,end;
	static int size = 0;
	static void push(int a){
		if (start == null) {
			start = new Node(a);
			end = start;
		} 
		else {
			Node newest = new Node(a);
			end.next = newest;
			end = newest;	
		}
		size++;
	}
	static int pop() {
		if (start == null) return -1;
		else {
			int answer = start.value;
			start = start.next;
			size --;
			return answer;
		}
	}
	static int size() {
		return size;
	}
	static int empty() {
		if (size == 0) return 1;
		else return 0;
	}
	static int front() {
		if (size == 0) return -1;
		else return start.value;
	}
	static int back() {
		if (size == 0) return -1;
		else return end.value;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(buf.readLine());
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<num; i++) {
			String order = buf.readLine();
			if (order.contains("push")) {
				int a = Integer.parseInt(order.substring(5, order.length()));
				push(a);
			}
			else if (order.contains("front"))sb.append(front()).append("\n");
			else if (order.contains("back"))sb.append(back()).append("\n");
			else if (order.contains("size"))sb.append(size()).append("\n");
			else if (order.contains("empty"))sb.append(empty()).append("\n");
			else if (order.contains("pop"))sb.append(pop()).append("\n");
		}
		System.out.println(sb);
	}
}
