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
	      StringTokenizer st;
	      Stack<Character> s1=new Stack<Character>();
	      Stack<Character> s2=new Stack<Character>();
	      String s=bf.readLine();
	      int N=Integer.parseInt(bf.readLine());
	
	      
	      for(int i=0;i<s.length();i++) {
	    	  s1.push(s.charAt(i));
	      }
	      
	      for(int i=0;i<N;i++) {
	    	  st=new StringTokenizer(bf.readLine());
	    	  char c=st.nextToken().charAt(0);
	    	  if(c=='P') {
	    		  s1.push(st.nextToken().charAt(0));
	    		 
	    	  }
	    	  else if(c=='L') {
	    		  if(!s1.empty()) s2.push(s1.pop());
	    	  }
	    	  else if(c=='D') {
	    		  if(!s2.empty()) s1.push(s2.pop());
	    	  }
	    	  else if(c=='B') {
	    		  if(!s1.empty()) s1.pop();
	  
	    	  }
	    	  
	      }
	     for(int i=0;i<s1.size();i++) {
	    	 bw.write(s1.get(i));
	     }
	     
	     for(int i=s2.size()-1;i>=0;i--) {
	    	 bw.write(s2.get(i));
	     }

	     bw.flush();
	      
	     
	      
	    
	}
}
