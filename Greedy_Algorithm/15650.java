package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void dfs(int n, int k, int index, int[] list) {
		
		if(index==list.length) {
			for(int i=0;i<k;i++) {
				sb.append(list[i]+" ");
			}
			sb.append("\n");
		}
		
		else {
			for(int i=1;i<=n;i++) {
				if(index==0) {
					
					list[index]=i;
					dfs(n, k, index+1, list);
				}
				else if(index>0 && list[index-1]<i) {
					
					list[index]=i;
					dfs(n, k, index+1, list);
				}

				list[index]=0;
			}
		}
		
	}
	

	
	public static int[] list;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
	
		list=new int[k];
		
		dfs(n, k, 0, list);
		System.out.println(sb);
		
	}
}


