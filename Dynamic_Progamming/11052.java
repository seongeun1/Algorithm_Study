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
		int[] s=new int[N+1];
		StringTokenizer st=new StringTokenizer(bf.readLine());
		for(int i=1;i<=N;i++) {
			s[i]=Integer.parseInt(st.nextToken());
		}
		
		int[] d=new int[N+1];
		for(int i=1;i<=N;i++) {
			int n=s[i];
			for(int j=1;j<i;j++) {
				n=Math.max(n, s[j]+d[i-j]);
			}
			d[i]=n;
		}
		System.out.println(d[N]);
	}
}

