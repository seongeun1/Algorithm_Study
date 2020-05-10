package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void bfs() {
		LinkedList<Integer> qn=new LinkedList<>();
		LinkedList<Integer> qstep=new LinkedList<>();
		qn.offer(1);
		qstep.offer(0);
		visited[1]=true;
		check[1]=0;
		while(!qn.isEmpty()) {
			int a=qn.poll();
			int step=qstep.poll();
			
			if(check[100]!=0) return;
			for(int i=1;i<7;i++) {
				int nx=a+i;
				if(nx<=100 && !visited[nx]) {
					visited[nx]=true;
					qn.offer(mtx[nx]);
					check[mtx[nx]]=step+1;
					qstep.offer(step+1);
				}
			}
			
		}
		return;
	}


	static int N;
	static int M;

	static int[] mtx;
	static int[] check;
	static boolean[] visited;
	static int ans=Integer.MAX_VALUE;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine(), " ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		mtx=new int[101];
		check=new int[101];
		visited=new boolean[101];
		for(int i=1;i<101;i++) {
			mtx[i]=i;
		}
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine(), " ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			mtx[a]=b;
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(bf.readLine(), " ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			mtx[a]=b;
		}
		bfs();
		System.out.println(check[100]);
		
	}
}