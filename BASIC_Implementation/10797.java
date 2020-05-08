package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {

	

	static int ans=0;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		int n=Integer.parseInt(bf.readLine());
		StringTokenizer st=new StringTokenizer(bf.readLine());

		for(int i=0;i<5;i++) {
			int a=Integer.parseInt(st.nextToken());
			if(a==n) ans++;
		}
	
		
		System.out.println(ans);
		
	}
}