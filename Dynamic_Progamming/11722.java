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
		int[] d=new int[N];

		StringTokenizer st=new StringTokenizer(bf.readLine());

		for(int i=0;i<N;i++) {
			s[i]=Integer.parseInt(st.nextToken());
		}

	
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			d[i]=Math.max(1, d[i]);
			for(int j=i+1;j<N;j++) {
				if(s[i]>s[j] && d[i]+1>d[j]) {
					d[j]=d[i]+1;
				}
			}
			ans=Math.max(d[i], ans);
			System.out.println(Arrays.toString(d));
		}
		
		
		
		
		

		System.out.println(ans);	
	}
}

