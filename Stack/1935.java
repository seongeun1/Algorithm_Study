package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Double> stack1=new Stack<Double>();
		int N=Integer.parseInt(bf.readLine());
		double[] A=new double[N];
		String s=bf.readLine();
		
		for(int i=0;i<N;i++) {
			A[i]=Double.parseDouble(bf.readLine());
		}
		
		double a=0;
		double b=0;
		for(char ch : s.toCharArray()) {
			if(ch >='A' && ch <='Z') {
				stack1.push(A[(int)(ch-'A')]);
			}
			else {
				double op1=stack1.pop();
				double op2=stack1.pop();
				if(ch=='*') {
					stack1.push(op1*op2);
				}
				else if(ch=='+') {
					stack1.push(op1+op2);
				}
				else if(ch=='-') {
					stack1.push(op2-op1);
				}
				else if(ch=='/') {
					stack1.push(op2/op1);
				}
			}

		}
		
		System.out.println(String.format("%.2f", stack1.peek()));

	}
}
