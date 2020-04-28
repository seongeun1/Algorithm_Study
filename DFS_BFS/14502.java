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
	public static void dfs(int index, int size) {
		if(size==3) {
			check=new int[N][M];
			for(int i=0;i<3;i++) {
			
				Point p=select.get(i);
				check[p.x][p.y]=1;
			}
			for(int i=0;i<wall.size();i++) {
				Point p=wall.get(i);
				check[p.x][p.y]=1;
			}
			for(int i=0;i<virus.size();i++) {
				Point p=virus.get(i);
				check[p.x][p.y]=2;
			}
			bfs();
			return;
		}
		else if(index==ar.size()) return;
		else {
			select.add(ar.get(index));
			dfs(index+1, size+1);
			select.remove(select.size()-1);
			dfs(index+1, size);
		}
		return;
		
		
	}
	
	public static void bfs() {
		LinkedList<Point> pq=new LinkedList<Point>();
		for(int i=0;i<virus.size();i++) {
			pq.add(virus.get(i));
		}
		while(!pq.isEmpty()) {
			Point p=pq.poll();
			for(int i=0;i<4;i++) {
				int x=p.x+nx[i];
				int y=p.y+ny[i];
				if(x>=0 && x<N && y>=0 && y<M) {
					if(mtx[x][y]==0 && check[x][y]==0) {
						check[x][y]=2;
						pq.offer(new Point(x, y));
					}
					else if(mtx[x][y]==2 && check[x][y]==0) {
						check[x][y]=2;
						pq.offer(new Point(x, y));
					}
					else if(mtx[x][y]==0 && check[x][y]==1) {
						check[x][y]=1;
					}

				}
				
			}
			
		}
		
		int sans=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(check[i][j]==0) sans++;
			}
		}
		
		max=Math.max(sans, max);
		
		return;
		
		
	}
	
	public static int[][]mtx;
	public static int[][]check;
	public static int N;
	public static int M;
	public static int max=Integer.MIN_VALUE;
	public static ArrayList<Point> ar=new ArrayList<>();
	public static ArrayList<Point> select=new ArrayList<>();
	public static ArrayList<Point> wall=new ArrayList<>();
	public static ArrayList<Point> virus=new ArrayList<>();
	public static int[] nx= {1, -1, 0, 0};
	public static int[] ny= {0, 0, -1, 1};
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		mtx=new int[N][M];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<M;j++) {
				int a=Integer.parseInt(st.nextToken());
				mtx[i][j]=a;
				if(a==0) ar.add(new Point(i, j));
				else if(a==1) wall.add(new Point(i, j));
				else if(a==2) virus.add(new Point(i, j));
				
			}
		}
		
		dfs(0, 0);
		System.out.println(max);
		
	

	}
}