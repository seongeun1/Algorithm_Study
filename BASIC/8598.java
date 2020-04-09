package pr;

import java.io.IOException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		while(N>0) {
			String s=sc.next();
			int score=0;
	
			for(int i=0;i<s.length();i++) {
				int sub=0;
				while(i<s.length()&&s.charAt(i)=='O') {
					sub++;
					score+=sub;
					i++;
				}
			}

			System.out.println(score);
			N--;
		}
		


	
	
	}
}
