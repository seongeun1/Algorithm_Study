package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int E=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());

		int N=1;
		while(N>0) {
			if(E==1 && S==1 && M==1) break;

			E--;
			if(E==0) E=15;
			S--;
			if(S==0) S=28;
			M--;
			if(M==0) M=19;
			N++;


		}
		System.out.println(N);
	}
}


