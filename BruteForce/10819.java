package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static boolean next() {
		int i=mtx.length-1;
		while(i>0 && mtx[i]<=mtx[i-1]) i--;
		if(i<=0) return false;
		else {
			int j=i;
			for(int n=j;n<mtx.length;n++) {
				if(j<=n && mtx[n]>=mtx[i-1]) j=Math.max(j,  n);
			}
			
			swap(i-1, j);
			
			j=mtx.length-1;
			while(i<j) {
				swap(i++, j--);
			}
			
			
			return true;
		}
	}
	
	public static void swap(int x, int y) {
		int temp=mtx[x];
		mtx[x]=mtx[y];
		mtx[y]=temp;
	}
	public static int[] mtx;
	public static int[] list;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		mtx=new int[N];
		StringTokenizer st=new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			mtx[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(mtx);
		int ans=Integer.MIN_VALUE;
		do {
			int sans=0;
			for(int i=0;i<N-1;i++) {
				sans+=Math.abs(mtx[i]-mtx[i+1]);
			}
			ans=Math.max(ans, sans);
			
		}while(next());
		System.out.println(ans);
	}
}


