package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int gcd(int a, int b) {
		if(b==0) return a;
		else return gcd(b, a%b);
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine(), " ");
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(bf.readLine(), " ");		
		int c=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		

		a=a*d;
		c=c*b;
		b=b*d;
		d=b;
		
		
		
		
		int ansc=a+c;
		int ansp=b;
		int g=gcd(ansc, ansp);
		System.out.println(ansc/g+" "+ansp/g);
		
		
		
		
	}
}