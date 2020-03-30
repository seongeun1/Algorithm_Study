package pr;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		int x=scin.nextInt();
        int flag=0;
        

		for(int i=0;i<x;i++) {
			int sum=0, copy=i;
			while(copy>0) {
				sum+=copy%10;
				copy/=10;
			}
			
			if(sum+i==x) {
				flag=0;
				System.out.println(i);
				break;
			}
			else flag=1;
		}
		
		if(flag==1) System.out.println(0);
	
	}
}
