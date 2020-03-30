package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
	public static int cnt;
	public static void dfs(int[][] g, int[][] visited, int i, int j) {
		visited[i][j]=1;
		
		int[] dx=new int[4];
		int[] dy=new int[4];
		
		dx[0]=-1;dy[0]=0;
		dx[1]=0;dy[1]=1;
		dx[2]=0;dy[2]=-1;
		dx[3]=1;dy[3]=0;
		
		
		for(int x=0;x<4;x++) {
			int nx=i+dx[x], ny=j+dy[x];
			
			if(nx>=0 && nx<g.length && ny>=0 && ny<g.length &&visited[nx][ny]==0 && g[nx][ny]==1) {
				cnt++;
				dfs(g, visited, nx, ny);
	
			}
			
		}
		
	}
	


	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));


		int N=Integer.parseInt(bf.readLine());



		int[][] g=new int[N][N];
		LinkedList<Integer> count=new LinkedList<Integer>();
		int[][] visited=new int[N][N];
		
		int ans=0;
		
		for(int i=0;i<N;i++) {
			String s=bf.readLine();
			for(int j=0;j<N;j++) {
				g[i][j]=Integer.parseInt(s.substring(j, j+1));
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				
				if(g[i][j]==1 && visited[i][j]==0) {
					cnt=1;
					dfs(g, visited, i, j);
					count.add(cnt);
				}
					
			}
		}
		
		Collections.sort(count);
		
		System.out.println(count.size());
		for(int i=0;i<count.size();i++) {
			System.out.println(count.get(i));
		}
		
		
		


	}

}