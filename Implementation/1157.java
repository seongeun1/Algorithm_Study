package pr;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scin=new Scanner(System.in);
		String N=scin.next();
		ArrayList<Character> list=new ArrayList<Character>();
		ArrayList<Integer> num=new ArrayList<Integer>();
		
		
		for(int i=0;i<N.length();i++) {
			char a=Character.toLowerCase(N.charAt(i));
			if(!list.contains(Character.toLowerCase(N.charAt(i)))&& !list.contains(Character.toUpperCase(N.charAt(i)))) {
				list.add(a);
				num.add(1);
			}
			else{
				num.set(list.indexOf(a), num.get(list.indexOf(a))+1);		
			}
		}
		
		int max=Integer.MIN_VALUE;
		int count=0;
		int index=0;
		System.out.println(num);
		for(int i=0;i<num.size();i++) {
			if(max<num.get(i)) {
				index=i;
				max=num.get(i);
			}
		
		}
		System.out.println(index);
		for(int i=0;i<num.size();i++) {
			if(max==num.get(i)) count++;
		}

		if(count<2) {
			System.out.println(Character.toUpperCase(list.get(index)));
		}
		else System.out.println("?");
	}
}
