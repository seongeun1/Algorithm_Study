package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static int cnt;
	public static int M;
	public static int N;
	public static int[][] g;
	public static int[][] visited;
	public static void bfs(int i, int j) {
		LinkedList<Integer> x=new LinkedList<Integer>();
		LinkedList<Integer> y=new LinkedList<Integer>();
		

		x.offer(i);y.offer(j);



		int[] dx=new int[4];
		int[] dy=new int[4];

		dx[0]=-1;dy[0]=0;
		dx[1]=0;dy[1]=1;
		dx[2]=0;dy[2]=-1;
		dx[3]=1;dy[3]=0;


		while(!x.isEmpty()&&!y.isEmpty()) {
			i=x.poll(); j=y.poll();
			visited[i][j]=1;


			for(int t=0;t<4;t++) {
				int nx=i+dx[t], ny=j+dy[t];
				if(nx>=0 && nx<N && ny>=0 && ny<M &&visited[nx][ny]==0 && g[nx][ny]==1) {
					visited[nx][ny]=1;
					g[nx][ny]=g[i][j]+1;
					x.offer(nx); y.offer(ny);
				}

			}
		}
	}



	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));


		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());




		g=new int[N][M];
		visited=new int[N][M];


		for(int i=0;i<N;i++) {
			String s=bf.readLine();
			for(int j=0;j<M;j++) {
				g[i][j]=Integer.parseInt(s.substring(j, j+1));
			}
		}

		


		bfs(0, 0);

		System.out.println(g[N-1][M-1]);



	}

}