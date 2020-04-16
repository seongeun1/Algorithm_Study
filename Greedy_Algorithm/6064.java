package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb=new StringBuffer();
		int num=Integer.parseInt(bf.readLine());
		
		
		while((num--)>0) {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			int M=Integer.parseInt(st.nextToken());
			int N=Integer.parseInt(st.nextToken());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			
		
			int a=x;int b=x;
			int ans=x;
			while(b>N) {
				b=b-N;
			}
			System.out.println(a+" "+b);
			int flag=0;
			while(b!=y) {
				ans+=M;
				b+=M;
				while(b>N) {
					b=b-N;
				}
				flag++;
				if(flag>N) {
					ans=-1;
					break;
				}
			}
			sb.append(ans+"\n");
			
		}
		System.out.println(sb);
	
	}
}


