package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
public class Main {
	public static void bfs(int x, int y, char ch) {
		LinkedList<Integer> xq=new LinkedList<>();
		LinkedList<Integer> yq=new LinkedList<>();
		
		xq.offer(x);
		yq.offer(y);
		check[x][y]=1;
		int ans=1;
		while(!(xq.isEmpty() && yq.isEmpty())) {
			int xx=xq.poll();
			int yy=yq.poll();
			for(int i=0;i<4;i++) {
				int dx=xx+nx[i];
				int dy=yy+ny[i];
				if(dx>=0 && dx<N && dy>=0 && dy<M) {
					if(check[dx][dy]==0 && mtx[dx][dy]==ch) {
						check[dx][dy]=1;
						ans++;
						xq.offer(dx);
						yq.offer(dy);
					}
				}		
			}
			
		}
		
		if(ch=='W') w+=ans*ans;
		else b+=ans*ans;
		
		
		
	}
	

	
	public static char[][]mtx;
	public static int[][]check;
	public static int N;
	public static int M;
	public static int[] nx= {1, -1, 0, 0};
	public static int[] ny= {0, 0, -1, 1};
	public static int w=0;
	public static int b=0;

	public static ArrayList<Point> ar=new ArrayList<>();


	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		mtx=new char[N][M];
		check=new int[N][M];
		
		for(int i=0;i<N;i++) {
			String s=bf.readLine();
			for(int j=0;j<N;j++) {
				mtx[i][j]=s.charAt(j);
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(check[i][j]==0) bfs(i, j, mtx[i][j]);
			}
		}
		
		sb.append(w+" "+b);
		System.out.println(sb);

	}
}