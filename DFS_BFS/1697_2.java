package pr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void bfs(int N, int K) {
		LinkedList<Integer> qn=new LinkedList<Integer>();
		qn.offer(N);
		
		visit[N]=1;
		while(!qn.isEmpty()) {
			int n=qn.poll();
			if(n+1<100001 && visit[n+1]==0) {
				visit[n+1]=visit[n]+1;
				qn.offer(n+1);
				if(n+1==K) break;
				
			}
			if(n-1>=0 && visit[n-1]==0) {
				visit[n-1]=visit[n]+1;
				qn.offer(n-1);
				if(n-1==K) break;
			}
			if(2*n<100001 && visit[2*n]==0) {
				visit[2*n]=visit[n]+1;
				qn.offer(2*n);
				if(2*n==K) break;
			}
			
			
		}
		System.out.println(Arrays.toString(visit));
		System.out.println(visit[K]-1);
	}
	public static boolean flag=false;
	public static int[] mtx;
	public static int[] visit;

	public static int size;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		mtx=new int[100001];
		visit=new int[100001];
		
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());


		bfs(N, K);

	}
}

