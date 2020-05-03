package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static int N;
	public static int maxdepth=Integer.MIN_VALUE;
	public static int mindepth=Integer.MAX_VALUE;
	public static int ans=Integer.MIN_VALUE;
	public static int[] nx= {-1, 1, 0, 0};
	public static int[] ny= {0, 0, 1, -1};
	static int[][] mtx;
	static int[][] check;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		mtx=new int[N][N];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<N;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
				maxdepth=Math.max(maxdepth, mtx[i][j]);
				mindepth=Math.min(mindepth, mtx[i][j]);
			}
		}
		
		System.out.println(mindepth+" "+maxdepth);
		
		for(int d=mindepth;d<maxdepth;d++) {
			check=new int[N][N];
			ccheck(d);
			int sans=0;
		

			for(int a=0;a<N;a++) {
				for(int b=0;b<N;b++) {
					if(check[a][b]==1) continue;
					bfs(a, b); sans++;
				}
			}
			ans=Math.max(sans, ans);
		
		}
		System.out.println(ans);

	}
	public static void ccheck(int num) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(mtx[i][j]<=num) check[i][j]=1;
			}
		}
		return;
	}
	
	public static void bfs(int a, int b) {
		LinkedList<Integer> xq=new LinkedList<>();
		LinkedList<Integer> yq=new LinkedList<>();
		xq.offer(a);
		yq.offer(b);
		
		while(!(xq.isEmpty() && yq.isEmpty())) {
			int x=xq.poll();
			int y=yq.poll();
			check[x][y]=1;
			for(int i=0;i<4;i++) {
				int dx=x+nx[i];
				int dy=y+ny[i];
				if(dx>=0 && dx<N && dy>=0 && dy<N) {
					if(check[dx][dy]==1) continue;
					check[dx][dy]=1;
					xq.offer(dx);
					yq.offer(dy);
				}
			}

		}
		return;

	}

	
}