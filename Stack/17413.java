package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();

		Stack<Character> s=new Stack<Character>();
		
		String st=bf.readLine();
		int i=0;
		while(i<st.length()) {
			if(st.charAt(i)=='<') {
				sb.append(st.charAt(i++));
				while(st.charAt(i)!='>') {
					sb.append(st.charAt(i++));
				}
				sb.append(st.charAt(i++));
			}
			
			else {
				do {
			
				s.push(st.charAt(i++));
					
				}while( i<st.length() && st.charAt(i)!=' ' && st.charAt(i)!='<');
			
				while(!s.empty()) {
					sb.append(s.pop());
					if(!s.empty() && s.peek()==' ')s.pop();
				}
				
				if(i<st.length() && st.charAt(i)!='<') sb.append(' ');

				
				
			}
			
			
		}
	
		
		System.out.println(sb);
	}
}
