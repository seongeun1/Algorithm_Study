package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


	
	
	public static void dfs(int a, int b, int weight) {
		if(ar.get(a).contains(b)) {
			ans=weight;
			flag=true;
			return;
		}
		else {
			for(int i : ar.get(a)) {
				if(flag==false && !visit[i])	{
					visit[i]=true;
					dfs(i, b, weight+1);
				}
			}
			return;
		}
		
		
		
	}
	public static int ans=-1;
	public static boolean flag=false;
	public static ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
	public static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		for(int i=0;i<=n;i++) {
			ar.add(new ArrayList<Integer>());
		}
		visit=new boolean[n+1];
		st=new StringTokenizer(bf.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(bf.readLine());
		n=Integer.parseInt(st.nextToken());
		
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(bf.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			
			ar.get(x).add(y);
			ar.get(y).add(x);
		}
		
		dfs(b, a, 1);
		
		System.out.println(ans);
		
		
		
		

	}
}
