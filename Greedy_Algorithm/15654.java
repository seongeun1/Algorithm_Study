package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void dfs(int n, int k, int index) {
		if(index==k) {
			for(int i=0;i<k;i++) {
				sb.append(list[i]+" ");
				
			}
			sb.append("\n");
			return;
		}
		else {
			for(int i=0;i<n;i++) {
				if(index==0) {
					list[index]=num[i];
					dfs(n, k, index+1);
				}
				else if(index>0 && !check(num[i], index)) {
					list[index]=num[i];
					dfs(n, k, index+1);
				}
				
			}
		}
		

	}
	
	public static boolean check(int n, int index) {
		for(int i=0;i<index;i++) {
			if(list[i]==n) return true;
		}
		return false;
	}

	
	public static int[] list;
	public static int[] num;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());

		list=new int[k];
		num=new int[n];
		st=new StringTokenizer(bf.readLine());
		
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		dfs(n, k, 0);
		System.out.println(sb);

	}
}


