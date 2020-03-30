package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static int cnt=Integer.MIN_VALUE;
	public static int M;
	public static int N;
	public static int H;
	public static int[][][] g;
	public static int[][][] visited;
	public static LinkedList<Integer> x=new LinkedList<Integer>();
	public static LinkedList<Integer> y=new LinkedList<Integer>();
	public static LinkedList<Integer> z=new LinkedList<Integer>();
	public static void bfs() {

		int[] dx=new int[6];
		int[] dy=new int[6];
		int[] dz=new int[6];

		dx[0]=-1;dy[0]=0; dz[0]=0;
		dx[1]=0;dy[1]=1; dz[1]=0;
		dx[2]=0;dy[2]=-1; dz[2]=0;
		dx[3]=1;dy[3]=0; dz[3]=0;
		dx[4]=0;dy[4]=0;dz[4]=1;
		dx[5]=0;dy[5]=0;dz[5]=-1;


		while(!x.isEmpty()&&!y.isEmpty()&&!z.isEmpty()) {
			int i=x.poll(), j=y.poll(),h=z.poll();
			visited[i][j][h]=1;


			for(int t=0;t<6;t++) {
				int nx=i+dx[t], ny=j+dy[t], nz=h+dz[t];
				if(nx>=0 && nx<N && ny>=0 && ny<M && nz>=0 && nz<H &&visited[nx][ny][nz]==0 && g[nx][ny][nz]!=-1 && g[nx][ny][nz]!=1) {
					visited[nx][ny][nz]=1;
					g[nx][ny][nz]=g[i][j][h]+1;
					x.offer(nx); y.offer(ny);z.offer(nz);
				}

			}
		}
	}



	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));


		StringTokenizer st=new StringTokenizer(bf.readLine());
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		H=Integer.parseInt(st.nextToken());





		g=new int[N][M][H];
		visited=new int[N][M][H];

		for(int h=0;h<H;h++) {
			for(int i=0;i<N;i++) {
				st=new StringTokenizer(bf.readLine());
				for(int j=0;j<M;j++) {
					g[i][j][h]=Integer.parseInt(st.nextToken());
					if(g[i][j][h]==1) {
						x.offer(i);
						y.offer(j);
						z.offer(h);

					}
				}
			}
		}

		bfs();

		int flag=0;

		for(int h=0;h<H;h++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(g[i][j][h]==0) {
						cnt=0; flag=1; break;
					}
					if(cnt<g[i][j][h]) cnt=g[i][j][h];

				}
				if(flag==1) break;
			}
			if(flag==1) break;

		}
		

		
	System.out.println(cnt-1);	
		
	}

}