package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		int[] num=new int[n];
		int[] s=new int[n];
 		
		String str=bf.readLine();
		StringTokenizer st=new StringTokenizer(str," ");
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		
		s[0]=num[0]; int result=s[0];
		for(int i=1;i<n;i++) {
			int a=s[i-1]+num[i];
			if(a<num[i])s[i]=num[i];
			else s[i]=a;
			result=Math.max(result,  s[i]);
		}
	
		
		System.out.println(result);
		
	}
}



