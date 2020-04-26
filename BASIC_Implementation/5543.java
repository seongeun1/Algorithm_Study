package pr;



import java.io.*;
import java.util.*;



public class Main {	

	
	public static int[][] mtx;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 

		mtx=new int[3][3];
		
		for(int i=0;i<3;i++) {
			mtx[0][i]=Integer.parseInt(bf.readLine());
		}
		int coke=Integer.parseInt(bf.readLine());
		int cider=Integer.parseInt(bf.readLine());
		
		
		for(int i=0;i<3;i++) {
			mtx[1][i]=mtx[0][i]+coke-50;
			mtx[2][i]=mtx[0][i]+cider-50;
		}
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<3;i++) {
			ans=Math.min(ans, Math.min(mtx[1][i], mtx[2][i]));
		}
		
		System.out.println(ans);
		

	}

}