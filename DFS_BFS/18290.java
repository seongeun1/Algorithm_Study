package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node{
	int x;
	int y;
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Node [x=" + x + ", y=" + y + "]";
	}
	

}

public class Main {
	public static void dfs(int size) {
		if(size==K) {
			int sans=0;
			for(int i=0;i<ar.size();i++) {
				int ax=ar.get(i).x;
				int ay=ar.get(i).y;
				sans+=mtx[ax][ay];
				
			}
			
			ans=Math.max(ans,  sans);
			return;
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(check(i, j)) {
					ar.add(new Node(i, j));
					dfs(size+1);
					ar.remove(ar.size()-1);
				}
			}
		}
		
		return;

	}

	public static boolean check(int x, int y) {
		for(int i=0;i<ar.size();i++) {
			int ax=ar.get(i).x;
			int ay=ar.get(i).y;

			if(ax-1==x && ay==y) return false;
			if(ax+1==x && ay==y) return false;
			if(ax==x && ay==y-1) return false;
			if(ax==x && ay==y+1) return false;
			if(ax==x && ay==y) return false;

		}

		return true;
	}


	static int N;
	static int M;
	static int K;
	static ArrayList<Node> ar=new ArrayList<>();
	static int[][] mtx;

	static int ans=Integer.MIN_VALUE;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine(), " ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		mtx=new int[N][M];

		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine(), " ");
			for(int j=0;j<M;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		dfs(0);
		System.out.println(ans);

	}
}