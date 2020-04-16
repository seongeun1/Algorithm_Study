package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int check(int c) {
		
		if(c==0) {
			if(b[c]==true) return 0;
			else return 1;
		}
		
		int len=0;
		while(c>0) {
			if(b[c%10]==true) return 0;
			len++;
			c/=10;
		}
		
		return len;
	}
	public static boolean b[];
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		int k=Integer.parseInt(bf.readLine());
		b=new boolean[10];
		StringTokenizer st=new StringTokenizer(bf.readLine());
		for(int i=0;i<k;i++) {
			b[Integer.parseInt(st.nextToken())]=true;
		}
		
		int ans=Math.abs(N-100);
		for(int i=0;i<1000001;i++) {
			int c=i;
			int chk=check(c);
			if(chk>0) {
				int p=Math.abs(c-N);
				ans=Math.min(ans, p+chk);
			}
		}
		
		System.out.println(ans);
		
		
	}
}


