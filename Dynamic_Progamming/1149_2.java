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
		
		int[][] pr=new int[3][N];
		int[][] d=new int[3][N];

		for(int i=0;i<N;i++) {
			StringTokenizer st= new StringTokenizer(bf.readLine());
			pr[0][i]=Integer.parseInt(st.nextToken());
			pr[1][i]=Integer.parseInt(st.nextToken());
			pr[2][i]=Integer.parseInt(st.nextToken());
			if(i==0) {
				d[0][i]=pr[0][i];
				d[1][i]=pr[1][i];
				d[2][i]=pr[2][i];
			}
		}
		
		for(int i=1;i<N;i++) {
			d[0][i]=Math.min(d[2][i-1], d[1][i-1])+pr[0][i];
			d[1][i]=Math.min(d[0][i-1], d[2][i-1])+pr[1][i];
			d[2][i]=Math.min(d[1][i-1], d[0][i-1])+pr[2][i];
		}
		
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<3;i++) {
			ans=Math.min(ans, d[i][N-1]);
			System.out.println(Arrays.toString(d[i]));

		}
		
		System.out.println(ans);
		
	}
}

