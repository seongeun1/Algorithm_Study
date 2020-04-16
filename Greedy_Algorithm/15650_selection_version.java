package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void dfs(int num, int selected, int n, int k) {
		if(selected==k) {
			for(int i=0;i<k;i++) {
				sb.append(list[i]+" ");

			}

			sb.append("\n");


		}

		if(num>n) return;
		if(selected>=k) return;
		list[selected]=num;
		dfs(num+1, selected+1, n, k);
		
		list[selected]=0;
		dfs(num+1, selected,n,k);
		


	}



	public static int[] list;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());

		list=new int[k];

		dfs(1, 0, n, k);
		System.out.println(sb);

	}
}


