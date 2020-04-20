package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main {
	public static void dfs(int type, int x, int y) {
		if(x==n-1 && y==n-1) {
			ans++;
			return;
		}
		else {
			//가로
			if(type==1) {
				//가로
				if(x<=n-1 && y+1<=n-1 && mtx[x][y+1]!=1) dfs(1, x, y+1);
				//대각선
				if(x+1<=n-1 && y+1<=n-1) {
					if(mtx[x][y+1]!=1 && mtx[x+1][y]!=1 && mtx[x+1][y+1]!=1) {
						dfs(3, x+1, y+1);
					}
				}
			}
			
			//세로
			else if(type==2) {
				//세로
				if(x+1<n && y<n&& mtx[x+1][y]!=1) dfs(2, x+1, y);
				//대각선
				if(x+1<n && y+1<n) {
					if(mtx[x][y+1]!=1 && mtx[x+1][y]!=1 && mtx[x+1][y+1]!=1) {
						dfs(3, x+1, y+1);						
					}
				}
			}
			else if(type==3) {
				//가로
				if(x<n && y+1<n && mtx[x][y+1]!=1) dfs(1, x, y+1);
				//세로
				if(x+1<n && y<n && mtx[x+1][y]!=1) dfs(2, x+1, y);
				//대각선
				if(x+1<n && y+1<n) {
					if(mtx[x][y+1]!=1 && mtx[x+1][y]!=1 && mtx[x+1][y+1]!=1) {
						dfs(3, x+1, y+1);						
					}
				}
			}
			return ;
			
		}
	}





	public static int n;


	public static int[][] mtx;


	public static int ans=0;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n=Integer.parseInt(bf.readLine());
		mtx=new int[n][n];

		for(int i=0;i<n;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<n;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
			}
		}


		dfs(1, 0, 1);

		System.out.println(ans);
	}
}


