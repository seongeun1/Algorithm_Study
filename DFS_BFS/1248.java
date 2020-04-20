package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;




public class Main {
	public static void dfs(int index) {
		if(ansnum==n) return;
		if(index==n) {
			for(int i=0;i<n;i++) {
				sb.append(list[i]+" ");
				ansnum++;
			}
			
			return;
		}
		else {
			for(int i=-10;i<11;i++) {
				if(index==0) {
					if(mtx[index][index]=='-' && i<0) {
						list[index]=i;
						dfs(index+1);
					}
					else if(mtx[index][index]=='+' && i>0) {
						list[index]=i;
						dfs(index+1);
					}
					else if(mtx[index][index]=='0' && i==0) {
						list[index]=i;
						dfs(index+1);
					}
				}
				else {
					if(mtx[index][index]=='-' && i<0 && check(index, i)) {
						list[index]=i;
						dfs(index+1);
					}
					else if(mtx[index][index]=='+' && i>0 && check(index, i)) {
						list[index]=i;
						dfs(index+1);
					}
					else if(mtx[index][index]=='0' && i==0 && check(index, i)) {
						list[index]=i;
						dfs(index+1);
					}
				}

			}
			return;
		}
	}

	public static int n;


	public static boolean check(int j, int x) {

		for(int i=0;i<j;i++) {
			int s=0;
			for(int idx=i;idx<j;idx++) {
				s+=list[idx];
			}
			s+=x;
			if(mtx[i][j]=='0' && s!=0) return false;
			else if(mtx[i][j]=='-' && s>=0) return false;
			else if(mtx[i][j]=='+' && s<=0) return false;
		}
		return true;
	}

	public static char[][] mtx;
	public static int[] list;

	public static int ansnum=0;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));


		n=Integer.parseInt(bf.readLine());
		mtx=new char[n][n];
		list=new int[n];
	
		String st=bf.readLine();

		int loc=0;

		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				mtx[i][j]=st.charAt(loc++);
			}
		}

		dfs(0);
		System.out.println(sb);
	}
}


