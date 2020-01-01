package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	StringBuffer sb=new StringBuffer();
	
	StringTokenizer st=new StringTokenizer(bf.readLine());
	int n=Integer.parseInt(st.nextToken());
	int k=Integer.parseInt(st.nextToken());
	
	int mom=1,child=1;
	
	for(int i=0;i<k;i++) {
		mom*=(n-i);
		child*=(k-i);

	}
	
	System.out.println(mom/child);

	}
	
}




