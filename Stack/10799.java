package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;



public class Main {
	public static void adding(LinkedList<Integer> A, int st, int end) {
		for(int i=st;i<end;i++) {
			A.set(i, A.get(i)+1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();

		Stack<Integer> s=new Stack<Integer>();
		String st=bf.readLine();

		int sum=0;
		int flag=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='('){
				s.push(i);
			}

			else if(st.charAt(i)==')') {
				if(s.peek()-i==-1) {
					s.pop();
					sum+=s.size();
				}
				else {
					s.pop();
					sum+=1;
				}
			}
		}

		System.out.println(sum);



	}
}
