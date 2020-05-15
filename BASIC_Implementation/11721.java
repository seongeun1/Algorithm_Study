package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		String s=bf.readLine();
		int type=0;
		for(int i=0;i<s.length();i++) {
			if(type==10) {
				sb.append("\n");
				type=0;
			}
			sb.append(s.charAt(i));
			type++;
		}
	
		System.out.println(sb);

		
	}
}
