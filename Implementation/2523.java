package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.String;
public class Main {
	static int N;
	static ArrayList<Integer> mtx=new ArrayList<>();
	public static int n;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		int n=Integer.parseInt(bf.readLine());
		
		for(int i=1;i<=n;i++) {
			String s="";
			for(int j=0;j<i;j++) {
				s+='*';
			}
		
			sb.append(s+"\n");
		}
		for(int i=n-1;i>=1;i--) {
			String s="";
			for(int j=0;j<i;j++) {
				s+='*';
			}
			sb.append(s+"\n");
		}
		
		System.out.println(sb);
	
	}
}
