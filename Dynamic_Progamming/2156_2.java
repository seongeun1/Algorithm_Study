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
		int[] s=new int[N];
		int[][] d=new int[3][N];
		for(int i=0;i<N;i++) {
			s[i]=Integer.parseInt(bf.readLine());
		}
		
		d[0][0]=0;
		d[1][0]=s[0];
		d[2][0]=s[0];
		
		
		for(int i=1;i<N;i++) {
			d[0][i]=Math.max(d[1][i-1], Math.max(d[0][i-1], d[2][i-1]));
			d[1][i]=d[0][i-1]+s[i];
			d[2][i]=d[1][i-1]+s[i];
			
		}
		int ans=Math.max(d[0][N-1], Math.max(d[1][N-1], d[2][N-1]));
		System.out.println(Arrays.toString(d[0]));
		System.out.println(Arrays.toString(d[1]));
		System.out.println(Arrays.toString(d[2]));
		System.out.println(ans);
		
		
		
		
		
	System.out.println(sb);	
	}
}

