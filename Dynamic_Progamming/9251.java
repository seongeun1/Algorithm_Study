package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String st1=bf.readLine();
		String st2=bf.readLine();
		int[][]dp=new int[st2.length()+1][st1.length()+1];
		
		
		for(int j=0;j<st2.length();j++) {
			for(int i=0;i<st1.length();i++) {
				if(st1.charAt(i)==st2.charAt(j)) {
					dp[j+1][i+1]=dp[j][i]+1;
				}
				else dp[j+1][i+1]=Math.max(dp[j][i+1], dp[j+1][i]);
			}
		}
		
		int result=0;
		for(int i=0;i<st1.length()+1;i++) {
			result=Math.max(result, dp[st2.length()][i]);
		}
		System.out.println(result);
	}
}


