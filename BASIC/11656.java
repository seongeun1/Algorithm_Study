package pr;



import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;




public class Main {
	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner scin=new Scanner(System.in);
		String s=scin.nextLine();
		String[] a=new String[s.length()];
		
		for(int i=0;i<s.length();i++) {
			a[i]=s.substring(i);
		}
		
		Arrays.sort(a);
		for(String g : a) {
			System.out.println(g);
		}
		
		
	}
}
