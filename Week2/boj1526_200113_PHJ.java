import java.util.Scanner;

public class boj1526_200113_PHJ {
	
	class ArrayQueue{
		private int front;
		private int rear;
		private int maxSize;
		private Object[] queueArray;
		
		public ArrayQueue(int maxSize) {
			this.front = 0;
			this.rear = -1;
			this.maxSize = maxSize;
			this.queueArray = new Object[maxSize];
		}
		
		public boolean empty() {
			return (front == rear+1);
		}
		
		public boolean full() {
			return (rear == maxSize-1);
		}
		
		public void insert(Object item) {
			if(full()) throw new ArrayIndexOutOfBoundsException();
			queueArray[++rear] = item;
		}
		
		public Object peek() {
			if(empty()) throw new ArrayIndexOutOfBoundsException();
			return queueArray[front];
		}
		
		public Object remove() {
			Object item = peek();
			front++;
			return item;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		boj1526_200113_PHJ a = new boj1526_200113_PHJ();
		boj1526_200113_PHJ.ArrayQueue queue = a.new ArrayQueue(1000);
		int val = 0;
		
		if(N >= 4) {
			val = 4;
			queue.insert(4);
		}
		if(N >= 7) {
			val = 7;
			queue.insert(7);
		}
		while(!queue.empty()) {
			int num = (int) queue.remove();
			num *= 10;
			
			if(num + 4 <= N) {
				val = num + 4;
				queue.insert(num + 4);
			}
			
			if(num + 7 <= N) {
				val = num + 7;
				queue.insert(num + 7);
			}
		}
		System.out.println(val);
	}

}
