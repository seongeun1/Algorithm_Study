package pr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class Main {
	public static void dfs(int[] list, int index,StringBuilder sb, int num) {
		if(index==list.length) {
			for(int i=0;i<list.length;i++) {
				sb.append(list[i]+" ");
			}
			sb.append("\n");
		}
		else {
			for(int i=num;i<=N;i++) {
				if(!contains(list, index, i)) {
					list[index]=i;
					dfs(list, index+1,sb, i+1);	
				}
			}
		}
	}
	public static boolean contains(int[] list, int index, int num) {
		for(int i=0;i<index;i++) {
			if(list[i]==num) return true;
		}
		return false;
	}
	public static int N=Integer.MAX_VALUE;
	public static int M=Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine(), " ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		int list[]=new int[M];
		StringBuilder sb= new StringBuilder();
		dfs(list, 0,sb, 1);
		System.out.println(sb);
		
		

	}

}
