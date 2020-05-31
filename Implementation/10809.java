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
		int[] num=new int[26];
		
		
		String s=scin.next();
		for(int i=0;i<26;i++) {
			num[i]=-1;
		}
		for(int i=0;i<s.length();i++) {
			if(num[s.charAt(i)-'a']==-1) {
				num[s.charAt(i)-'a']=i;
			}

		}
		
		for(int i=0;i<26;i++) {
			System.out.print(num[i]+" ");
		}
	
		
		
	}
}
