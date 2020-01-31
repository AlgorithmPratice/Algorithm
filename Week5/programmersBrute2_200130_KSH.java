public class programmersBrute2_200130_KSH {
	static int answer = 0;
	static int[] numb = new int[10000000];
	public static void main(String[] args) {
		String num = "011";
		int ans = solution(num);
		System.out.println(ans);
	}
    public static int solution(String numbers) {
    	answer=0;
        char[] arr = numbers.toCharArray();
        for(int i=2;i<10000000;i++) {
        	numb[0]=1;numb[1]=1;
        	if (numb[i]==1) continue;
        	for(int j=2;i*j<10000000;j++) numb[i*j]=1;
        }
        for(int i=1;i<=arr.length;i++) perm(arr, 0, i);
        return answer;
    }
	public static void perm(char[] arr, int depth, int n) {
		if (depth == n) {
			char[] tmp = new char[n];
			for(int i=0;i<n;i++)tmp[i]=arr[i];
			int a = Integer.parseInt(String.valueOf(tmp));;
			if(numb[a]==0) {
				numb[a]=1;
				answer++;
			}
			return;
		}
		else
			for (int i = depth; i < arr.length; i++) {
				swap(arr, i, depth);
				perm(arr, depth + 1, n);
				swap(arr, i, depth);
			}	
	}
	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

