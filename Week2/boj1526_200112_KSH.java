import java.util.*;
public class boj1526_200112_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),ans;
		boolean check=false;
		for(int i=N;i>0;i--) {
			int tmp=i;
			while(tmp!=0) {
				int d = tmp%10;
				tmp/=10;
				if(d==4|d==7)check=true;
				else {
					check=false;
					break;
				}
			}
			if(check) {
				System.out.println(i);
				break;
			}
		}
	}
}
