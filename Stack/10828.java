package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		Stack<Integer> stack=new Stack<>();

		int num=Integer.parseInt(bf.readLine());

		for(int i=0;i<num;i++) {
			String[] sp=bf.readLine().split(" ");

			if(sp[0].equals("push")) stack.push(Integer.parseInt(sp[1]));
			else if(sp[0].equals("top")) {
				if(stack.isEmpty()) sb.append(-1+"\n");
				else sb.append(stack.peek()+"\n");
			}
			else if(sp[0].equals("pop")) {
				if(stack.isEmpty()) sb.append(-1+"\n");
				else sb.append(stack.pop()+"\n");
			}
			else if(sp[0].equals("size")) sb.append(stack.size()+"\n");
			else if(sp[0].equals("empty")) {
				if(stack.isEmpty()) sb.append(1+"\n");
				else sb.append(0+"\n");
			}

		}


		System.out.println(sb);


	}

}






