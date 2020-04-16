package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		
		int a=9;
		int ans=0;
		int n=1;
		while(N-a>0) {
			ans+=a*n;			
			N-=a;

			System.out.println(n+" "+a+" "+N);

			n++;
			a*=10;
			
		}
		ans+=N*n;
		System.out.println(ans);
	
	}
}


