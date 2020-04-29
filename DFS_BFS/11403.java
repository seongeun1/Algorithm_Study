package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
public class Main {
	public static void bfs(int index) {
		LinkedList<Integer> iq=new LinkedList<>();
		int[] visited=new int[N];

		iq.offer(index);
		while(!iq.isEmpty()) {
			int q=iq.poll();
			visited[q]=1;
			for(int i=0;i<N;i++) {
				if(mtx[q][i]==1 && visited[i]==0) {
					check[index][i]=1;
					visited[i]=1;
					iq.offer(i);
				}
				else if(mtx[q][i]==1&& i==index) {
					check[index][i]=1;
					visited[i]=1;
					iq.offer(i);
				}
			}
			
		
		}
	}
	

	
	public static int[][]mtx;
	public static int[][]check;
	public static int N;
	public static int M;

	public static ArrayList<Point> ar=new ArrayList<>();


	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		mtx=new int[N][N];
		check=new int[N][N];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<N;j++) {
				int a=Integer.parseInt(st.nextToken());
				mtx[i][j]=a;
			}
		}
		
	
		for(int i=0;i<N;i++) {
			bfs(i);
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(check[i][j]+" ");
			}
			sb.append("\n");
		}
		
		
		System.out.println(sb);

	}
}