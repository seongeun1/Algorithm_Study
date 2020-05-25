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
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		mtx=new int[N+2];
		for(int i=1;i<=N;i++) {
			mtx[i]=Integer.parseInt(bf.readLine());
		}
		mtx[N+1]=M;
		Arrays.sort(mtx);
		int left=0, right=M;
		int mid=0; // mid를 최소거리로 둔다.
		int cnt=0; int ans=0;
		while(left<=right) {
			mid=(left+right)/2;
			cnt=0;
			int pos=0;
			for(int i=1;i<=N+1;i++) {
				if(mtx[i]-mtx[pos]<mid) cnt++;
				else pos=i;
			}
			if(cnt>K) {
				right=mid-1;
			}
			else {
				left=mid+1; 
				ans=mid;
			}
		}
		
		
		System.out.println(ans);
		



	}
}
