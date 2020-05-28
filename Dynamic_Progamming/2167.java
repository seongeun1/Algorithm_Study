package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int N;
	static int M;
	static int[][] mtx;
 	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		mtx=new int[N+1][M+1];
		
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=1;j<=M;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
				
			}
		
		}
		
		
		
		int K=Integer.parseInt(bf.readLine());
		
		while(K-- >0) {
			st=new StringTokenizer(bf.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			int sum=0;
			for(int i=x1;i<=x2;i++) {
				for(int j=y1;j<=y2;j++) {
					sum+=mtx[i][j];
				}
			}
			sb.append(sum+"\n");
		}
		
		
		System.out.println(sb);

	}
}
