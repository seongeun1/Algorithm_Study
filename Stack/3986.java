package pr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {	

	public static int S;
	public static int F;
	public static int M;
	public static int ans =0;


	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		S=Integer.parseInt(bf.readLine());
		while(S-->0) {
			Stack<Character> st=new Stack<Character>();
			String line=bf.readLine();
			
			for(int i=0;i<line.length();i++) {
				if(st.isEmpty()) st.push(line.charAt(i));
				else if(st.peek()==line.charAt(i)) st.pop();
				else st.push(line.charAt(i));
			}
			if(st.isEmpty()) ans++;
		}
	
		System.out.println(ans);
	
		
	}
}

