package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void wave(int n) {
		long[] wave=new long[n+3];
		wave[0]=1;wave[1]=1; wave[2]=1;
		for(int i=3;i<=n;i++) {
			wave[i]=wave[i-2]+wave[i-3];
		}
		sb.append(wave[n-1]+"\n");
		
	}
	
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String s=bf.readLine();
		StringTokenizer st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			wave(Integer.parseInt(st.nextToken()));
		}
		System.out.println(sb);




	}
}


