package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int N;
	static int M;
	static int[] mtx;
 	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		mtx=new int[46];
		N=Integer.parseInt(bf.readLine());
		
		mtx[1]=1;
		for(int i=2;i<=N;i++) {
			mtx[i]=mtx[i-1]+mtx[i-2];
		}
		
		System.out.println(mtx[N]);
		
		
	}
}
