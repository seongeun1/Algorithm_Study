package pr;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		int time=Integer.parseInt(bf.readLine());
		for(int t=0;t<time;t++) {
			int n=Integer.parseInt(bf.readLine());


			int[] d=new int[n+1];
			StringTokenizer st=new StringTokenizer(bf.readLine());
			for(int i=1;i<n+1;i++) {
				d[i]=d[i-1]+Integer.parseInt(st.nextToken());
			}

			int[][] dp=new int[n+1][n+1];

			for(int len=2;len<=n;len++) { // 절반 나눈 오른 위쪽으로만 나올 수 있게 만들어주는 삼각형
				for(int i=1;i<=n-len+1;i++) {
					int j=i+len-1;
					dp[i][j]=Integer.MAX_VALUE;

					for(int k=i;k<j;k++) {
						dp[i][j]=Math.min(dp[i][j], dp[i][k]+dp[k+1][j]+d[j]-d[i-1]);
					}
				}
			}



			System.out.println(dp[1][n]);
		}

	}
}

