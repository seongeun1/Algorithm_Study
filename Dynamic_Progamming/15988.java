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

		long[] d=new long[1000001];
		d[0]=1;
		d[1]=2;
		d[2]=4;
		int M=0;
		while(N-->0) {
			M=Integer.parseInt(bf.readLine());
			for(int i=3;i<M;i++) {
				d[i]=d[i-1]+d[i-2]+d[i-3];
			}
			sb.append(d[M-1]+"\n");


		}
		System.out.println(sb);
	}
}

