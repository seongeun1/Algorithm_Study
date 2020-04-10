package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;



public class Main {

	public static int p(char A) {
		if(A=='+' || A=='-') return 1;
		else if(A=='(') return 0;
		else return 2;
		

	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack1=new Stack<Character>();
		String st=bf.readLine();
		String s="";



		for(char ch : st.toCharArray()) {
			if(ch>='A' && ch<='Z') {
				s=s+ch;
			}
			else {
				if(ch=='(') {
					stack1.push(ch);
				}
				else if(ch==')') {
					while(!stack1.empty() &&stack1.peek()!='(') {
						s=s+stack1.pop();
					}
					stack1.pop();
				}
				else {
					while(!stack1.empty() && p(ch)<=p(stack1.peek())) {
						s=s+stack1.pop();
					}
					stack1.push(ch);
				}
			}
		}
		
		while(!stack1.empty()) {
			s=s+stack1.pop();
		}
		
		System.out.println(s);



	}
}
