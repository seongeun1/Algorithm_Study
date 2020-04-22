package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



	
public class Main {
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int n=(int)123456*2;
		int[] check=new int[123456*2+1];
		int[] prime=new int[123456*2+1];
		int index=0;
		for(int i=2;i<=n;i++) {
			if(check[i]==0) {
				prime[index++]=i;
				for(int idx=i;idx<=n/i;idx++) {
					check[idx*i]=1;
				}
			}
		}
		
		

		int N=Integer.parseInt(bf.readLine());
		while(N!=0) {
			int ans=0;
			for(int i=0;i<prime.length;i++) {
				if(prime[i]>N && prime[i]<=2*N) ans++;
				if(prime[i]>2*N) break;
			}
		
			sb.append(ans+"\n");
			N=Integer.parseInt(bf.readLine());
		}
		
		
	System.out.println(sb);	
	}
}


