package pr;



import java.io.*;
import java.util.*;



public class Main {	
	public static void bfs() {
		LinkedList<Integer> qx=new LinkedList<Integer>();	
		LinkedList<Integer> qy=new LinkedList<Integer>();
		
		qx.offer(0);qy.offer(0);
		check[0][0]=1;
		
		while(!(qx.isEmpty() && qy.isEmpty())) {
			int x=qx.poll();
			int y=qy.poll();
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				
				if(nx>=0 && nx<M && ny>=0 && ny<N) {
					if(check[nx][ny]==0 && mtx[nx][ny]==0) {
						check[nx][ny]=check[x][y];
						qx.offerFirst(nx);
						qy.offerFirst(ny);
						
					}
					else if(check[nx][ny]==0 && mtx[nx][ny]==1) {
						check[nx][ny]=check[x][y]+1;
						qx.offerLast(nx);
						qy.offerLast(ny);
					}
				}
				
				
			}
		}
		
		
		
		
		
	}
	public static int[] dx= {0, 1, -1, 0};
	public static int[] dy= {1, 0, 0, -1};
	public static int ans=Integer.MAX_VALUE;
	public static int N;
	public static int M;
	public static int[][] mtx;
	public static int[][] check;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		mtx=new int[M][N];
		check=new int[M][N];
		
		for(int i=0;i<M;i++) {
			String s=bf.readLine();
			for(int j=0;j<N;j++) {
				mtx[i][j]=s.charAt(j)-'0';
			}
			
		}
		
		bfs();
		
		
		
		System.out.println(check[M-1][N-1]-1);
	}

}