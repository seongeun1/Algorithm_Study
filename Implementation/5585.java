package pr;



import java.io.*;
import java.util.*;



public class Main {	
	
	public static int[][] mtx;
	public static int[][] check;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		int money=Integer.parseInt(bf.readLine());
		money=1000-money;
		int n=0;
		while(money>0) {
			if(money>=500) {
				n++;
				money-=500;
			}
			else if(money>=100) {
				money-=100;
				n++;
			}
			else if(money>=50) {
				money-=50;
				n++;
			}
			else if(money>=10) {
				money-=10;
				n++;
			}
			else if(money>=1) {
				money-=1;
				n++;
			}
		}
		System.out.println(n);
	}

}