package pr;


import java.io.IOException;
import java.util.Scanner;



public class Main {
	
	public static boolean d(int N) {
		String a=Integer.toString(N);
		if(a.length()==3) {
			int first=Integer.parseInt(a.substring(0, 1));
			int second=Integer.parseInt(a.substring(1, 2));
			int third=Integer.parseInt(a.substring(2, 3));
			
			if(first-second==second-third) return true;
			else return false;
		}
		else if(a.length()==4) return false;
		else return true;
	}

	public static void main(String[] args) throws IOException {
		Scanner scin=new Scanner(System.in);
		int N=scin.nextInt();
		int sum=0;
		for(int i=1;i<=N;i++) {
			if(d(i)) sum++;
		}
		
		System.out.println(sum);
	}
}
