package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main {
	public static void dfs(int idx) {
		
		if(idx==n && check(idx) && check2(idx)) {
			for(int i=0;i<n;i++) {
				sb.append(list[i]);
			}
			sb.append("\n");
			
		}
		else if(idx==n && !check(idx) && check2(idx)) return;
		else if(idx==n && !check2(idx) && check(idx)) return;
		else {
			for(int i=0;i<m;i++) {
				if(idx>0 && list[idx-1]>=mtx[i]) continue;
				
					list[idx]=mtx[i];
					dfs(idx+1);
				
			}
		}
	}
	
	public static boolean check(int n) {
		int a=0;
		for(int i=0;i<n;i++) {
			if(list[i]=='a' || list[i]=='e' || list[i]=='i' || list[i]=='o' ||list[i]=='u') a++;
		
		}
		if(a>=1) return true;
		else return false;
	}
	public static boolean check2(int n) {
		int a=0;
		for(int i=0;i<n;i++) {
			if(list[i]!='a' || list[i]!='e' || list[i]!='i' || list[i]!='o' ||list[i]!='u') a++;
		}
		if(a>=2) return true;
		else return false;
	}


	public static int n;
	public static int m;

	public static char[] mtx;
	public static char[] list;

	public static int ans;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		mtx=new char[m];
		list=new char[n];
		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<m;i++) {
			mtx[i]=st.nextToken().charAt(0);
		
		}
		
		Arrays.sort(mtx);
		
		
		dfs(0);
		System.out.println(sb);
	}
}


