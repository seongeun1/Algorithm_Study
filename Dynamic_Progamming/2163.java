package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int N;
	static int M;
	static int[][] mtx;
 	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		mtx=new int[N+1][M+1];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				if(i==1) mtx[i][j]=j-1;
				else if(j==1) mtx[i][j]=i-1;
				else {
					mtx[i][j]=mtx[i][1]+i*mtx[1][j];	
					}
				
			}
		}
		
		System.out.println(mtx[N][M]);

	}
}
