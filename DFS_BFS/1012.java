package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int cnt;
	public static int M;
	public static int N;
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
			if(nx>=0 && nx<M && ny>=0 && ny<N &&visited[nx][ny]==0 && g[nx][ny]==1) {
				
				dfs(g, visited, nx, ny);
	
			}
			
		}
		
	}
	


	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(bf.readLine());
		
		for(int t=0;t<T;t++) {
		StringTokenizer st=new StringTokenizer(bf.readLine());
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());



		int[][] g=new int[M][N];
		int[][] visited=new int[M][N];
		
	
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(bf.readLine());
		
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			g[a][b]=1;			
			
		}
		
	
		cnt=0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(g[i][j]==1 && visited[i][j]==0) {
					dfs(g, visited, i, j);
					cnt++;
				}
					
			}
		}
		
	
		System.out.println(cnt);
		
		}
		
		


	}

}