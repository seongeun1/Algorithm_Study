package pr;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static long find(int n, int k,long [][] dp) {
		if(n==k || k==0) return 1;
		else {
			if(dp[n][k]!=-1) return dp[n][k];
			else
				dp[n][k]=(find(n-1,k-1,dp)%10007+find(n-1,k,dp)%10007)%10007;
			}
		return dp[n][k];
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());

		long[][] dp=new long[n+1][n+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<n+1;j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(find(n, k, dp));
		
	}

}





