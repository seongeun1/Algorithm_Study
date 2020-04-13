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
		int[] d=new int[M];
		for(int i=0;i<M;i++) {
			s[i]=Integer.parseInt(st.nextToken());
			d[i]=1;
		}
		
		for(int i=0;i<M-1;i++) {
			for(int j=i+1;j<M;j++) {
				if(s[i]<s[j] && d[i]>=d[j]) d[j]=d[i]+1;
			}
		
		}
		int ans=0;
		for(int i=0;i<M;i++) {
			if(d[i]>ans) ans=d[i];
		}
		System.out.println(ans);
		
		int a=ans;
		int[] ss=new int[a];
		for(int i=M-1;i>=0 && a>0;i--) {
			if(d[i]==a) {
				ss[a-1]=s[i];
				a--;
			}
		}
		for(int i=0;i<ans;i++) {
			sb.append(ss[i]+" ");
		}
		
		
	
		System.out.println(sb);
		
		
	}
}

