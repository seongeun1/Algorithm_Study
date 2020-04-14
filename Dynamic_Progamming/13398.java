package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		
		int[] s=new int[N];
		StringTokenizer st=new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			s[i]=Integer.parseInt(st.nextToken());
		}
		
		
		
		int ans=Integer.MIN_VALUE;
		int[] d=new int[N];
		int[] d2=new int[N];
		
		for(int i=0;i<N;i++) {
			if(i==0) d[i]=s[i];
			else {
				d[i]=Math.max(s[i], d[i-1]+s[i]);
			}
		}
		for(int i=N-1;i>=0;i--) {
			if(i==N-1) d2[i]=s[i];
			else {
				d2[i]=Math.max(s[i], d2[i+1]+s[i]);
			}
		}
		for(int i=0;i<N;i++) {
			ans=Math.max(ans, d[i]);
		}
		
		for(int i=1;i<N-1;i++) {
			ans=Math.max(ans, d[i-1]+d2[i+1]);
		}
		
		
		System.out.println(ans);
	}
}


