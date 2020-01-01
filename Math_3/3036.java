package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static int gcd(int a, int b) {
		int mul=1;
		for(int i=2;i<=Math.min(a, b);i++) {
			if(a%i==0 && b%i==0) {
				a/=i;
				b/=i;
				mul*=i;
				i--;
			}
		}
		return mul;
		
	}
	public static void main(String[] args) throws Exception {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	StringBuffer sb=new StringBuffer();
	int num=Integer.parseInt(bf.readLine());
	
	int[] list=new int[num];
	
	StringTokenizer st=new StringTokenizer(bf.readLine());

	for(int i=0;i<num;i++) {
		list[i]=Integer.parseInt(st.nextToken());
	}
	
	for(int i=1;i<num;i++) {
		int g=gcd(list[0], list[i]);
	//	System.out.println(g);
		sb.append((list[0]/g)+"/"+(list[i]/g)+"\n");
		
	}
	System.out.println(sb);
	}
	
}




