package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
	
	public static StringBuffer sb=new StringBuffer();
	public static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		
		int ans3=N/3;
		int ans5=N/5;
		boolean flag=false;
		for(int i=0;i<=ans5;i++) {
			for(int j=0;j<=ans3;j++) {
				if(i*5+j*3==N) {
					flag=true;
					min=Math.min(min,  i+j);
				}
			}
		}
		
		if(!flag) min=-1;
		
		System.out.println(min);
		
	}

}


