package pr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);

		int n=scin.nextInt();
		int m=scin.nextInt();
		ArrayList<Integer> number=new ArrayList<Integer>();

		int total=0, max=0;

		for(int i=0;i<n;i++) {
			number.add(scin.nextInt());
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(number.get(i)+number.get(j)+number.get(k)>=max && number.get(i)+number.get(j)+number.get(k)<=m) {
						max=number.get(i)+number.get(j)+number.get(k);
					}
				}
			}
		}


		total=max;
		System.out.println(total);
	}
}
