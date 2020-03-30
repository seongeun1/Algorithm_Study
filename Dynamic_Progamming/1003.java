package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void fibo(int n) {
		int[][] fib=new int[41][2];
		fib[0][0]=1;fib[1][0]=0;
		fib[0][1]=0;fib[1][1]=1;
		for(int i=2;i<=n;i++) {
			fib[i][0]=fib[i-2][0]+fib[i-1][0];
			fib[i][1]=fib[i-2][1]+fib[i-1][1];
		
		}
		sb.append(fib[n][0]+" "+fib[n][1]+"\n");
	}
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
	 BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	 String s=bf.readLine();
	 StringTokenizer st=new StringTokenizer(s);
	 int N=Integer.parseInt(st.nextToken());
	 int[] num=new int[N];	
	 for(int i=0;i<N;i++) {
		 s=bf.readLine();
		 st=new StringTokenizer(s);
		 num[i]=Integer.parseInt(st.nextToken());
	 }
	 
	 for(int i=0;i<N;i++) {
		 fibo(num[i]);
	 }
	 System.out.println(sb);
	 
	 
	 

	}
}
