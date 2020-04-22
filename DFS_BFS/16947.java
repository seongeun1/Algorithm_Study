package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;




public class Main {
	
	public static void dfs(int arrival,int pst, int loc, int dist) {
		
		if(arrival==loc) {
			ans=Math.min(ans, 0);
			return;
		}
		else if(loc>=0 && arrival!=loc && check[loc]!=0) {
			ans=Math.min(ans, check[loc]-1);
			return;
		}
		else if(loc==-1 || check[loc]==0){
			if(loc==-1) loc=arrival;
			check[loc]=dist;
			for(int station:arr[loc]) {
				if(station==pst) continue;
				dfs(arrival, loc, station, dist+1);
			}
			return;
		}
		
		
		
	}
	
	public static int[] check;
	public static ArrayList<Integer>[] arr;
	public static StringBuffer sb=new StringBuffer();
	public static int ans =Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N=Integer.parseInt(bf.readLine());
		arr= (ArrayList<Integer>[]) new ArrayList[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=new ArrayList<Integer>();
		}
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			int x=Integer.parseInt(st.nextToken())-1;
			int y=Integer.parseInt(st.nextToken())-1;
			arr[x].add(y);
			arr[y].add(x);
			Collections.sort(arr[x]);
			Collections.sort(arr[y]);
		}
	
		
		for(int i=0;i<N;i++) {
			check=new int[N];
			ans =Integer.MAX_VALUE;
			dfs(i, -1, -1, 1);
			sb.append(ans+" ");
		}
		System.out.println(sb);

		
	}
}


