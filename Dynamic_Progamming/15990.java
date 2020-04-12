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
		long[][] d=new long[100000][3];
		d[1][0]=1;
		d[2][1]=1;
		d[3][0]=1;
		d[3][1]=1;
		d[3][2]=1;
		while((M--)>0) {
			int N=Integer.parseInt(bf.readLine());
			for(int i=4;i<=N;i++) {
				d[i][0]=(d[i-1][1]+d[i-1][2])%1000000009;
				d[i][1]=(d[i-2][0]+d[i-2][2])%1000000009;
				d[i][2]=(d[i-3][0]+d[i-3][1])%1000000009;
				//	System.out.println(Arrays.toString(d[i]));
			}

			sb.append((d[N][0]+d[N][1]+d[N][2])%1000000009+"\n");
		}
		
		System.out.println(sb);
	}
	

}

