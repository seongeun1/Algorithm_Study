package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	
	public static int N;

	public static int[] mtx;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=null;
		N=Integer.parseInt(bf.readLine());
		st=new StringTokenizer(bf.readLine(), " ");
		mtx=new int[N];
		int max=0;
		for(int i=0;i<N;i++) {
			mtx[i]=Integer.parseInt(st.nextToken());
			max=Math.max(max, mtx[i]);
		}
		
		int money=Integer.parseInt(bf.readLine());
		
		int min=3;
		int mid=0;
		int sans=0;
		while(min<=max) {
			mid=(min+max)/2;
			sans=0;
			for(int i=0;i<N;i++) {
				if(mtx[i]<=mid) sans+=mtx[i];
				else sans+=mid;
			}
			if(money>=sans) min=mid+1;
			else if(money<sans) max=mid-1;
		
		}
		System.out.println(max);
		
		
		
	}
}
