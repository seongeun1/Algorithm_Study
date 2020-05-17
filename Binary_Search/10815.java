package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static boolean bsearch(int a) {
		int mid;
		int left=0;
		int right=N-1;
		while(right>=left) {
			mid=(left+right)/2;
		
			if(a==mtx[mid]) return true;
			if(a<mtx[mid]) right=mid-1;
			else if(a>mtx[mid]) left=mid+1;
			
		}
		return false;
	}
	
	
	public static int N;
	public static int M;
	
	public static int[] mtx;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		N=Integer.parseInt(bf.readLine());
		mtx=Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(mtx);
		
		
		M=Integer.parseInt(bf.readLine());
		StringTokenizer st=new StringTokenizer(bf.readLine(), " ");
		while(M-->0) {
			int num=Integer.parseInt(st.nextToken());
			if(bsearch(num)) sb.append(1+" ");
			else sb.append(0+" ");
		}
		
		
		System.out.println(sb);
		
	
		
	}
}
