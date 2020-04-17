package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void dfs(int index) {
		if(index==list.length && check2(index)) {
			for(int i=0;i<6;i++) {
				sb.append(list[i]+" ");
			}
			sb.append("\n");
			return ;
		}
		else {
			for(int i=0;i<mtx.length;i++) {
				if(index==0) {
					list[index]=mtx[i];
					dfs(index+1);
				}
				else if(check1(index, mtx[i]) && check2(index)) {
					list[index]=mtx[i];
					dfs(index+1);
				}
				else continue;
			}
			
			
		}

	}
	
	public static boolean check1(int index, int x) {
		for(int i=0;i<index;i++) {
			if(list[i]==x) return false; 
		}
		return true;
	}
	public static boolean check2(int index) {
		for(int i=0;i<index-1;i++) {
			if(list[i]>list[i+1]) return false;
		}
		return true;
	}
	
	public static int[] mtx;
	public static int[] list=new int[6];
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		String s=bf.readLine();
		
		do{
			StringTokenizer st=new StringTokenizer(s);
			int N=Integer.parseInt(st.nextToken());
			mtx=new int[N];

			for(int i=0;i<N;i++) {
				mtx[i]=Integer.parseInt(st.nextToken());
			}
			
			dfs(0);
			sb.append("\n");
			s=bf.readLine();
		}while(s.compareTo("0")!=0);
		
				
		
			
		
		System.out.println(sb);
		
	}
}


