package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		int[] set=new int[num];
		int[] dp=new int[num];
		String s=bf.readLine();
		StringTokenizer st=new StringTokenizer(s);
		for(int i=0;i<num;i++) {
			set[i]=Integer.parseInt(st.nextToken());
		}
		int result=1;
		for(int i=0;i<num;i++) {
			dp[i]=1;
		}
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
				if(set[j]>set[i] && dp[i]==dp[j]) {
					dp[j]=dp[i]+1;		
				}
			}
			
		}
		for(int i=0;i<num;i++) {
			result=Math.max(result,dp[i]);
		}
	
	System.out.println(result);
	}
}





