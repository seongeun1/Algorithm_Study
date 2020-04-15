package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		int sum=0;
		int[] h=new int[9];
		for(int i=0;i<9;i++) {
			h[i]=Integer.parseInt(bf.readLine());
			sum+=h[i];
		}
		Arrays.sort(h);
		int s=sum;
		int a=100, b=100;
		int flag=1;
		for(int i=0;i<9;i++) {
			s=sum-h[i];
			for(int j=0;j<9;j++) {
				if(i==j) continue;
				if(s-h[j]==100) {
					a=i;
					b=j;
					flag=0;
					System.out.println("여기찍히나요");
					break;
					
				}
				
			}
			if(flag==0) break;
			
		}
		
		for(int i=0;i<9;i++) {
			if(i==a || i==b) continue;
				sb.append(h[i]+"\n");
		}
		System.out.println(sb);
		
		
		
		
		
	}
}


