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
			int n=Integer.parseInt(bf.readLine());
			if(n==0) stack.pop();
			else stack.push(n);
		}

		int sum=0;
		for(int i:stack) {
			sum+=i;
		}
		System.out.println(sum);
	}

}