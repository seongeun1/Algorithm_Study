package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node{
	int x;
	int y;
	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Node [x=" + x + ", y=" + y + "]";
	}
	
}

public class Main {
	public static void dfs(int idx, int size) {
		
		if(size==2) {

			check=new int[N][M];
			visit=new int[N][M];
			for(int i=0;i<2;i++) {
				int x=select.get(i).x;
				int y=select.get(i).y;
				check[x][y]=1;
			}
			for(int i=0;i<one.size();i++) {
				int x=one.get(i).x;
				int y=one.get(i).y;
				check[x][y]=1;
			}
			for(int i=0;i<two.size();i++) {
				int x=two.get(i).x;
				int y=two.get(i).y;
				check[x][y]=2;
			}

			
			bfs();

			return;
			
		}
		else if(idx==zero.size()) return;
		else {
			select.add(zero.get(idx));
			dfs(idx+1, size+1);
			select.remove(select.size()-1);
			dfs(idx+1, size);			
		}
		return;
	}
	
	
	public static void bfs() {
		boolean flag=true;
		boolean tflag=false;
			
		LinkedList<Integer> qx=new LinkedList<>();
		LinkedList<Integer> qy=new LinkedList<>();
		
		int totalsum=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				int sum=0;
				if(check[i][j]==2 & visit[i][j]==0) {
					flag=true;
					qx.add(i);
					qy.add(j);
					
					visit[i][j]=1;
					while(!qx.isEmpty()) {
						int a=qx.poll();
						int b=qy.poll();
						if(check[a][b]==2) sum++;
						for(int d=0;d<4;d++) {
							int dx=a+nx[d];
							int dy=b+ny[d];
							if(dx<0 || dx>=N || dy<0 ||dy>=M) continue;
							if(visit[dx][dy]==1) continue;
							if(check[dx][dy]==1) continue;
							if(check[dx][dy]==0) {
								flag=false;
								qx.add(dx);
								qy.add(dy);
								visit[dx][dy]=1;
							}
							if(check[dx][dy]==2) {
								qx.add(dx);
								qy.add(dy);
								visit[dx][dy]=1;
							}
						}

					}
					if(flag) {
						tflag=true;
						totalsum+=sum;
					}
					
					
				}
				
				
			}
		}
		
		if(tflag) {
			ans=Math.max(ans,  totalsum);
		}
		return;
		
	}
	


	static int[] nx= {-1, 1, 0, 0};
	static int[] ny= {0, 0, -1, 1};
	static int N;
	static int M;
	static int[][] visit;
	static int[][] mtx;
	static int[][] check;
	static int ans=0;
	static ArrayList<Node> zero=new ArrayList<>();
	static ArrayList<Node> one=new ArrayList<>();
	static ArrayList<Node> two=new ArrayList<>();
	static ArrayList<Node> select=new ArrayList<>();
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
				mtx[i][j]=Integer.parseInt(st.nextToken());
			
				if(mtx[i][j]==0) zero.add(new Node(i, j));
				else if(mtx[i][j]==2) two.add(new Node(i, j));
				else if(mtx[i][j]==1) one.add(new Node(i, j));
			}
		}

		dfs(0, 0);
		
		System.out.println(ans);
		
	}
}