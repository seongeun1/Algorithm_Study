package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;





public class Main {
	public static void dfs(int index, int sans, int size, String a) {
		if(size>0 && index==n && sans==S) {
				ans++; 
			
		}
		else if(index==n) return;
		else {
			dfs(index+1, sans, size, a);
			dfs(index+1, sans+mtx[index], size+1, a+Integer.toString(mtx[index])+" ");
			
		}

		
	}

	public static int n;
	public static int S;

	

	public static int[] mtx;
	
	public static int ans=0;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());

		n=Integer.parseInt(st.nextToken());
		S=Integer.parseInt(st.nextToken());
		mtx=new int[n];
		
		st=new StringTokenizer(bf.readLine());
		
		for(int i=0;i<n;i++) {
			mtx[i]=Integer.parseInt(st.nextToken());
		}
		dfs(0, 0, 0, "");
		System.out.println(ans);
		
	}
}


