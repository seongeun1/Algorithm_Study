package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void nbfs(int x, int y) {
		LinkedList<Integer> xq=new LinkedList<Integer>();
		LinkedList<Integer> yq=new LinkedList<Integer>();


		xq.offer(x);
		yq.offer(y);

		nvisit[x][y]=true;
		char ch=mtx[x][y];
		while(!xq.isEmpty()) {
			int xx=xq.poll();
			int yy=yq.poll();


			for(int i=0;i<4;i++) {
				int dx=xx+nx[i];
				int dy=yy+ny[i];
				if(dx>=0 && dx<N && dy>=0 && dy<N && !nvisit[dx][dy]) {
					if(mtx[dx][dy]==ch) {
						nvisit[dx][dy]=true;
						xq.offer(dx);
						yq.offer(dy);
					}
				}
			}

		}

		if(ch=='R') nR++;
		else if(ch=='B') nB++;
		else if(ch=='G') nG++;



		return;
	}

	public static void abbfs(int x, int y) {
		LinkedList<Integer> xq=new LinkedList<Integer>();
		LinkedList<Integer> yq=new LinkedList<Integer>();


		xq.offer(x);
		yq.offer(y);

		abvisit[x][y]=true;
		char ch=mtx[x][y];
		boolean flag=false;
		if(ch=='R' || ch=='G') flag=true;
		while(!xq.isEmpty()) {
			int xx=xq.poll();
			int yy=yq.poll();


			for(int i=0;i<4;i++) {
				int dx=xx+nx[i];
				int dy=yy+ny[i];
				if(dx>=0 && dx<N && dy>=0 && dy<N && !abvisit[dx][dy]) {
					if(!flag && mtx[dx][dy]==ch) {
						abvisit[dx][dy]=true;
						xq.offer(dx);
						yq.offer(dy);
					}
					else if(flag && (mtx[dx][dy]=='R'||mtx[dx][dy]=='G')) {
						abvisit[dx][dy]=true;
						xq.offer(dx);
						yq.offer(dy);
					}
				}
			}

		}

		if(ch=='R'|| ch=='G') aRG++;
		else if(ch=='B') aB++;



		return;
	}

	public static int N;
	public static int[] nx= {-1, 1, 0, 0};
	public static int[] ny= {0, 0, 1, -1};
	public static char[][] mtx;
	public static boolean[][] nvisit;
	public static boolean[][] abvisit;
	public static int nR=0;
	public static int nG=0;
	public static int nB=0;
	public static int aB=0;
	public static int aRG=0;


	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());

		mtx=new char[N][N];
		nvisit=new boolean[N][N];
		abvisit=new boolean[N][N];
		for(int i=0;i<N;i++) {
			String s=bf.readLine();
			for(int j=0;j<N;j++) {
				mtx[i][j]=s.charAt(j);
			}
		}				

		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!nvisit[i][j]) {
					nbfs(i, j);
				}
			}
		}

		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!abvisit[i][j]) {
					abbfs(i, j);
				}
			}
		}
		
		
		sb.append((nR+nG+nB)+" "+(aRG+aB));
		
		
		System.out.println(sb);
		



	}
}
