package pr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {	
	public static final int MAX = 1000000;
	public static void bfs(int N, int K) {
		//몇 초 만에 가는지 최솟값 구하기
		LinkedList<Integer> qn=new LinkedList<Integer>();
		qn.offer(N);
	

		visit[N]=-1;
		from[N]=0;

		while(!qn.isEmpty()) {
			int n=qn.poll();
			if(n+1<MAX && (visit[n+1]==0)) {
				if(visit[n]==-1) visit[n+1]=1;
				else visit[n+1]=visit[n]+1;
				from[n+1]=n;
				qn.offer(n+1);


			}
			if(n-1>=0 && (visit[n-1]==0)) {
				if(visit[n]==-1) visit[n-1]=1;
				else visit[n-1]=visit[n]+1;
				from[n-1]=n;
				qn.offer(n-1);


			}
			if(2*n<MAX && (visit[2*n]==0)) {
				if(visit[n]==-1) visit[2*n]=1;
				else visit[2*n]=visit[n]+1;
				from[2*n]=n;
				qn.offer(2*n);

			}


		}



		visit[N]=0;
		System.out.println(visit[K]);
		Stack<Integer> st=new Stack<>();

		for(int i=K;i!=N;i=from[i]) {
			st.push(i);
		}
		st.push(N);
		while(!st.isEmpty()) {
			sb.append(st.pop()+" ");
		}
		System.out.println(sb);

		ans=visit[K];

	}



	public static boolean flag=false;
	public static int[] mtx;
	public static int[] visit;
	public static int[] from;

	public static int ans=0;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		mtx=new int[MAX];
		visit=new int[MAX];
		from=new int[MAX];

		StringTokenizer st=new StringTokenizer(bf.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());


		bfs(N, K);




	}
}