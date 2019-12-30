package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(bf.readLine());
	StringBuffer sb=new StringBuffer();
	int a=Integer.parseInt(st.nextToken());
	int b=Integer.parseInt(st.nextToken());
	
	int mul=1;
	for(int i=2;i<=Math.min(a, b);i++) {
		if(a%i==0 && b%i==0) {
			mul*=i;
			a/=i;
			b/=i;
			i--;
		}
	}
	sb.append(mul+"\n");
	sb.append(mul*a*b);
	System.out.println(sb);
	
	
	}
	
}




