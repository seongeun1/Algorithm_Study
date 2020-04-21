package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;





public class Main {
	public static void dfs(int index, int type) {
			list[index]=type;
			for(int i : mtx[index]) {
				if(list[i]==0) {
					dfs(i, 3-type);
				}
			}
	}
	
	


	public static int n;
	public static int m;
	

	
	public static int[] list;
	public static ArrayList<Integer>[] mtx ;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N=Integer.parseInt(bf.readLine());
		while((N--)>0) {
			st=new StringTokenizer(bf.readLine());
			n=Integer.parseInt(st.nextToken());
			m=Integer.parseInt(st.nextToken());
		
			mtx= (ArrayList<Integer>[]) new ArrayList[n];
			list=new int[n];

			for(int i=0;i<n;i++) {
				mtx[i]=new ArrayList<Integer>();
			}
			for(int i=0;i<m;i++) {
				st=new StringTokenizer(bf.readLine());
					int a=Integer.parseInt(st.nextToken())-1;
					int b=Integer.parseInt(st.nextToken())-1;
					mtx[a].add(b);
					mtx[b].add(a);
				
			}
			
			for(int i=0;i<n;i++) {
				if(list[i]==0) {
					dfs(i, 1);
				}
			}
			
			boolean flag=true;
			for(int i=0;i<n;i++) {
				for(int j : mtx[i]) {
					if(list[i]==list[j]) flag=false;
				}
			}
			if(!flag) sb.append("NO\n");
			else sb.append("YES\n");
			
		}
		
		
		System.out.println(sb);
	}
}


