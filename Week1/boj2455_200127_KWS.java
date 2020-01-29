import java.util.*;
import java.io.*;

public class BJ2455 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> inList = new ArrayList<Integer>();
		ArrayList<Integer> outList = new ArrayList<Integer>();
		
		for (int i = 0; i<4; i++)
		{
			StringTokenizer st = new StringTokenizer(input.readLine());
			int out = Integer.parseInt(st.nextToken());
			int in = Integer.parseInt(st.nextToken());
			
			inList.add(in);
			outList.add(out);
		}
		
		int person = 0;
		int max = 0;
		
		for (int i = 0; i<4; i++)
		{
			person -= outList.get(i);
			person += inList.get(i);
			
			if (max<=person)
			{
				max=person;
			}
		}
		
		System.out.println(max);
	}
}
