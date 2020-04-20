package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;



public class Main {
	public static void dfs(int index, int ans) {

		if(check()) {
			max=Math.max(ans, max);
			min=Math.min(ans, min);
			return;
		}
		else {
			//µ¡¼À
			if(list[0]>0) {
				list[0]--;
				dfs(index+1, ans+mtx[index+1]);
				list[0]++;
				
			}
			//»¬¼À
			if(list[1]>0) {
				list[1]--;
				dfs(index+1, ans-mtx[index+1]);
				list[1]++;
			}
			//°ö¼À
			if(list[2]>0) {
				list[2]--;
				dfs(index+1, ans*mtx[index+1]);
				list[2]++;
			}
			
			if(list[3]>0) {
				list[3]--;
				dfs(index+1, ans/mtx[index+1]);
				list[3]++;
			}
			return;
			
		}
		
	}



	public static boolean check() {
		for(int i=0;i<4;i++) {
			if(list[i]>0) return false; 
		}
		return true;
	}

	public static int n;


	public static int[] mtx;
	public static int[] list=new int[4];
	public static int max=Integer.MIN_VALUE;
	public static int min=Integer.MAX_VALUE;
	public static int ans=0;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n=Integer.parseInt(bf.readLine());
		mtx=new int[n];
		
		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			mtx[i]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<4;i++) {
			list[i]=Integer.parseInt(st.nextToken());
		}


		dfs(0, mtx[0]);

		System.out.println(max+"\n"+min);
	}
}


