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
		int N=n;
		for(int i=1;i<=n;i++) {
			int a=n-i;
			
			while(a-->0) {
				sb.append(" ");
			}
			sb.append("*");
			if(i>1) {
				
				a=(i-1)*2-1;
				while(a-->0) {
					sb.append(" ");
				}
				sb.append("*");
			}
			sb.append("\n");
		}



		System.out.println(sb);

	}
}
