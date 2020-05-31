package pr;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;



public class Main {
	
	public static int d(int a) {
		int num=a;
		while(num>0) {
			a+=num%10;
			num/=10;
		}
		
		return a;
	}
	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=10001;
		boolean[] list=new boolean[n];
	
		int a=0, x;
		
		
		for(int i=1;i<n;i++) {
			a=d(i);
			if(a<n) {
				list[a]=true;
			}
			
			
		}
		
		
		for(int i=1;i<n;i++) {
			if(!list[i]) bw.write(i+"\n");
		}
		bw.flush();
		
		
	}
}
