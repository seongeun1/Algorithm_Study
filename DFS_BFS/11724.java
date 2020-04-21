package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;





public class Main {
	public static void dfs(int index) {
			list[index]=1;
			for(int i=0;i<n;i++) {
				if(list[i]==0 && mtx[index][i]==1) {
					list[i]=1;
					dfs(i);
				}
			}
	}
	
	


	public static int n;
	public static int m;
	

	public static int[][] mtx;
	public static int[] list;

	public static int ans=0;

	
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());

		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
	
		mtx=new int[n][n];
		list=new int[n];

		for(int i=0;i<m;i++) {
			st=new StringTokenizer(bf.readLine());
			
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				mtx[a-1][b-1]=mtx[b-1][a-1]=1;
			
		}
		
		for(int i=0;i<n;i++){
			if(list[i]==0) {
				dfs(i);
				ans++;
			}
		}
			System.out.println(ans);
	}
}


