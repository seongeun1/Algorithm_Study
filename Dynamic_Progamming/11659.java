package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static int N;
	public static int M;
	public static int[] mtx;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		mtx=new int[N+1];
		int[] mtx1=new int[N+1];
		st=new StringTokenizer(bf.readLine());	
		for(int i=1;i<N+1;i++) {
			mtx[i]=Integer.parseInt(st.nextToken());
			mtx1[i]=mtx1[i-1]+mtx[i];
		}
		
		int sum=0;
		while(M-->0) {
			st=new StringTokenizer(bf.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			sum=mtx1[b]-mtx1[a-1];
			sb.append(sum+"\n");
			
		}
		
		
		
		System.out.println(sb);
		
		
		}
}
