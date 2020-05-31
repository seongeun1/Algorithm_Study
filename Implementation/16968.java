package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


	static ArrayList<Integer> ar=new ArrayList<>();
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=null;
		
		
		String s=bf.readLine();
		int ans=1;
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				if(s.charAt(i)=='d') ans=ans*10;
				else ans=ans*26;
			}
			else {
				if(s.charAt(i)=='d' && s.charAt(i-1)=='d') ans=ans*9;
				else if(s.charAt(i)=='d' && s.charAt(i-1)=='c') ans=ans*10;
				else if(s.charAt(i)=='c' && s.charAt(i-1)=='d') ans=ans*26;
				else if(s.charAt(i)=='c' && s.charAt(i-1)=='c') ans=ans*25;
			}
			
		}
		
		
		System.out.println(ans);
		
	}
}