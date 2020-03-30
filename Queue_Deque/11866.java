package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		sb.append('<');
		
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int num=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		Queue<Integer> que=new LinkedList<Integer>();
		
		
		for(int i=1;i<=num;i++) {
			que.offer(i);
		}
		
		while(que.size()!=0) {
			for(int i=0;i<k-1;i++) {
				que.offer(que.poll());
			}
			if(que.size()==1) sb.append(que.poll());
			else sb.append(que.poll()+", ");


		}
		sb.append(">");
		System.out.println(sb);
	}

}

