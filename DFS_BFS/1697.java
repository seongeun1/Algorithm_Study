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
	public static int[]g;
	public static int[]visited;
	public static LinkedList<Integer> x=new LinkedList<Integer>();
	
	public static void bfs() {

		int[] dx=new int[3];
		dx[0]=1;dx[1]=-1;dx[2]=2;


		while(!x.isEmpty()) {
			int i=x.poll();
			visited[i]=1;


			for(int t=0;t<3;t++) {
				int nx=i+dx[t];
				if(t==2) nx=i*dx[t];
				if(nx>=0 && nx<=200002 &&visited[nx]==0) {
					visited[nx]=1;
					g[nx]=g[i]+1;
					x.offer(nx);
				}

			}
		}
	}



	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));


		StringTokenizer st=new StringTokenizer(bf.readLine());
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
	





		g=new int[200003];
		visited=new int[200003];
		
		x.offer(M);

		
		bfs();


	System.out.println(g[N]);	
		
	}

}