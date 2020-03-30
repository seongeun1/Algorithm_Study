package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	//	public static StringBuffer sb=new StringBuffer();
	public static void dfs(int[][] g, int[] visited,int start) {
		visited[start]=1;
		System.out.print(start+" ");
		for(int i=1;i<g[start].length;i++) {
			if(g[start][i]==1 && visited[i]==0) dfs(g, visited, i);
		}
	}

	public static void bfs(int[][] g, int[] visited, int start) {
		LinkedList<Integer> que=new LinkedList<Integer>();
		visited[start]=1;
		que.offer(start);
		while(!que.isEmpty()) {
			int temp=que.poll();
			System.out.print(temp+" ");
			for(int i=1;i<g[temp].length;i++) {
				if(g[temp][i]==1 && visited[i]==0) {
					que.offer(i);
					visited[i]=1;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer(bf.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int f=Integer.parseInt(st.nextToken());


		int[][] g=new int[N+1][N+1];
		int[] visited1=new int[N+1];
		int[] visited2=new int[N+1];
		visited1[0]=1;
		visited2[0]=1;
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(bf.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			g[a][b]=1;
			g[b][a]=1;
		}

		dfs(g, visited1, f);
		System.out.println();

		bfs(g, visited2, f);


	}

}
