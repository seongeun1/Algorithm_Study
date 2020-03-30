package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int max=Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String s=bf.readLine();
		StringTokenizer st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		
		int[][] tri=new int[N][N];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<=i;j++) {
				tri[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] route=new int[N][N];
		for(int i=0;i<N;i++) {
			route[0][i]=tri[0][i];
		}
		
		for(int i=1;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(j==0) route[i][j]=tri[i][0]+route[i-1][0];
				else route[i][j]=tri[i][j]+Math.max(route[i-1][j], route[i-1][j-1]);
			}
		}
		
		for(int i=0;i<N;i++) {
			max=Math.max(max, route[N-1][i]);
		}
		System.out.println(max);
	
		}
}
