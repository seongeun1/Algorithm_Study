package pr;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException {
		  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      StringTokenizer st=new StringTokenizer(bf.readLine());
	      Stack<Character> stack=new Stack<Character>();
	      int N=Integer.parseInt(st.nextToken());
	      
	      for(int i=0;i<N;i++) {
	    	  st=new StringTokenizer(bf.readLine());
	    	  while(st.hasMoreTokens()){
		    	  String s=st.nextToken();
		    	  for(int j=0;j<s.length();j++) {
		    		  stack.push(s.charAt(j));
		    	  }
		    	  while(!stack.empty()) {
		    		  bw.write(stack.pop());
		    	  }
		    	  bw.write(" ");

	    	  }
	    	  bw.write("\n");
	      }
	     
	      bw.flush();
	     
	}
}
