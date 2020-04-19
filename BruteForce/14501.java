package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main {
	public static void dfs(int day, int sum) {
		
		if(day==n) {
	
			ans=Math.max(ans,  sum);
			return ;
		}
		else if(day>n) return;
		else {
			//상담을 하는 경우
			dfs(day+mtx[day][0], sum+mtx[day][1]);
			dfs(day+1, sum);
		}
		
		
		
	}
	
	//정답을 찾은 경우 : day=n;
	//불가능한 경우 : day>n인 경우 
	
	//다음 경우 호출
	
	/// 상담을 하는 경우 
	/// 상담을 하지 않는 경우 
	
	public static int n;
	public static int m;

	public static int[][] mtx;
	public static int[] list;

	public static int ans=0;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n=Integer.parseInt(bf.readLine());
		mtx=new int[n][2];
		list=new int[n];
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<2;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		
		dfs(0,0);
	
		System.out.println(ans);
	}
}


