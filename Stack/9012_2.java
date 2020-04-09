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
	    
	      int N=Integer.parseInt(st.nextToken());
	     
	      for(int i=0;i<N;i++) {
	    	  String s=bf.readLine();
	    	  int count=0;
	    	  for(int j=0;j<s.length();j++) {
	    		  if(s.charAt(j)=='(') count++;
	    		  else count--;
	    		  if(count<0) break;
	    	  }
	    	  System.out.println(count);
	    	  if(count==0) bw.write("YES\n");
	    	  else bw.write("NO\n");
	      }
	      
	      bw.flush();
	}
}
