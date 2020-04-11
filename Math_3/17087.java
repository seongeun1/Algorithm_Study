package pr;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;




public class Main {
	public static int gcd(int a, int b) {
		if(b==0) return a;
		else {
			return gcd(b, a%b);
		}
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		
		int num=Integer.parseInt(st.nextToken());
		int point=Integer.parseInt(st.nextToken());
		

		st=new StringTokenizer(bf.readLine());
		
		int[] p=new int[num];
		int[] pm=new int[num];
		
		for(int i=0;i<num;i++) {
			p[i]=Integer.parseInt(st.nextToken());
			pm[i]=Math.abs(p[i]-point);
		}
		int g=pm[0];
		for(int i=1;i<num;i++) {
			g=gcd(g, pm[i]);
		}
		
		System.out.println(g);
		

	}
}
