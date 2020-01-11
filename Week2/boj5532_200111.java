import java.util.*;

public class boj5532_200111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),D=sc.nextInt(),kd=0,md=0;
		if(A%C!=0)kd=A/C+1;
		else kd=A/C;
		if(B%D!=0)md=B/D+1;
		else md=B/D;
		System.out.println(kd>=md?L-kd:L-md);
	}
}
