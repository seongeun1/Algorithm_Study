package pr;



import java.io.*;
import java.util.*;


class Point{
	int x;
	int y;

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}



public class Main {	
	public static void find(int x, int y) {
		int nxL=x+1; int nyL=y-1;
		int nxR=x+1; int nyR=y+1;
		//left right ÀúÀå

		while(nxL>=0 && nxL<N && nyL>=0 && nyL<N) {
			left.add(new Point(nxL++, nyL--));
		}

		while(nxR>=0 && nxR<N && nyR>=0 && nyR<N) {
			right.add(new Point(nxR++, nyR++));
		}

		return;
	}
	

	public static void fill(Point up, Point l, Point r, Point down) {
	
		
		
		int[] people=new int[5];
		check=new int[N][N];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				Point p=new Point(i, j);
				if (i-l.x+l.y<=j && (i-r.x)+r.y>=j && -(i-up.x)+up.y<=j&& -(i-down.x)+down.y>=j){
					people[4]+=mtx[i][j];
					check[i][j]=5;
				}
				else if(i<l.x && j<=up.y && check[i][j]==0) {
					
					people[0]+=mtx[i][j];
					check[i][j]=1;
				}
				else if(i<=r.x && j>up.y && check[i][j]==0) {
					people[1]+=mtx[i][j];
					check[i][j]=2;
				}
				else if(i>=l.x && j<down.y && check[i][j]==0) {
					people[2]+=mtx[i][j];
					check[i][j]=3;
				}
				else if(i>r.x && j>=down.y && check[i][j]==0) {
					people[3]+=mtx[i][j];
					check[i][j]=4;
				}
				
			}
		}
	
//		for(int i=0;i<N;i++) {
//			System.out.println(Arrays.toString(check[i]));
//		}
		for(int i=0;i<5;i++) {
			max=Math.max(max, people[i]);
			min=Math.min(min, people[i]);
			
		}
//		System.out.println(Arrays.toString(people));
		ans=Math.min(ans, max-min);
//		System.out.println(ans+" "+max+" "+min);
		return;
	}

	public static ArrayList<Point> left;
	public static ArrayList<Point> right;

	public static int[][] mtx;
	public static int[][] check;
	public static int N;
	public static int ans=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 

		N=Integer.parseInt(bf.readLine());

		mtx=new int[N][N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			for(int j=0;j<N;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
			}
		}


		
		for(int i=0;i<N-2;i++) {
			for(int j=1;j<N-1;j++) {
				left=new ArrayList<>();
				right=new ArrayList<>();
				find(i, j);
				Point p=new Point(i, j);
				for(int l=0;l<left.size();l++) {
					for(int r=0;r<right.size();r++) {
						int a=left.get(l).x;
						int b=left.get(l).y;
						int c=right.get(r).x;
						int d=right.get(r).y;
						
						
						Point down=new Point((a+c-b+d)/2, (-a+c+b+d)/2);
						if(down.x>N-1 || down.y>N-1) continue;
						
						fill(p, left.get(l), right.get(r), down);
					}
				}
			}
		}
		
		
		
		
		
		System.out.println(ans);
	}

}