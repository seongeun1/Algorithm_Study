package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int[][] rrotate(int[][] mtx, int N, int M) {
	

		tmp=new int[M+1][N+1];
		ansN=M;
		ansM=N;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				tmp[j][N-i+1]=mtx[i][j];
			}
		}

		
		return tmp;
	}
	
	public static int[][]  lrotate(int[][] mtx, int N, int M) {
		tmp=new int[M+1][N+1];
		ansN=M;
		ansM=N;

		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				tmp[M+1-j][i]=mtx[i][j];
			}
		}
		return tmp;
	}
	
	public static int[][] rlreverse(int[][] mtx, int N, int M) {
		tmp=new int[N+1][M+1];
		ansN=N;
		ansM=M;

		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				tmp[i][j]=mtx[i][M-j+1];
			}
		}
		return tmp;
	}
	
	public static int[][]  udreverse(int[][] mtx,int N, int M) {
		tmp=new int[N+1][M+1];
		ansN=N;
		ansM=M;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				tmp[i][j]=mtx[N-i+1][j];
			}
		}
		return tmp;
	}
	
	public static int[][]  move1(int[][] mtx,int N, int M) {
		tmp=new int[N+1][M+1];
		
		for(int i=1;i<=ansN;i++) {
			for(int j=1;j<=ansM;j++) {
				if(i<=N/2 && j<=M/2) { //1번을 2번으로
					tmp[i][j+M/2]=mtx[i][j];
				}
				else if(i<=N/2 && j>M/2) { //2번을 3번으로
					tmp[i+N/2][j]=mtx[i][j];
				}
				else if(i>N/2 && j<=M/2) { //4번을 1번으로
					tmp[i-N/2][j]=mtx[i][j];
				}
				else if(i>N/2 && j>M/2) { //3번을 4번으로
					tmp[i][j-M/2]=mtx[i][j];
				}
			}
		}
		ansN=N;
		ansM=M;
		return tmp;
	}
	
	public static int[][]  move2(int[][] mtx,int N, int M) {
		tmp=new int[N+1][M+1];
		ansN=N;
		ansM=M;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				if(i<=N/2 && j<=M/2) { //1번을 4번으로
					tmp[i+N/2][j]=mtx[i][j];
				}
				else if(i<=N/2 && j>M/2) { //2번을 1번으로
					tmp[i][j-M/2]=mtx[i][j];
				}
				else if(i>N/2 && j<=M/2) { //4번을 3번으로
					tmp[i][j+M/2]=mtx[i][j];
				}
				else if(i>N/2 && j>M/2) { //3번을 2번으로
					tmp[i-N/2][j]=mtx[i][j];
				}
			}
		}
		return tmp;
	}
	
	public static void copy(int[][] tmp) {
		for(int i=1;i<=ansN;i++) {
			for(int j=1;j<=ansM;j++) {
				ans[i][j]=tmp[i][j];
			}
		}
	}
	
	
	static int N;
	static int M;
	static int R;
	static int K;
	static int ansN;
	static int ansM;
	static int[][] mtx;
	static int[][] tmp;
	static int[][] ans=new int[101][101];
  	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		R=Integer.parseInt(st.nextToken());
		mtx=new int[N+1][M+1];
		ansN=N;
		ansM=M;
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=1;j<=M;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
				ans[i][j]=mtx[i][j];
			}
		}
		
		
		
		st=new StringTokenizer(bf.readLine());
		while(R-->0) {
			K=Integer.parseInt(st.nextToken());
			if(K==5) {
				copy(move1(ans, ansN, ansM));
				
			}
			else if(K==6) {
				copy(move2(ans, ansN, ansM));
				
			}
			else if(K==1) {
				copy(udreverse(ans, ansN, ansM));
				
			}
			else if(K==2) {
				copy(rlreverse(ans, ansN, ansM));
				
			}
			else if(K==3) {
				copy(rrotate(ans, ansN, ansM));
				
			}
			else if(K==4) {
				copy(lrotate(ans, ansN, ansM));
				
			}
			
		}
		for(int i=1;i<=ansN;i++) {
			for(int j=1;j<=ansM;j++) {
				sb.append(ans[i][j]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);

	}
}
