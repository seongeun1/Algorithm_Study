package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;




public class Main {
	public static void dfs(int[][] list, int people[], int index, int hold) {
		if(index==N/2) {
			int result=0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(people[i]==0 && people[j]==0) result+=list[i][j];
					else if(people[i]==1 && people[j]==1) result-=list[i][j];
					else;
				}
			}
			min=Math.min(min,  Math.abs(result));
		}
		else {
			for(int i=hold;i<N;i++) {
				people[i]=1;
				dfs(list, people, index+1,i+1);
				people[i]=0;	

			}


		}
	}
	public static int N=Integer.MAX_VALUE;
	public static int min=Integer.MAX_VALUE;
	public static int max=Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine(), " ");
		N=Integer.parseInt(st.nextToken());

		int list[][]=new int[N][N];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<N;j++) {
				list[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int people[]=new int[N];

		dfs(list, people, 0, 0);
		System.out.println(min);
	}

}


