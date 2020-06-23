package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static class Point{
		int x;
		int weight;
		public Point(int x, int weight) {

			this.x = x;
			this.weight = weight;
		}

	}



	public static void bfs(int a, int b) {
		Queue<Point> q=new LinkedList<Point>();
		visit=new boolean[101];
		q.add(new Point(a, 1));
		visit[a]=true;

		while(!q.isEmpty()) {
			Point p=q.poll();
			
			for(int i:ar.get(p.x)) {
				if(visit[i]==true) continue;
				visit[i]=true;

				if(i==b) {
					sans=p.weight;
					break;
				}
				else {
					q.add(new Point(i, p.weight+1));
				}
			}

		}
		return;


	}
	public static int sans=Integer.MAX_VALUE;
	public static int num=0;
	public static int ans=Integer.MAX_VALUE;
	public static int n=0;
	public static ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
	public static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());

		n=Integer.parseInt(st.nextToken());
		for(int i=0;i<=100;i++) {
			ar.add(new ArrayList<Integer>());
		}


		int m=Integer.parseInt(st.nextToken());


		for(int i=0;i<m;i++) {
			st=new StringTokenizer(bf.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());

			ar.get(x).add(y);
			ar.get(y).add(x);
		}




		for(int i=1;i<=n;i++) {
			int sum=0;
			if(ar.get(i).size()==0) continue;
			for(int j=1;j<=n;j++) {
				if(i==j) continue;
				bfs(i, j);
				sum+=sans;
				
			}
			System.out.println(i+" "+sum);
			if(sum<ans) {
				num=i;
				ans=sum;
			}
		}

		System.out.println(num);





	}
}
