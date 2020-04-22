package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class Main {
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int n=3;
		while(n-->0) {
			int one=0;
			for(int i : bf.readLine().toCharArray()) {
				if(i=='1') one++;
			}
			if(one==4) sb.append("E\n");
			else if(one==0) sb.append("D\n");
			else if(one==1) sb.append("C\n");
			else if(one==2) sb.append("B\n");
			else if(one==3) sb.append("A\n");
			
			
			
		}
		System.out.println(sb);
	}
}


