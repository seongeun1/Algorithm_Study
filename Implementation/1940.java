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
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(bf.readLine());
		M=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(bf.readLine());
		mtx=new int[N];
		for(int i=0;i<N;i++) {
			mtx[i]=Integer.parseInt(st.nextToken());
		}
		
		int sum=0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(i==j) continue;
				if(mtx[i]==mtx[j]) continue;
				if(mtx[i]+mtx[j]==M) {
					
					sum++;
					break;
				}
			}
		}
		
		System.out.println(sum);
		



	}
}
