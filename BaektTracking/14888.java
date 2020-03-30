package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;




public class Main {
	public static void dfs(int[] list, int[] cal, int index, int result) {
		if(index==list.length-1) {
			min=Math.min(result, min);
			max=Math.max(result,  max);
		}
		else {
			if(cal[0]>0) {
				cal[0]--;
				dfs(list, cal, index+1, result+list[index+1]);
				cal[0]++;
			}
			if(cal[1]>0) {
				cal[1]--;
				dfs(list, cal, index+1, result-list[index+1]);
				cal[1]++;
			}
			if(cal[2]>0) {
				cal[2]--;
				dfs(list, cal, index+1, result*list[index+1]);
				cal[2]++;
			}
			if(cal[3]>0) {
				cal[3]--;
				dfs(list, cal, index+1, result/list[index+1]);
				cal[3]++;
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

		int list[]=new int[N];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			list[i]=Integer.parseInt(st.nextToken());
		}

		int cal[]=new int[4];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<4;i++) {
			cal[i]=Integer.parseInt(st.nextToken());
		}


		dfs(list, cal, 0, list[0]);
		System.out.println(max);
		System.out.println(min);



	}

}
