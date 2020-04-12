package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		int[] s=new int[N+3];
		s[1]=1;
		s[2]=3;
		
		for(int i=3;i<=N;i++) {
			s[i]=(s[i-1]+2*s[i-2])%10007;
		}
		
		System.out.println(s[N]);
		
	
	}
}

