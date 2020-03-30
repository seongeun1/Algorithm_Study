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
		int[] ds=new int[num];
		String s=bf.readLine();
		StringTokenizer st=new StringTokenizer(s);
		for(int i=0;i<num;i++) {
			set[i]=Integer.parseInt(st.nextToken());
			dp[i]=1;
			ds[i]=1;
		}
		int result=0;
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
				if(set[j]>set[i] && dp[i]==dp[j]) {
					dp[j]=dp[i]+1;		
				}
			}
		}
		
		
		for(int i=num-1;i>=0;i--) {
			for(int j=num-1;j>i;j--) {
				if(set[j]<set[i] && ds[i]==ds[j]) {
					ds[i]=ds[j]+1;
				}
			}
		//	System.out.println(Arrays.toString(ds));
		}
		
		//System.out.println(Arrays.toString(ds)+"  "+Arrays.toString(dp));
		for(int i=0;i<num;i++) {
			result=Math.max(result, ds[i]+dp[i]);	
		}
		System.out.println(result-1);
	}
}



