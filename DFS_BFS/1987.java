package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static int N;
	public static int M;

	public static ArrayList<Character> route;
	public static int ans=Integer.MIN_VALUE;
	public static int[] nx= {-1, 1, 0, 0};
	public static int[] ny= {0, 0, 1, -1};
	static char[][] mtx;
	static int[][] check;
	static int sans;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		mtx=new char[N][M];
		check=new int[N][M];

		for(int i=0;i<N;i++) {
			String s=bf.readLine();
			for(int j=0;j<M;j++) {
				mtx[i][j]=s.charAt(j);
			}
		}

		route=new ArrayList<>();
		route.add(mtx[0][0]);
		check[0][0]=1;
		dfs(0, 0);



		System.out.println(ans);

	}

	public static void dfs(int a, int b) {
		if(a==N || b==M || a<0 || b<0) return;
		else {
		
			for(int i=0;i<4;i++) {
				int dx=a+nx[i];
				int dy=b+ny[i];
				if(dx>=0 && dx<N && dy>=0 && dy<M) {
					if(!check(mtx[dx][dy])|| check[dx][dy]!=0) continue;
					route.add(mtx[dx][dy]);
					check[dx][dy]=check[a][b]+1;
					ans=Math.max(ans, check[dx][dy]);
					dfs(dx, dy);
					route.remove(route.size()-1);
					check[dx][dy]=0;
				}
			}

		}
		return;

	}

	public static boolean check(char ch) {
		for(int i=0;i<route.size();i++) {
			if(route.get(i)==ch) return false;
		}
		return true;
	}

}