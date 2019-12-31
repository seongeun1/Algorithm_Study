package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
	public static int gcd(int a, int b) {
		int mul=1;
		for(int i=2;i<=Math.min(a,  b);i++) {
			if(a%i==0 && b%i==0) {
				mul*=i;
				a/=i;
				b/=i;
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

	for(int i=0;i<num;i++) {
		list[i]=Integer.parseInt(bf.readLine());
	}
	
	Arrays.sort(list);
	
	int g=list[1]-list[0];
	for(int i=0;i<num-1;i++) {
		g=gcd(g, list[i+1]-list[i]);
	}

	
	for(int i=2;i<=g;i++) {
		if(g%i==0) sb.append(i+" ");
	}
	System.out.println(sb);
	}
	
}




