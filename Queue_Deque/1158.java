package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(bf.readLine());
		Queue<Integer> que=new LinkedList<Integer>();

		sb.append("<");
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());

		for(int i=1;i<=N;i++) {
			que.offer(i);
		}

		while(!que.isEmpty()) {

			for(int j=1;j<K;j++) {
				que.offer(que.poll());
			}

			int a=que.poll();
			sb.append(a);
			if(!que.isEmpty()) sb.append(", ");
		}

		sb.append(">");
		System.out.println(sb);
	}
}
