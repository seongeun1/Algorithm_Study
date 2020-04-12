package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;





public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		int M=Integer.parseInt(bf.readLine());
		long[][] d=new long[M+1][2];
		d[1][0]=0;
		d[1][1]=1;
		
		for(int i=2;i<=M;i++) {
			d[i][0]=d[i-1][0]+d[i-1][1];
			d[i][1]=d[i-1][0];
		}
		System.out.println(d[M][0]+d[M][1]);
		
	}
}

