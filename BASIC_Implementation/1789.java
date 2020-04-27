package pr;



import java.io.*;
import java.util.*;



public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		long num=Long.parseLong(bf.readLine());
		

		int count=(int)Math.sqrt((double)2*num);
		
		while((count * count + count) > num*2) {
			count--;
		}
		
		System.out.println(count);
		
	}

}