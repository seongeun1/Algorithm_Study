package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(bf.readLine());
	
		int[] d=new int[2*n+1];
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			d[i]=Integer.parseInt(st.nextToken());
			d[i+1]=Integer.parseInt(st.nextToken());
		}
		
		int[][] dp=new int[n+1][n+1];
		
		for(int len=2;len<=n;len++) {
			for(int i=1;i<=n-len+1;i++) {
				int j=i+len-1;
				dp[i][j]=Integer.MAX_VALUE;
				
				for(int k=i;k<j;k++) {
					dp[i][j]=Math.min(dp[i][j], dp[i][k]+dp[k+1][j]+d[i-1]*d[k]*d[j]);
				}
			}
		}
		
	System.out.println(dp[1][n]);


	}
}

