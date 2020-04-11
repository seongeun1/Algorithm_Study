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
		boolean[] p=new boolean[1000001];
		
		p[0]=true;
		p[1]=true;
		for(int i=2;i<=1000000;i++) {
			if(p[i]==false) {
				for(int j=i*2;j<=1000000;j+=i) {
					if(p[j]==false) p[j]=true; 
				}
				
			}
		}
		int N=Integer.parseInt(bf.readLine());
		while(N!=0) {
		
		
		int flag=0;
		for(int a=3;a<=N;a++) {
			if(p[a]==false && p[N-a]==false) {
				flag=1;
				String s= String.valueOf(N)+" = "+String.valueOf(a)+" + "+String.valueOf(N-a);
				System.out.println(s);
				break;
			}
		}
		if(flag==0) System.out.println("Goldbach's conjecture is wrong.");
		
		N=Integer.parseInt(bf.readLine());
		}
		
		
	}
}
