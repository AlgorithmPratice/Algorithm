import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.lang.StringBuffer;

public class BJ1158 {
	public static void main(String[] args) throws IOException
	{
		StringBuffer sb = new StringBuffer();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = in.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> josephus = new ArrayList<Integer>();
		
		for(int i = 1; i<=N; i++)
		{
			josephus.add(i);
		}
		
		int num = K-1;
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		while(true)
		{
			int temp = josephus.get(num);
			output.add(temp);
			josephus.remove(num);
			if(num>=josephus.size()) num = 0;
			if(josephus.size()==0) break;
			for(int i = 1; i<K; i++)
			{
				num += 1;
				if(num>=josephus.size()) num = 0;
			} 
		}
		
		out.write("<");
		
		for (int i = 0; i<N; i++)
		{
			out.write(output.get(i).toString());
			if(i!=N-1)
			{
				out.write(", ");
			}
		}
		
		out.write(">");
		out.flush();
		out.close();
	}
}
