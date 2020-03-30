package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static int coef=1000000000;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		int[][] dp=new int[num][10];

		for(int i=0;i<10;i++) {
			dp[0][i]=1;
		}
		for(int i=1;i<num;i++) {
			for(int j=0;j<10;j++) {
				if(j==9) dp[i][j]=(dp[i-1][j-1])%coef;
				else if(j==0) dp[i][j]=(dp[i-1][j+1])%coef;
				else dp[i][j]=(dp[i-1][j+1]+dp[i-1][j-1])%coef;
			}
		}
		int sum=0;
		for(int i=1;i<10;i++) {
			sum=(sum+dp[num-1][i])%coef;
		}
		sb.append(sum);
		System.out.println(sb);
	
	}
}




