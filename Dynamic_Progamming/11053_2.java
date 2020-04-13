package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;





public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		int M=Integer.parseInt(bf.readLine());
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int[] s=new int[M];
		int[] d=new int[M];
		for(int i=0;i<M;i++) {
			s[i]=Integer.parseInt(st.nextToken());
			d[i]=1;
		}
		
		for(int i=0;i<M-1;i++) {
			for(int j=i+1;j<M;j++) {
				if(s[i]<s[j] && d[i]>=d[j]) d[j]=d[i]+1;
			}
			System.out.println(Arrays.toString(d));
		}
		int ans=0;
		for(int i=0;i<M;i++) {
			if(d[i]>ans) ans=d[i];
		}
		System.out.println(ans);
		
		
		
	}
}

