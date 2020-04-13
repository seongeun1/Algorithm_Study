package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;





public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		int M=Integer.parseInt(bf.readLine());
		int[] d=new int[M+3];
		d[1]=1;
		d[2]=2;
		d[3]=3;
		
		for(int i=1;i*i<=M;i++) {
			d[i*i]=1;
		}
		
		for(int i=4;i<=M;i++) {
			if(d[i]==1) continue;
			int a=d[1]+d[i-1];
			for(int j=i-1;j>=i/2;j--) {
				a=Math.min(a, d[i-j]+d[j]);
			}
			d[i]=a;
		}
		
	
		System.out.println(d[M]);
		
		
		
		
		
	}
}

