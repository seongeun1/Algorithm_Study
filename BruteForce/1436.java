package pr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		int N=scin.nextInt();
		int i=666, count=0;
		for(;;i++) {
			String compare=i+"";
			for(int index=2;index<compare.length();index++) {
				int a=compare.charAt(index);
				int b=compare.charAt(index-1);
				int c=compare.charAt(index-2);
				if(a==54&&b==54&&c==54) {
					count++;
					break;
				}

			}

			if(count==N) {
				System.out.println(i);
				break;
			}
		}
	}
}


