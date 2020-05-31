package pr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {	

	public static boolean check(){


		//���ι湮�մϴ�~
		for(int i=0;i<N;i++) {
			visited=new boolean[10];
			for(int j=0;j<N;j++) {
				//���� �ٿ� �湮�ߴ� ���ڸ� �� �湮�ϰԵǸ�?
				//����
				if(visited[mtx[i][j]]) {
//					System.out.println("1");
					return false;
				}
				//���η� �� �� �� �� �˻��ϰ� �ȴ�.
				visited[mtx[i][j]]=true;
				
			}

		}
		
		//���ι湮�մϴ�~
		for(int i=0;i<N;i++) {
			visited=new boolean[10];
			for(int j=0;j<N;j++) {
				//���� �ٿ� �湮�ߴ� ���ڸ� �� �湮�ϰԵǸ�?
				//����
				if(visited[mtx[j][i]]) {
//					System.out.println("2");

					return false;
				}
				//���η� �� �� �� �� �˻��ϰ� �ȴ�.
				visited[mtx[j][i]]=true;
				
			}

		}
		
		
		//3X3�湮�մϴ�~
		
		visited=new boolean[10];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(visited[mtx[i][j]]) {
//					System.out.println("3");

					return false;
				}
				visited[mtx[i][j]]=true;
			}
		}
		
		visited=new boolean[10];
		for(int i=0;i<3;i++) {
			for(int j=3;j<6;j++) {
				if(visited[mtx[i][j]]) {
//					System.out.println("4");

					return false;
				}
				visited[mtx[i][j]]=true;
			}
		}
		
		visited=new boolean[10];
		for(int i=0;i<3;i++) {
			for(int j=6;j<9;j++) {
				if(visited[mtx[i][j]]) {
//					System.out.println("5");

					return false;
				}
				visited[mtx[i][j]]=true;
			}
		}
		
		visited=new boolean[10];
		for(int i=3;i<6;i++) {
			for(int j=0;j<3;j++) {
				if(visited[mtx[i][j]]) {
//					System.out.println("6");

					return false;
				}
				visited[mtx[i][j]]=true;
			}
		}
		visited=new boolean[10];
		for(int i=3;i<6;i++) {
			for(int j=3;j<6;j++) {
				if(visited[mtx[i][j]]) {
//					System.out.println("7");

					return false;
				}
				visited[mtx[i][j]]=true;
			}
		}
		visited=new boolean[10];
		for(int i=3;i<6;i++) {
			for(int j=6;j<9;j++) {
				if(visited[mtx[i][j]]) {
//					System.out.println("8");

					return false;
				}
				visited[mtx[i][j]]=true;
			}
		}
		visited=new boolean[10];
		for(int i=6;i<9;i++) {
			for(int j=0;j<3;j++) {
				if(visited[mtx[i][j]]) {
//					System.out.println("9");

					
					return false;
				}
				visited[mtx[i][j]]=true;
			}
		}
		visited=new boolean[10];
		for(int i=6;i<9;i++) {
			for(int j=3;j<6;j++) {
				if(visited[mtx[i][j]]) {
//					System.out.println("10");

					return false;
				}
				visited[mtx[i][j]]=true;
			}
		}
		
		visited=new boolean[10];
		for(int i=6;i<9;i++) {
			for(int j=6;j<9;j++) {
				if(visited[mtx[i][j]]) {
//					System.out.println("11");

					return false;
				}
				visited[mtx[i][j]]=true;
			}
		}
		return true;
	}
	
	public static int N=9;
	public static int M;
	public static int ans =0;
	public static int[][] mtx;
	public static boolean[] visited;

	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		M=Integer.parseInt(bf.readLine());
		int a=0;
		while(a++<M) {
			StringTokenizer st;
			mtx=new int[N][N];
			for(int i=0;i<N;i++) {
				st=new StringTokenizer(bf.readLine());
				for(int j=0;j<N;j++) {
					mtx[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			if(check()) {
				sb.append("Case "+a+": CORRECT\n");
				
			}
			else				sb.append("Case "+a+": INCORRECT\n");
			if(a<M) bf.readLine();
		}
	
	
		System.out.println(sb);
	}
}

