import java.util.*;
public class boj1100_200125_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] p = new char[8][8];
		for(int i=0;i<8;i++) p[i]= sc.nextLine().toCharArray();
		int ans=0;
		for(int i=0;i<8;i++) 
			for(int j=0;j<8;j++)
				if(i%2==0) {
					if(j%2==0) if(p[i][j]=='F') ans++;
				}else {
					if(j%2==1) if(p[i][j]=='F') ans++;
				}
		System.out.println(ans);
	}
}
