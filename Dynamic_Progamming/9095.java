package pr;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;




public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		
		int N=Integer.parseInt(bf.readLine());
		int[] s=new int[12];
		s[1]=1;
		s[2]=2;
		s[3]=4;
		
		for(int i=4;i<=11;i++) {
			s[i]=s[i-3]+s[i-2]+s[i-1];
		}
		for(int i=0;i<N;i++) {
			sb.append(s[Integer.parseInt(bf.readLine())]+"\n");
		}
		System.out.println(sb);
	}
}

