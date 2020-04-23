package pr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	
}


public class Main {	
	public static void dfs(int selected, int idx) {
		if(selected==M) {
			int sans=0;
			for(int i=0;i<home.size();i++) {
				int temp=Integer.MAX_VALUE;
				for(int j=0;j<select.size();j++) {
					temp=Math.min(temp, Math.abs(home.get(i).x-select.get(j).x)+Math.abs(select.get(j).y-home.get(i).y));
				}
				sans+=temp;
				
			}
		
			ans=Math.min(ans, sans);
			return;			
		}
		
		else if(selected>M || idx>=chicken.size()) {
			return;
		}
		else {
			//idx번째 치킨집을 뽑는다.
			select.add(chicken.get(idx));
			dfs(selected+1, idx+1);
			
			//idx번째 치킨집은 뽑지않는다.
			select.remove(select.size()-1);
			dfs(selected, idx+1);
			
		}
		
		
	}
	public static int N;
	public static int M;
	public static ArrayList<Point> home=new ArrayList<>();
	public static ArrayList<Point> chicken=new ArrayList<>();
	public static ArrayList<Point> select=new ArrayList<>();
	public static int ans =Integer.MAX_VALUE;
	public static int[][] mtx;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		mtx=new int[N][N];
		
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<N;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
				Point p=new Point(i, j);
				if(mtx[i][j]==1) {
					home.add(p);
				}
				else if(mtx[i][j]==2) {
					chicken.add(p);
				}
			}
		}
		
		dfs(0, 0);
		
		System.out.println(ans);
		
		
	}
}
