package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	static int N;
	static ArrayList<Integer> mtx=new ArrayList<>();
	public static int n;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		int n=Integer.parseInt(bf.readLine());
		
		
		
		for(int i=n;i>=1;i--) {
			String s="";
			int j=0;
			int c=0;
			for(j=0;j<n-i+1;j++) {
				s+="*";
				c++;
			}
			for(j=0;j<2*i-2;j++) {
				s+=" ";
				c++;
			}
			while(c<2*n) {
				s+="*";
				c++;
			}
			
			sb.append(s+"\n");
		}
		
		for(int i=2;i<=n;i++) {
			String s="";
			int j=0;
			int c=0;
			for(j=0;j<n-i+1;j++) {
				s+="*";
				c++;
			}
			for(j=0;j<2*i-2;j++) {
				s+=" ";
				c++;
			}
			while(c<2*n) {
				s+="*";
				c++;
			}
			
			sb.append(s+"\n");
		}
		
		
		
		System.out.println(sb);
	
	}
}
