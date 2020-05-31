package pr;



import java.io.*;
import java.util.*;



public class Main {	

	
	public static int[][] mtx;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		mtx=new int[N][M];
		
		for(int i=0;i<N;i++) {
			String s=bf.readLine();
			for(int j=0;j<M;j++) {
				mtx[i][j]=Integer.parseInt(s.substring(j, j+1));
			}
		}
		
		int K=Math.min(N,  M);
		int ans=1;
		for(int size=1;size<K;size++) {
			for(int i=0;i+size<N;i++) {
				for(int j=0;j+size<M;j++) {
					int a=mtx[i][j];
					int b=mtx[i+size][j];
					int c=mtx[i][j+size];
					int d=mtx[i+size][j+size];
					if(a==b && a==c && a==d) {
						
						ans=Math.max(ans, (size+1)*(size+1));
					}
				}
			}
		}
		
	
		System.out.println(ans);

	}

}