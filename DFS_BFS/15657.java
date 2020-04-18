package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void dfs(int index) {
		if(index==M) {
			for(int i=0;i<M;i++) {
				sb.append(list[i]+" ");
			}
			sb.append("\n");
		}
		
		else {
			for(int i=0;i<N;i++) {
				if(index==0) {
					list[index]=mtx[i];
					dfs(index+1);
				}
				else if(index!=0 && list[index-1]>mtx[i]) {
					continue;
				}
				
				else {
					
					list[index]=mtx[i];
					dfs(index+1);
				}

			}
		}
	}
	
	public static boolean check(int index, int x) {
		for(int i=0;i<index;i++) {
			if(list[i]==x) return false;
		}
		return true;
	}

	public static int[] mtx;
	public static int[] list;
	public static StringBuffer sb=new StringBuffer();
	public static int N;
	public static int M;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		mtx=new int[N];
		list=new int[M];
		

		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			mtx[i]=Integer.parseInt(st.nextToken());

		}
		Arrays.sort(mtx);
		dfs(0);


	
		System.out.println(sb);

	}
}


