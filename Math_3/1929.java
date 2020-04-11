package pr;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;




public class Main {
	public static boolean find(int a) {

		if(a<2) return false;
		for(int i=2;i*i<=a;i++) {
			if(a%i==0) return false;
		}
		return true;
		
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		
		boolean[] p=new boolean[M+1];
		p[0]=true;
		p[1]=true;
		for(int i=2;i<=M;i++) {
			if(p[i]==false) {
				for(int j=i*2;j<=M;j+=i) {
					if(p[j]==false) p[j]=true; 
				}
				
			}
		}
		
		for(int i=N;i<=M;i++) {
			if(p[i]==false) System.out.println(i);
		}
		
		
		
	}
}
