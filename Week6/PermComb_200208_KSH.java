package datastructure;

import java.util.Arrays;
public class PermComb {	
	public static void main(String[] args) {
		char[] arr = {'1','2','3'};
		boolean[] visited = new boolean[arr.length];
		System.out.println("Permutation");
		Perm(arr,0);
		System.out.println("Combination");
		Comb(arr,visited,0,2);
	}
	public static void Comb(char[] arr,boolean[] visited, int depth, int r) {
		if(r==0) {
			for(int i=0;i<arr.length;i++) {
				if(visited[i]==true) System.out.print(arr[i]+" ");
			}
			System.out.println("");
			return;
		}else if
			(depth==arr.length) return;
		else {
			visited[depth]=true;
			Comb(arr,visited,depth+1,r-1);
			visited[depth]=false;
			Comb(arr,visited,depth+1,r);
		}
	}
	public static void Perm(char[] arr,int depth) {
		if(depth==arr.length){
			System.out.println(Arrays.toString(arr));
		}else {
			for (int i = depth; i < arr.length; i++) {
				swap(arr, depth, i);
				Perm(arr, depth+ 1);
				swap(arr, depth, i);
			}	
		}
	}
    public static void swap(char[] arr, int x, int y)
    {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
