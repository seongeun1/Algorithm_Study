package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int N;
	static int K;
	static int[] mtx;
	static int[] dp;
  	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		dp=new int[K+1];
		
		for(int i=0;i<=K;i++) {
			dp[i]=1000001;
		}
		dp[0]=0;
		
		mtx=new int[N];
		
		for(int i=0;i<N;i++) {
			mtx[i]=Integer.parseInt(bf.readLine());
		}
		
		for(int j=0;j<=K;j++) {
			for(int i=0;i<N;i++) {
				if(mtx[i]<=j && dp[j-mtx[i]]+1<dp[j]) {
					dp[j]=dp[j-mtx[i]]+1;
				}
			}

		}

		if(dp[K]==1000001) 	System.out.println(-1);
		else System.out.println(dp[K]);
	}
}
