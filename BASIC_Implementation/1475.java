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
		String s=bf.readLine();
		mtx=new int[10];
		for(int i=0;i<s.length();i++) {
			int a=Integer.parseInt(s.substring(i, i+1));
			if(a==6) a=9;
			mtx[a]++;
			
		}
		
		int max=0;
		for(int i=1;i<=9;i++) {
			if(i==9) {
				if(mtx[i]%2==1)	max=Math.max(max, mtx[i]/2+1);
				else max=Math.max(max, mtx[i]/2);
			}
			else max=Math.max(max, mtx[i]);
		}
		

		
		System.out.println(max);
	}
}
