import java.util.*;
public class programmersBrute1_200129_KSH {
	public static void main(String[] args) {
		int[] ans = {1,3,2,4,2};
		int[] answer = solution(ans);
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]);
		}
	}
    public static int[] solution(int[] answers) {
        int[] ans1= {1,2,3,4,5};
        int[] ans2= {2,1,2,3,2,4,2,5};
        int[] ans3= {3,3,1,1,2,2,4,4,5,5};
        int[] sp = new int[4];
        for(int i=0;i<answers.length;i++) {
        	if(answers[i]==ans1[i%5]) sp[1]++;
        	if(answers[i]==ans2[i%8]) sp[2]++;
        	if(answers[i]==ans3[i%10]) sp[3]++;
        }
        int max = Math.max(sp[1], Math.max(sp[2], sp[3]));
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<4;i++)if(sp[i]==max)q.add(i);
        int[] answer = new int[q.size()];
        for(int i=0;i<answer.length;i++) answer[i] = q.poll();
        return answer;
    }
}
