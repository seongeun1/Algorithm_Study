package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void dfs(int index) {
		if(index==mtx.length) {
			for(int i=0;i<index;i++) {
				sb.append(list[i]+" ");
			}
			sb.append("\n");
		}
		
		else {
			for(int i=1;i<=list.length;i++) {
				if(index==0) {
					list[index]=i;
					dfs(index+1);
				}
				else if(check(index, i)) {
					list[index]=i;
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
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		mtx=new int[N];
		list=new int[N];
		dfs(0);
		System.out.println(sb);
		
		
	}
}


