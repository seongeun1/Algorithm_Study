package pr;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		int num=Integer.parseInt(bf.readLine());
		Deque<Integer> deq =new ArrayDeque<Integer>();
		for(int i=0;i<num;i++) {
			String[] s=bf.readLine().split(" ");
			if(s[0].equals("push_front")) deq.push(Integer.parseInt(s[1]));
			else if(s[0].equals("push_back")) deq.offer(Integer.parseInt(s[1]));
			else if(s[0].equals("pop_front")) {
				if(deq.isEmpty()) sb.append(-1+"\n");
				else sb.append(deq.pop()+"\n");
			}
			else if(s[0].equals("pop_back")) {
				if(deq.isEmpty()) sb.append(-1+"\n");
				else {
					for(int j=0;j<deq.size()-1;j++) {
						deq.offer(deq.poll());
					}
					sb.append(deq.poll()+"\n");
				}
			}
			
			else if(s[0].equals("size")) sb.append(deq.size()+"\n");
			else if(s[0].equals("front")) {
				if(deq.isEmpty()) sb.append(-1+"\n");
				else sb.append(deq.peek()+"\n");
				}
			else if(s[0].equals("back")) {
				if(deq.isEmpty()) sb.append(-1+"\n");
				else {
					for(int j=0;j<deq.size()-1;j++) {
						deq.offer(deq.poll());
					}
					sb.append(deq.peek()+"\n");
					deq.offer(deq.poll());
				}
			
			}
			else if(s[0].equals("empty")) {
				if(deq.isEmpty()) sb.append(1+"\n");
				else sb.append(0+"\n");
			}
			
		}
		System.out.println(sb);

	}

}




