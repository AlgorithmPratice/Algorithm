import java.util.*;
public class boj1547_200111_KSH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M=sc.nextInt();
		int [] cup = {0, 1, 0, 0};
		for(int i=0;i<M;i++) {
			int X=sc.nextInt();
			int Y=sc.nextInt();
				int temp = cup[X];
				cup[X]=cup[Y];
				cup[Y]=temp;
		}
		for(int i=1;i<4;i++) {
			if(cup[i]==1) System.out.println(i);
		}
	}
}
