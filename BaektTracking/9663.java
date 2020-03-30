package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class Main {
	public static void dfs(int[] list, int index, int[] count) {
		if(index==list.length) {
			count[0]=count[0]+1;		
			}
		else {
			for(int col=0;col<list.length;col++) {
				list[index]=col;
				if(check(list, index)) dfs(list, index+1, count);
				else continue;
			}
		}

	}
	public static boolean check(int[] list, int index) {
		for(int i=0;i<index;i++) {
			if(list[i]==list[index] || Math.abs(index-i)==Math.abs(list[index]-list[i]))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String s= null;
		StringBuilder sb=new StringBuilder();

		try {
			s=bf.readLine();
		}catch (IOException e) {};
		StringTokenizer st= new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());

		int list[]=new int[N];
		int count[]=new int[1];
		count[0]=0;
		dfs(list, 0, count);
		System.out.println(count[0]);

	}

}
