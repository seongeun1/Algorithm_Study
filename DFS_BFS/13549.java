package pr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void bfs(int N, int K) {
		//몇 초 만에 가는지 최솟값 구하기
		LinkedList<Integer> qn=new LinkedList<Integer>();
		qn.offer(N);

		visit[N]=-1;
		while(!qn.isEmpty()) {
			int n=qn.poll();
			if(n+1<100001 && (visit[n+1]==0||visit[n+1]>visit[n]+1)) {
				if(visit[n]==-1) visit[n+1]=1;
				else visit[n+1]=visit[n]+1;
				qn.offer(n+1);


			}
			if(n-1>=0 && (visit[n-1]==0||visit[n-1]>visit[n]+1)) {
				if(visit[n]==-1) visit[n-1]=1;
				else visit[n-1]=visit[n]+1;
				qn.offer(n-1);

			}
			if(2*n<100001 && (visit[2*n]==0||visit[2*n]>visit[n])) {
				if(n==N) visit[2*n]=-1;
				else visit[2*n]=visit[n];
				qn.offer(2*n);

			}
			

		}
		
		
		if(visit[K]==-1) visit[K]=0;
		System.out.println(visit[K]);
		

	}



	public static boolean flag=false;
	public static int[] mtx;
	public static int[] visit;
	public static int[] visit2;

	public static int ans=0;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		mtx=new int[2*100001];
		visit=new int[2*100001];
		visit2=new int[2*100001];

		StringTokenizer st=new StringTokenizer(bf.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());


		bfs(N, K);
	


	}
}

