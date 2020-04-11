package pr;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;




public class Main {
	public static int gcd(int a, int b) {
		if(b==0) return a;
		else {
			return gcd(b, a%b);
		}
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N=Integer.parseInt(bf.readLine());
		while((N--)>0) {
			int sum=0;
			
			int[] num;
			
			StringTokenizer st=new StringTokenizer(bf.readLine());
			int n=Integer.parseInt(st.nextToken());
			num=new int[n];
			for(int i=0;i<n;i++) {
				num[i]=Integer.parseInt(st.nextToken());
			}

			
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					sum+=gcd(num[i], num[j]);
				}
			}
			
			bw.write(sum+"\n");
			
		}
		
		bw.flush();
	}
}
