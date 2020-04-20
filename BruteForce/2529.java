package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;



public class Main {
	public static void dfs(int index, String num) {
		if(index==n+1) {

			link.add(num);
			return;
		}
		else {
			for(int i=0;i<=9;i++) {
				if(list[i]==1) continue;
				if(index==0) {
					list[i]=1;
					dfs(index+1,num+String.valueOf(i));
					list[i]=0;
		
				}
				else if(index>0 && check(num.charAt(index-1), (char) (i+'0'), mtx[index-1])) {
					list[i]=1;
					dfs(index+1,num+Integer.toString(i));
					list[i]=0;
				}
			}
			
		}
	}



	public static boolean check(char a, char b, char c) {
		if(c=='<') {
			if(a>b) return false;
		}
		else if(c=='>') {
			if(a<b) return false;
		}
		return true;
		
	}

	public static int n;


	public static char[] mtx;
	public static int[] list;

	public static LinkedList<String> link=new LinkedList<String>();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n=Integer.parseInt(bf.readLine());
		mtx=new char[n];
		list=new int[10];
		
		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			mtx[i]=(st.nextToken()).charAt(0);
		}



		dfs(0,"");

		System.out.println(link.get(0)+"\n"+link.get(link.size()-1));
	}
}


