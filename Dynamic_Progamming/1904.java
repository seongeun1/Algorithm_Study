package pr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void t(int n) {
		int[] tile=new int[n+2];
		tile[0]=0;tile[1]=1;
		for(int i=2;i<=n;i++) {
			tile[i]=tile[i-1]+tile[i-2];
			tile[i]%=15746;
		}
		System.out.println(tile[n]);
	}
	
	public static LinkedList<int[]> set=new LinkedList<int[]>();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String s=bf.readLine();
		StringTokenizer st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		t(N+1);
	}
}

