package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	static void rotate() {
		for(int i=0;i<Math.min(N,  M)/2;i++) {
			int d=0;
			int x=i; int y=i;
			while(d<4) {
				int nx=x+dx[d];
				int ny=y+dy[d];
				
				if(nx>=i && nx<N-i && ny>=i && ny<M-i) {
					tmp[nx][ny]=mtx[x][y];
					x=nx;
					y=ny;
				}
				else {
					
					d++;
				}
			}	
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				mtx[i][j]=tmp[i][j];
			}
		}
		
	}
	
	
	static int N;
	static int M;
	static int K;
	static int[][] mtx;
	static int[] dx= {1, 0, -1, 0};
	static int[] dy= {0, 1, 0, -1};
	static int[][] tmp;
  	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		mtx=new int[N][M];
		tmp=new int[N][M];
		K=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<M;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		
		for(int i=0;i<K;i++) {
			rotate();
			
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				sb.append(tmp[i][j]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);

	}
}
