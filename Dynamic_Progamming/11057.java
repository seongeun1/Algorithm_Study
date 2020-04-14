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
		int N=Integer.parseInt(bf.readLine());
		int coef=1007;
		int[][] d=new int[N+1][10];
		
		for(int i=0;i<=9;i++) {
			d[1][i]=1;
		}
		System.out.println(Arrays.toString(d[1]));
		
		int ans=0;
		for(int i=1;i<=N;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) {
					if(j<=k) d[i][j]+=d[i-1][k];
				}
				if(i==N) ans+=d[i][j];
			}
			System.out.println(Arrays.toString(d[i]));
		}
			System.out.println(ans);	
	}
}

