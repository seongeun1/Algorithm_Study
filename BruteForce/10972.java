package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void swap(int x, int y) {
		int temp=mtx[x];
		mtx[x]=mtx[y];
		mtx[y]=temp;
	}
	
	public static int[] mtx;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		mtx=new int[N];
		StringTokenizer st=new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			mtx[i]=Integer.parseInt(st.nextToken());
		}
		
		int i=N-1;
		while(i>0 && mtx[i]<=mtx[i-1]) i--;
		if(i<=0) System.out.println(-1);
		else {
			int j=i;
			for(int n=j;n<N;n++) {
				if(n>=j && mtx[n]>mtx[i-1]) j=Math.max(j, n);
			}
			
			swap(j, i-1);	
			j=N-1;
			while(i<j) {
				swap(i++, j--);
			}

			
			for(int n=0;n<N;n++){
				System.out.print(mtx[n]+" ");
			}
			
			
		}
		
	}
}


