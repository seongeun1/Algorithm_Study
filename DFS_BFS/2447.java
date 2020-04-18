package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void dfs(int size,int x,int y) {
		if(size==1) {
			mtx[x][y]='*';
		}
		else {
			dfs(size/3, x, y);
			dfs(size/3, x, y+size/3);
			dfs(size/3, x, y+2*size/3);
			dfs(size/3, x+size/3, y);
			dfs(size/3, x+size/3, y+2*size/3);
			dfs(size/3, x+2*size/3, y);
			dfs(size/3, x+2*size/3, y+size/3);
			dfs(size/3, x+2*size/3, y+2*size/3);
		}
	}
	public static char[][] mtx;
	public static StringBuffer sb=new StringBuffer();
	public static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(bf.readLine());
		mtx=new char[N][N];

		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				mtx[i][j]=' ';				
			}
		}
		dfs(N, 0, 0);

		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(mtx[i][j]);				
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}
}


