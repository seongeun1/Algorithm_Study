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
	
		
		int big, small, space, number;
		while(scin.hasNext()) {
			String s=scin.nextLine();
			big=0; small=0;
			space=0;number=0;
			for(char ch : s.toCharArray()) {
				if(ch==' ') space++;
				else if(ch>='0' && ch<='9') number++;
				else if(ch>='a' && ch<='z') small++;
				else if(ch>='A' && ch<='Z') big++;
			}
			
			System.out.println(small+" "+big+" "+number+" "+space);
		}
		
		
	}
}
