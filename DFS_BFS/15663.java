package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;



public class Main {
	public static void dfs(int idx, String str) {
		if(idx==M) {
			s.add(str.trim());
			return;
		}
		else {
			for(int i=0;i<N;i++) {
				if(visited[i]==0) {
					visited[i]=1;
					dfs(idx+1, str+" "+mtx[i]);
					visited[i]=0;
				}
			}
		}
		
	}
	
	public static int[] mtx;
	public static int[] list;
	public static int[] visited;
	
	public static StringBuffer sb;
	public static Set<String> s=new LinkedHashSet<String>();
	public static int N;
	public static int M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		mtx=new int[N];
		visited=new int[N];
		

		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			mtx[i]=Integer.parseInt(st.nextToken());

		}
		Arrays.sort(mtx);
		dfs(0," ");
		
		for(String str : s) {
			System.out.println(str);
		}
	}
}


