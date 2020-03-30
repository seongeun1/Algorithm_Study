package pr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		int n=scin.nextInt();
		long numbers[]=new long[n+1];
		numbers[0]=0;numbers[1]=1;
		for(int i=2;i<=n;i++) {
			numbers[i]=numbers[i-1]+numbers[i-2];
		}
		System.out.println(numbers[n]);
		

	}
}
