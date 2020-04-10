package pr;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main {
	public static void adding(LinkedList<Integer> A, int st, int end) {
		for(int i=st;i<end;i++) {
			A.set(i, A.get(i)+1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuffer sb=new StringBuffer();

		Stack<Integer> stack1=new Stack<Integer>();
		//Stack<Integer> stack2=new Stack<Integer>();
		int N=Integer.parseInt(bf.readLine());
		int[] list=new int[N+1];
		int[] nge=new int[N+1];

		StringTokenizer st=new StringTokenizer(bf.readLine());

		for(int i=0;i<N;i++) {
			list[i+1]=Integer.parseInt(st.nextToken());
		}

		for(int i=1;i<=N;i++) {
			if(stack1.isEmpty()) stack1.push(i);
			
			while(!stack1.empty() && list[stack1.peek()]<list[i]) {
				nge[stack1.pop()]=list[i];

			}
			stack1.push(i);
			
			System.out.println(stack1);
		}
		
		while(!stack1.empty()) {
			nge[stack1.pop()]=-1;
		}

		for(int i=1;i<nge.length;i++) {
			bw.write(nge[i]+" ");
		}
		bw.flush();
	}
}
