package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {
	public static void bfs(int x, int y) {
		LinkedList<Integer> xq=new LinkedList<>();
		LinkedList<Integer> yq=new LinkedList<>();

		xq.offer(x);
		yq.offer(y);
		check=new int[N][M];
		check[x][y]=1;
		route[x][y]=0;
		if(mtx[x][y]=='W') return;
		
		while(!(xq.isEmpty() && yq.isEmpty())) {
			int xx=xq.poll();
			int yy=yq.poll();
			for(int i=0;i<4;i++) {
				int dx=xx+nx[i];
				int dy=yy+ny[i];
				if(dx>=0 && dx<N && dy>=0 && dy<M) {
					if(mtx[dx][dy]=='#') continue;
					if(check[dx][dy]==0 && mtx[dx][dy]=='L') {
						check[dx][dy]=1;
						route[dx][dy]=route[xx][yy]+1;
						xq.offer(dx);
						yq.offer(dy);
						ans=Math.max(ans, route[dx][dy]);
					}
				}		
			}

		}
		
		

		return;

	}



	public static char[][]mtx;
	public static int[][]check;
	public static int[][]route;
	public static int N;
	public static int M;
	public static int[] nx= {1, -1, 0, 0};
	public static int[] ny= {0, 0, -1, 1};
	public static int ans=Integer.MIN_VALUE;



	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		mtx=new char[N][M];
		
		route=new int[N][M];

		for(int i=0;i<N;i++) {
			String s=bf.readLine();
			for(int j=0;j<M;j++) {
				mtx[i][j]=s.charAt(j);
			}
		}

		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				bfs(i, j);
			}
		}

		System.out.println(ans);

	}
}