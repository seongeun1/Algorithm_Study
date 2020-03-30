package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int total_weight=Integer.parseInt(st.nextToken());
		
		int[] weight=new int[n+1];
		int[] value=new int[n+1];
		int[][] dp=new int[total_weight+1][n+1];
		
		for(int i=1;i<n+1;i++) {
			st=new StringTokenizer(bf.readLine()," ");
			weight[i]=Integer.parseInt(st.nextToken());
			value[i]=Integer.parseInt(st.nextToken());
			
		}
		
		//when weight is i and i put until j
		int max=0;
		for(int i=1;i<total_weight+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(i>=weight[j]) dp[i][j]=Math.max(dp[i][j-1], dp[i-weight[j]][j-1]+value[j]);
				else dp[i][j]=dp[i][j-1];
				max=Math.max(dp[i][j], max);
			}

		}
		
		
		System.out.println(max);

	}
}
