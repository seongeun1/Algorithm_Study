package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void bfs(int x, int y) {
	int[]  dy = {2,1,-1,-2,-2,-1,1,2};
	int[] dx = {1,2,2,1,-1,-2,-2,-1};
		
	Queue<Integer> qx=new LinkedList<Integer>();
	Queue<Integer> qy=new LinkedList<Integer>();
	
	qx.offer(x);
	qy.offer(y);
	list[x][y]=1;
	while(!qx.isEmpty() && !qy.isEmpty()) {
		x=qx.poll();
		y=qy.poll();
		
		for(int i=0;i<8;i++) {
			int xxx=x+dx[i];
			int yyy=y+dy[i];
			if(xxx>=0 && xxx<n && yyy>=0 && yyy<n && list[xxx][yyy]==0) {
				list[xxx][yyy]=list[x][y]+1;
				qx.offer(xxx);
				qy.offer(yyy);
			}
		}
		
		
		
	}
	
	}
	
	


	public static int n;

	

	
	public static int[][] list;
	
	public static int ansa;
	public static int ansb;

	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		while(N-->0) {
			n=Integer.parseInt(bf.readLine());
		
			list=new int[n][n];
			
			StringTokenizer st=new StringTokenizer(bf.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			st=new StringTokenizer(bf.readLine());
			ansa=Integer.parseInt(st.nextToken());
			ansb=Integer.parseInt(st.nextToken());
			
			bfs(a, b);
			
			sb.append(list[ansa][ansb]-1+"\n");
			
		}
	
		System.out.println(sb);
	}
	
}


