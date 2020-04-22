package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class Main {
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		int[] check=new int[N+1];
		int ans=0;
		int index=0;
		boolean flag=false;
		for(int i=2;i<=N;i++) {
			if(check[i]==0) {
				check[i]=1;
				index++;
			
				if(index==K) {
					ans=i;
					flag=true;
					break;
				}
				
				for(int idx=i;idx<=N/i;idx++) {
					if(check[idx*i]==0) {
						check[idx*i]=1;
						index++;
						
						if(index==K) {
							ans=idx*i;
							flag=true;
							break;
						}
					}
				}
			}
		
			if(flag) break;
		}
	
		System.out.println(ans);
	}

	



}


