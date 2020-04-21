package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void dfs(int x, int y, int type) {
		list[x][y]=type;
		
		//아래
		if(x<n-1 && mtx[x+1][y]==1 && list[x+1][y]==0) {
		
			dfs(x+1, y, type);
		}
		//오른쪽
		if(y+1<n && mtx[x][y+1]==1 && list[x][y+1]==0) {
		
			dfs(x, y+1, type);
		}
		//왼쪽
		if(y-1>=0 && mtx[x][y-1]==1 && list[x][y-1]==0) {
		
			dfs(x, y-1, type);
		}
		
		//위쪽
		if(x>0 && mtx[x-1][y]==1 && list[x-1][y]==0) {
			
			dfs(x-1, y, type);
		}
	}
	
	


	public static int n;
	public static int m;
	

	
	public static int[][] list;
	public static int[][] mtx ;
	
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		

		n=Integer.parseInt(bf.readLine());
		
		mtx=new int[n][n];
		list=new int[n][n];
		
		for(int i=0;i<n;i++) {
			String s=bf.readLine();
			for(int j=0;j<n;j++) {
				mtx[i][j]=Integer.parseInt(s.substring(j, j+1));
			}
		}
		int type=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(list[i][j]==0 && mtx[i][j]==1) {
					dfs(i, j, type);
					type++;
				}
	
			}
		}
		int[] ts=new int[type];
		sb.append(type-1+"\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(list[i][j]==0) continue;
				ts[list[i][j]]++;
			}
		}
		Arrays.sort(ts);
		for(int i=1;i<type;i++) {
			sb.append(ts[i]+"\n");
		}
	System.out.println(sb);
	}
	
}


