package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


class Node implements Comparable<Node>{
	int index, distance;

	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}
	public int compareTo(Node n) {
		return this.distance-n.distance;
	}
	@Override
	public String toString() {
		return "Node [index=" + index + ", distance=" + distance + "]";
	}
	
}

public class Main {



	

	public static int N;
	public static int E;
	public static int O;
	public static int[] dist;
	public static ArrayList<ArrayList<Node>> ar;

	public static int INF=987654321;

	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		E=Integer.parseInt(st.nextToken());
		
		O=Integer.parseInt(bf.readLine());
		
		
		dist=new int[N+1];
		Arrays.fill(dist, INF);
		
		
		ar=new ArrayList<>();
		for(int i=0;i<N+1;i++) {
			ar.add(i, new ArrayList<Node>());
		}
		
		for(int i=0;i<E;i++) {
			st=new StringTokenizer(bf.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			
			ar.get(u).add(new Node(v, w));

		}
		
	
		dijkstra(O);
		
		for(int i=1;i<N+1;i++) {
			if(dist[i]!=INF) sb.append(dist[i]+"\n");
			else sb.append("INF"+"\n");
		}
		
		System.out.println(sb);

	}
	
	public static void dijkstra(int start) {
		boolean[] visited=new boolean[N+1];
		PriorityQueue<Node> pq=new PriorityQueue<Node>();
		
		dist[start]=0;
		pq.add(new Node(start, 0));
		
		while(!pq.isEmpty()) {
			int now=pq.poll().index;
			
			if(visited[now]) continue;
			visited[now]=true;

			for(Node node : ar.get(now)) {
				if(dist[node.index]>dist[now]+node.distance) {
							
					dist[node.index]= dist[now]+node.distance;
					pq.add(new Node(node.index, dist[node.index]));					
				}

			}
			
			
		}
		
	}
	
}