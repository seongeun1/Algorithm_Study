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
		mtx=new int[N];
		int[] sum=new int[N];
		st=new StringTokenizer(bf.readLine());
		
		int max=0;
		for(int i=0;i<N;i++) {
			mtx[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<M;i++) {
			max+=mtx[i];
		}
		int ans=max;

		for(int i=M;i<N;i++) {
			ans-=mtx[i-M];
			ans+=mtx[i];
			max=Math.max(max, ans);
		}
		
		
		System.out.println(max);
		
		
		}
}
