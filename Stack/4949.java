package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;



public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();

		String s=bf.readLine();
		while(!s.equals(".")) {
			Stack<Character> stack=new Stack<>();
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='(') stack.push('(');
				else if(s.charAt(j)=='[') stack.push('[');
				else if(s.charAt(j)==')') {
					if(stack.isEmpty() || stack.peek()!='(') stack.push(')');
					else stack.pop();
				}
				else if(s.charAt(j)==']') {
					if(stack.isEmpty() || stack.peek()!='[') stack.push(']');
					else stack.pop();
				}
			}
			if(stack.isEmpty()) sb.append("yes\n");
			else sb.append("no\n");
			stack.clear();
			s=bf.readLine();
			
		}
		
		System.out.println(sb);

	}

}



