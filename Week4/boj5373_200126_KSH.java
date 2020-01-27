import java.util.*;

public class boj5373_200126_KSH {
	static char[] U,D,F,B,L,R; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int j=0;j<T;j++) {
			init();
			int  n = sc.nextInt();
			for(int i=0;i<n;i++) {
				String r = sc.next();
				char d = r.charAt(0);
				char c = r.charAt(1);
				if(d=='U') Urotate(c);
				else if(d=='D') Drotate(c);
				else if(d=='F') Frotate(c);
				else if(d=='B') Brotate(c);
				else if(d=='L') Lrotate(c);
				else if(d=='R') Rrotate(c);	
			}
			for(int i=0;i<9;i++) {
				if(i!=0&&i%3==0) System.out.println();
				System.out.print(U[i]);
			}
			System.out.println();
		}
	}
	public static char[] Cr(char[] a) {
		char[] tmp = new char[9];
		for(int i=0;i<9;i++) tmp[i]=a[i];
		a[0]=tmp[6];a[1]=tmp[3];a[2]=tmp[0];
		a[3]=tmp[7];a[4]=tmp[4];a[5]=tmp[1];
		a[6]=tmp[8];a[7]=tmp[5];a[8]=tmp[2];
		return a;
	}
	public static char[] Rr(char[] a) {
		char[] tmp = new char[9];
		for(int i=0;i<9;i++) tmp[i]=a[i];
		a[0]=tmp[2];a[1]=tmp[5];a[2]=tmp[8];
		a[3]=tmp[1];a[4]=tmp[4];a[5]=tmp[7];
		a[6]=tmp[0];a[7]=tmp[3];a[8]=tmp[6];
		return a;
	}
	public static void Urotate(char a){
		if(a=='+') {
			U=Cr(U);
			char[] tmp = new char[9];
			tmp[8]=B[8];tmp[7]=B[7];tmp[6]=B[6];
			B[8]=L[2];B[7]=L[5];B[6]=L[8];
			L[2]=F[0];L[5]=F[1];L[8]=F[2];
			F[0]=R[6];F[1]=R[3];F[2]=R[0];
			R[6]=tmp[8];R[3]=tmp[7];R[0]=tmp[6];
		}else if(a=='-') {
			U=Rr(U);
			char[] tmp = new char[9];
			tmp[6]=B[6];tmp[7]=B[7];tmp[8]=B[8];
			B[6]=R[0];B[7]=R[3];B[8]=R[6];
			R[0]=F[2];R[3]=F[1];R[6]=F[0];
			F[2]=L[8];F[1]=L[5];F[0]=L[2];
			L[8]=tmp[6];L[5]=tmp[7];L[2]=tmp[8];
		}else return;
	}
	public static void Drotate(char a){
		if(a=='+') {
			D=Cr(D);
			char[] tmp = new char[9];
			tmp[0]=B[0];tmp[1]=B[1];tmp[2]=B[2];
			B[0]=R[2];B[1]=R[5];B[2]=R[8];
			R[2]=F[8];R[5]=F[7];R[8]=F[6];
			F[8]=L[6];F[7]=L[3];F[6]=L[0];
			L[6]=tmp[0];L[3]=tmp[1];L[0]=tmp[2];
		}else if(a=='-') {
			D=Rr(D);
			char[] tmp = new char[9];
			tmp[2]=B[2];tmp[1]=B[1];tmp[0]=B[0];
			B[2]=L[0];B[1]=L[3];B[0]=L[6];
			L[0]=F[6];L[3]=F[7];L[6]=F[8];
			F[6]=R[8];F[7]=R[5];F[8]=R[2];
			R[8]=tmp[2];R[5]=tmp[1];R[2]=tmp[0];
		}else return;
	}
	public static void Frotate(char a){
		if(a=='+') {
			F=Cr(F);
			char[] tmp = new char[9];
			tmp[8]=U[8];tmp[7]=U[7];tmp[6]=U[6];
			U[8]=L[8];U[7]=L[7];U[6]=L[6];
			L[8]=D[8];L[7]=D[7];L[6]=D[6];
			D[8]=R[8];D[7]=R[7];D[6]=R[6];
			R[8]=tmp[8];R[7]=tmp[7];R[6]=tmp[6];
		}else if(a=='-') {
			F=Rr(F);
			char[] tmp = new char[9];
			tmp[6]=U[6];tmp[7]=U[7];tmp[8]=U[8];
			U[6]=R[6];U[7]=R[7];U[8]=R[8];
			R[6]=D[6];R[7]=D[7];R[8]=D[8];
			D[6]=L[6];D[7]=L[7];D[8]=L[8];
			L[6]=tmp[6];L[7]=tmp[7];L[8]=tmp[8];
		}else return;
	}
	public static void Brotate(char a){
		if(a=='+') {
			B=Cr(B);
			char[] tmp = new char[9];
			tmp[0]=U[0];tmp[1]=U[1];tmp[2]=U[2];
			U[0]=R[0];U[1]=R[1];U[2]=R[2];
			R[0]=D[0];R[1]=D[1];R[2]=D[2];
			D[0]=L[0];D[1]=L[1];D[2]=L[2];
			L[0]=tmp[0];L[1]=tmp[1];L[2]=tmp[2];
		}else if(a=='-') {
			B=Rr(B);
			char[] tmp = new char[9];
			tmp[2]=U[2];tmp[1]=U[1];tmp[0]=U[0];
			U[2]=L[2];U[1]=L[1];U[0]=L[0];
			L[2]=D[2];L[1]=D[1];L[0]=D[0];
			D[2]=R[2];D[1]=R[1];D[0]=R[0];
			R[2]=tmp[2];R[1]=tmp[1];R[0]=tmp[0];
		}else return;
	}
	public static void Lrotate(char a){
		if(a=='+') {
			L=Cr(L);
			char[] tmp = new char[9];
			tmp[6]=U[6];tmp[3]=U[3];tmp[0]=U[0];
			U[6]=B[6];U[3]=B[3];U[0]=B[0];
			B[6]=D[2];B[3]=D[5];B[0]=D[8];
			D[2]=F[6];D[5]=F[3];D[8]=F[0];
			F[6]=tmp[6];F[3]=tmp[3];F[0]=tmp[0];
		}else if(a=='-') {
			L=Rr(L);
			char[] tmp = new char[9];
			tmp[0]=U[0];tmp[3]=U[3];tmp[6]=U[6];
			U[0]=F[0];U[3]=F[3];U[6]=F[6];
			F[0]=D[8];F[3]=D[5];F[6]=D[2];
			D[8]=B[0];D[5]=B[3];D[2]=B[6];
			B[0]=tmp[0];B[3]=tmp[3];B[6]=tmp[6];
		}else return;
	}
	public static void Rrotate(char a){
		if(a=='+') {
			R=Cr(R);
			char[] tmp = new char[9];
			tmp[2]=U[2];tmp[5]=U[5];tmp[8]=U[8];
			U[2]=F[2];U[5]=F[5];U[8]=F[8];
			F[2]=D[6];F[5]=D[3];F[8]=D[0];
			D[6]=B[2];D[3]=B[5];D[0]=B[8];
			B[2]=tmp[2];B[5]=tmp[5];B[8]=tmp[8];
		}else if(a=='-') {
			R=Rr(R);
			char[] tmp = new char[9];
			tmp[8]=U[8];tmp[5]=U[5];tmp[2]=U[2];
			U[8]=B[8];U[5]=B[5];U[2]=B[2];
			B[8]=D[0];B[5]=D[3];B[2]=D[6];
			D[0]=F[8];D[3]=F[5];D[6]=F[2];
			F[8]=tmp[8];F[5]=tmp[5];F[2]=tmp[2];
		}else return;
	}
	static void init() {
		U  = new char[]{'w','w','w','w','w','w','w','w','w'};
		D  = new char[]{'y','y','y','y','y','y','y','y','y'};
		F  = new char[]{'r','r','r','r','r','r','r','r','r'};
		B  = new char[]{'o','o','o','o','o','o','o','o','o'};
		L  = new char[]{'g','g','g','g','g','g','g','g','g'};
		R  = new char[]{'b','b','b','b','b','b','b','b','b'};
	}
}
