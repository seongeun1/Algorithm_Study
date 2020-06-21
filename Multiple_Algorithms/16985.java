package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static class Point{
		int z;
		int x;
		int y;
		int p;
		public Point(int z, int x, int y, int p) {
			super();
			this.z = z;
			this.x = x;
			this.y = y;
			this.p = p;
		}


	}

	public static void rotate(int[][] m) {
		int[][] temp=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				temp[i][j]=m[5-j-1][i];
			}
		}

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				m[i][j]=temp[i][j];
			}
		}

	}

	public static boolean check1(int x, int y, int z) {
		if(x<0||y<0||z<0||x>4||y>4||z>4) return false;
		return true;
	}
	public static boolean check2(int x, int idx) {
		for(int i=0;i<idx;i++) {
			if(list[i]==x) return false;	
		}
		return true;
	}
	public static void findway(){	
		LinkedList<Point> pq=new LinkedList<>();
		pq.push(new Point(0, 0, 0, 0));
		int[][][] temp=new int[5][5][5];

		while(!pq.isEmpty()) {
			Point p=pq.poll();
		
			if(p.z==4 && p.x==4 && p.y==4) {
				ans=Math.min(ans, p.p);
				break;
			}
			if(temp[p.z][p.x][p.y]==0) {
				temp[p.z][p.x][p.y]=1;
				
				for(int i=0;i<6;i++) {
					int z=p.z+dz[i];
					int x=p.x+dx[i];
					int y=p.y+dy[i];


					if(check1(z, x, y) && mtx[z][x][y]==1 && temp[z][x][y]==0) {
						pq.add(new Point(z, x, y, p.p+1));

					}

				}
			}


		}
	}

	public static void printmtx() {
		for(int idx=0;idx<5;idx++) {

			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					System.out.print(mtx[idx][i][j]+" ");
				}
				System.out.println("");
			}


		}
		System.out.println("=============================");

	}
	public static void doit() {
		for(int one=0;one<4;one++) {
			rotate(mtx[0]);
			for(int two=0;two<4;two++) {
				rotate(mtx[1]);
				for(int three=0;three<4;three++) {
					rotate(mtx[2]);
					for(int four=0;four<4;four++) {
						rotate(mtx[3]);
						for(int five=0;five<4;five++) {
							rotate(mtx[4]);
							if(mtx[0][0][0]==1 && mtx[4][4][4]==1) {

								findway();
							}

						}
					}
				}
			}
		}		
	}

	public static void nCr(int index) {
		if(index==5) {
			int z=0;
			for(int idx=0;idx<5;idx++, z++) {
				int newz=list[idx];
				for(int i=0;i<5;i++) {
					for(int j=0;j<5;j++) {
						mtx[z][i][j]=mtx2[newz][i][j];
					}
				}

			}
			doit();
			return;
		}
		else {
			for(int i=0;i<5;i++) {
				if(check2(i, index)) {
					list[index]=i;
					nCr(index+1);
				}
			}
		}
	}

	public static int[] list=new int[5];
	public static int[] dz= {0, 0, 0, 0, -1, 1};
	public static int[] dx= {1, 0, -1, 0, 0, 0};
	public static int[] dy= {0, 1, 0, -1, 0, 0};

	public static int ansF=0;
	public static int ans=Integer.MAX_VALUE;
	public static int[][][] mtx=new int[5][5][5];
	public static int[][][] mtx2=new int[5][5][5];
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=null;

		for(int z=0;z<5;z++) {
			for(int x=0;x<5;x++) {
				st=new StringTokenizer(bf.readLine());
				for(int y=0;y<5;y++) {
					mtx2[z][x][y]=Integer.parseInt(st.nextToken());
				}
			}
		}

		nCr(0);

		System.out.println((ans==Integer.MAX_VALUE)? -1 : ans);
	}
}
