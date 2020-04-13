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
		StringTokenizer st=new StringTokenizer(bf.readLine());
	
		int[] s=new int[M];
		for(int i=0;i<M;i++) {
			s[i]=Integer.parseInt(st.nextToken());
		}
		int[] d=new int[M];
		d[0]=s[0];
		int ans=d[0];
		for(int i=1;i<M;i++) {
			if(d[i-1]+s[i]>s[i]) d[i]=d[i-1]+s[i];
			else d[i]=s[i];
			
			if(ans<d[i]) {
				ans=d[i];

			}
			
		}

		System.out.println(ans);
		
		
	}
}

