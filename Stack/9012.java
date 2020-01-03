package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();


		int num=Integer.parseInt(bf.readLine());

		for(int i=0;i<num;i++) {
			String s=bf.readLine();
			Stack<Character> stack=new Stack<>();

			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='(') stack.push('(');
				else {
					
					if(stack.isEmpty() || stack.peek()!='(') stack.push(')');
					else stack.pop();
				}

			}
			if(stack.isEmpty()) sb.append("YES\n");
			else sb.append("NO\n");

		}

		System.out.println(sb);
	}

}