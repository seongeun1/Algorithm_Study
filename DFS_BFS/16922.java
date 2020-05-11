package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void bfs(int size, int idx, int sans) {
		if(size==N) {
			if(!ans.contains(sans)) ans.add(sans);
			
			return;
		}

		for(int i=idx;i<4;i++) {
			check[size]=mtx[i];
			bfs(size+1, i, sans+mtx[i]);
			check[size]=0;
		}



		return;
	}
	static int N;
	static int[] check;
	static int[] mtx= {1, 5, 10, 50};
	static ArrayList<Integer> ar=new ArrayList<Integer>();
	static ArrayList<Integer> ans=new ArrayList<Integer>();

	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine(), " ");
		N=Integer.parseInt(st.nextToken());
		visited=new boolean[50*20+1];
		check=new int[N];
		bfs(0,0,0);

		System.out.println(ans.size());

	}
}