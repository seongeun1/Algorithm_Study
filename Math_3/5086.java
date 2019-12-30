package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(bf.readLine());

	
	int x=Integer.parseInt(st.nextToken());
	int y=Integer.parseInt(st.nextToken());
	
	while(x!=0 && y!=0) {
		if(y%x==0) System.out.println("factor");
		else if(x%y==0) System.out.println("multiple");
		else System.out.println("neither");
		st=new StringTokenizer(bf.readLine());
		x=Integer.parseInt(st.nextToken());
		y=Integer.parseInt(st.nextToken());
		
	}
	
	
	}
}




