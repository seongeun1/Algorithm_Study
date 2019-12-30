package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		int[] stick1=new int[501];
		int[] dp=new int[501];
		for(int i=0;i<num;i++) {
			String s=bf.readLine();
			StringTokenizer st=new StringTokenizer(s, " ");
			int index=Integer.parseInt(st.nextToken());
			stick1[index]=Integer.parseInt(st.nextToken());
			dp[index]=1;
		}
		int result=1;
		for(int i=0;i<500;i++) {
			for(int j=i+1;j<501;j++) {
				if(stick1[i]<stick1[j] && dp[i]==dp[j])
					{dp[j]=dp[i]+1;
					result=Math.max(result, dp[j]);
					}
			}
		}
	

		System.out.println(num-result);
	}
}



