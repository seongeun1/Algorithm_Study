package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;







public class Main {	
	public static void bfs(int a, int b) {
		LinkedList<Integer> qx=new LinkedList<>();
		LinkedList<Integer> qy=new LinkedList<>();
		
		check[a][b]=0;
		qx.offer(a);
		qy.offer(b);
		while(!(qx.isEmpty() && qy.isEmpty())) {
			int x=qx.poll();
			int y=qy.poll();
			
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				if(nx>=0 && nx<N && ny>=0 && ny<M) {
					if(check[nx][ny]==0 && mtx[nx][ny]==1) {
						check[nx][ny]=check[x][y]+1;
						qx.offer(nx);
						qy.offer(ny);
					}
								
				}
			}
			
			
		}
		
		
		
	}
	public static int[] dx= {1, -1, 0, 0};
	public static int[] dy= {0, 0, 1, -1};
	
	public static int[][] mtx;
	public static int[][] check;
	public static int N;
	public static int M;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		mtx=new int [N][M];
		check=new int[N][M];
		
		
		int a=-1, b=-1;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<M;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
				if(mtx[i][j]==2) {
					a=i;b=j;
				}
			}
		}
		
		bfs(a, b);
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(check[i][j]==0 && mtx[i][j]==1) check[i][j]=-1;
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				sb.append(check[i][j]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		
		
		
		
		
	}
}