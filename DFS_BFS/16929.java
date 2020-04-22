package pr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;






public class Main {
	public static void dfs(int x, int y, int px, int py, char ch) {
		if(check[x][y]==1) {
			flag=true;
			return ;
		}
		check[x][y]=1;
		
		for(int i=0;i<4;i++) {
			int a=dx[i]+x;
			int b=dy[i]+y;
			if(a>=0 && a<N && b>=0 && b<M && mtx[a][b]==ch) {
				if(!(a==px && b==py)) {
					dfs(a, b, x, y, mtx[a][b]);
				}

			}
		}
		return;

	}
	
	


	public static int[] dx= {-1, 0, 1, 0};
	public static int[] dy= {0, -1, 0, 1};
	public static int[][] check;
	public static char[][] mtx;

	public static int N;
	public static int M;
	public static 	boolean flag=false;
	public static StringBuffer sb=new StringBuffer();
	public static int ans =Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());

		mtx=new char[N][M];
		check=new int[N][M];
		for(int i=0;i<N;i++) {
			mtx[i]=bf.readLine().toCharArray();
		}
	
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(check[i][j]==0) dfs(i, j, -1, -1, mtx[i][j]);
				if(flag) break;
			}
			if(flag) break;
		}

		if(flag) System.out.println("Yes");
		else System.out.println("No");

	}
}
