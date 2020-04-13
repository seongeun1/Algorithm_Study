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
		StringTokenizer st= new StringTokenizer(bf.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		int coef=1000000000;
		long[][] d=new long[K+1][N+1];
		for(int i=0;i<N+1;i++) {
			d[1][i]=1;
		}

		for(int i=2;i<K+1;i++) {
			for(int j=0;j<N+1;j++) {
				for(int L=0;L<=j;L++) {
					d[i][j]+=d[i-1][j-L];
					d[i][j]%=coef;
				}
			}

		}
		

		System.out.println(d[K][N]%coef);
		
		
		
		
	}
}

