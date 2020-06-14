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
		
		
		for(int i=1;i<=n;i++) {
			for(int a=n-i;a>=1;a--) {
				sb.append(" ");
				
			}
			for(int a=1;a<=i;a++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		for(int i=n-1;i>=1;i--) {
			for(int a=n-i;a>=1;a--) {
				sb.append(" ");
				
			}
			for(int a=1;a<=i;a++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		
		System.out.println(sb);
	
	}
}
