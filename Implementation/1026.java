package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine(), " ");
		int N=Integer.parseInt(st.nextToken());
		int[] A=new int[N];
		Integer[] B=new Integer[N];

		st=new StringTokenizer(bf.readLine(), " ");
		for(int i=0;i<N;i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(bf.readLine(), " ");
		for(int i=0;i<N;i++) {
			B[i]=Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		
		int s=0;
		for(int i=0;i<N;i++) {
			s+=A[i]*B[i];
		}
		
		System.out.println(s);
		
	}
}
