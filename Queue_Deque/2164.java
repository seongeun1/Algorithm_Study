package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	//	StringBuffer sb=new StringBuffer();
		int num=Integer.parseInt(bf.readLine());
		Queue<Integer> que=new LinkedList<Integer>();
		
		
		for(int i=1;i<=num;i++) {
			que.offer(i);
		}
		
		while(que.size()!=1) {
			que.poll();
			que.offer(que.poll());
		}
		
		System.out.println(que.poll());
	}

}
