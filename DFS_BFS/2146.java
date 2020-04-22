package pr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;






public class Main {
	public static void island(int x, int y, int type) {
		check[x][y]=type;

		for(int i=0;i<4;i++) {
			int a=dx[i]+x;
			int b=dy[i]+y;
			if(a>=0 && a<N && b>=0 && b<N && mtx[a][b]==1 && check[a][b]==0) {
				island(a, b, type);
			}
		}

	}
	public static void bridge(int x, int y) {

		Queue<Integer> qx=new LinkedList<Integer>();
		Queue<Integer> qy=new LinkedList<Integer>();

		qx.add(x);
		qy.add(y);
		check[x][y]=1;
		while(!(qx.isEmpty()&&qy.isEmpty())) {


		}

		public static int[] dx= {-1, 0, 1, 0};
		public static int[] dy= {0, -1, 0, 1};
		public static int[][] check;
		public static int[][] mtx;
		public static int[][] dist;
		public static int N;
		public static StringBuffer sb=new StringBuffer();
		public static int ans =Integer.MAX_VALUE;
		public static void main(String[] args) throws IOException {
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;
			N=Integer.parseInt(bf.readLine());
			mtx=new int[N][N];
			check=new int[N][N];
			dist=new int[N][N];

			for(int i=0;i<N;i++) {
				st=new StringTokenizer(bf.readLine());
				for(int j=0;j<N;j++) {
					mtx[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			int type=1;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(mtx[i][j]==1&&check[i][j]==0) {
						island(i, j, type);
						type++;
					}
				}
			}

			Queue<Integer> qx=new LinkedList<Integer>();
			Queue<Integer> qy=new LinkedList<Integer>();
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					dist[i][j]=-1;//섬아니라서 -1이당
					if(mtx[i][j]==1) {
						qx.offer(i);
						qy.offer(j);
						dist[i][j]=0;//섬이냐?
					}
				}
			}

			while(!(qx.isEmpty() && qy.isEmpty())) {
				int a=qx.poll();
				int b=qy.poll();
				for(int i=0;i<4;i++) {
					int aa=a+dx[i];
					int bb=b+dy[i];
					if(aa>=0 && aa<N && bb>=0 && bb<N && mtx[aa][bb]==0) {
						if(dist[aa][bb]==-1) {//다른데서 섬 아니라고 등록 먼저 해두면 그냥 지나감
							dist[aa][bb]=dist[a][b]+1;
							check[aa][bb]=check[a][b];
							qx.offer(aa);
							qy.offer(bb);
						}
					}


				}
			}
			int ans=Integer.MAX_VALUE;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					for(int k=0;k<4;k++) {
						int aa=i+dx[k];
						int bb=j+dy[k];
						if(aa>=0 && aa<N && bb>=0 && bb<N && mtx[aa][bb]==0) {
							if(check[i][j]!=check[aa][bb]) {
								ans=Math.min(ans, dist[i][j]+dist[aa][bb]);
							}

						}
					}
				}
			}
			System.out.println(ans);
		}
	}
