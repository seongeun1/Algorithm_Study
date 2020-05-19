package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static int N;
	public static int M;
	public static int[] mtx;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		LinkedList<Character> list=new LinkedList<>();
		LinkedList<Character> list1=new LinkedList<>();
		String s=bf.readLine();
		list.add('C');
		list.add('A');
		list.add('M');
		list.add('B');
		list.add('R');
		list.add('I');
		list.add('D');
		list.add('G');
		list.add('E');
		
		for(int i=0;i<s.length();i++) {
			if(!list.contains(s.charAt(i)))	list1.add(s.charAt(i));
		}
		
		
		for(char i : list1) {
			sb.append(i);
		}
		
		System.out.println(sb);
		
		
		
		
		
		
		}
}
