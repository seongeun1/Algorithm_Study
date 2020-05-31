package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {	


	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		int N=Integer.parseInt(bf.readLine());
		int c=0;
		while(N-- >0) {
			String s=bf.readLine();
			boolean flag=false;
			for(int i=0;i<s.length();i++) {
				for(int j=i+2;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						if(s.charAt(j)!=s.charAt(j-1)) flag=true;
					}
				}
			}
			if(!flag) c++;
		}
		
		System.out.println(c);
	}
	

}