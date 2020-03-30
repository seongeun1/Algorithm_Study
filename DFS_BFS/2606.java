package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void dfs(int[][] g, int[] visited,int start, int[] num) {
		visited[start]=1;
		num[0]++;
		//System.out.print(start+" ");
		for(int i=1;i<g[start].length;i++) {
			if(g[start][i]==1 && visited[i]==0) dfs(g, visited, i, num);
		}
	}

	
	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

	
		int N=Integer.parseInt(bf.readLine());
		int M=Integer.parseInt(bf.readLine());
		


		int[][] g=new int[N+1][N+1];
		int[] visited1=new int[N+1];
	
		visited1[0]=1;
	
		
		for(int i=0;i<M;i++) {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			g[a][b]=1;
			g[b][a]=1;
		}
		
		int[] num=new int[1];
		num[0]=-1;
		dfs(g, visited1, 1, num);
		System.out.println(num[0]);



	}

}
