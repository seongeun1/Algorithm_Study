package pr;



import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;




public class Main {
	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner scin=new Scanner(System.in);

		
		String st=scin.nextLine();
		String s="";
	
		for(char ch : st.toCharArray()) {
			int c;
			if(ch>='A' && ch<='Z') {
				c=ch+13;
				if(c>'Z') c=c-26;
			}
			else if(ch>='a' && ch<='z') {
				c=ch+13;
				if(c>'z') c=c-26;
			}
			else c=(int) ch;
			
			s=s+(char)c;
		}
	
		System.out.println(s);
		
	}
}
