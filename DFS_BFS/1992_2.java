package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void dfs(int size,int x,int y) {
		if(check(size, x, y)) {
			sb.append(mtx[x][y]);
		}
		else {
			sb.append("(");
			dfs(size/2, x, y);
			dfs(size/2, x, y+size/2);
			dfs(size/2, x+size/2, y);
			dfs(size/2, x+size/2, y+size/2);
			sb.append(")");


		}

	}

	public static boolean check(int size, int x, int y) {
		int c=mtx[x][y];
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(mtx[i][j]!=c) return false;
			}
		}
		return true;
	}
	public static int[][] mtx;
	public static StringBuffer sb=new StringBuffer();
	public static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(bf.readLine());
		mtx=new int[N][N];
		for(int i=0;i<N;i++) {
			String s=bf.readLine();
			for(int j=0;j<N;j++) {
				mtx[i][j]=Integer.parseInt(s.substring(j, j+1));
			}
		}

		dfs(N, 0, 0);
		System.out.println(sb);

	}
}


