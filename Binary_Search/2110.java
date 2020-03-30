package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;




public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
	
		int n=Integer.parseInt(st.nextToken());
		int count=Integer.parseInt(st.nextToken());
		int[] loc=new int[n];
		
		for(int i=0;i<n;i++) {
			loc[i]=Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(loc);
		
		int min=1; //min과 max는 사이 값의 최대, 최소
		int max=loc[n-1]-loc[0];
		int mid=0;
		
		
		while(min<=max) {
			mid=(min+max)/2;
			int cnt=1;
			int temp=loc[0];
			for(int i:loc) {
				if(i-temp>=mid) {
					cnt++;
					temp=i;
				}
	
			}
			
		//	System.out.println(max+" "+cnt);
			
			
			if(cnt>=count) min=mid+1;
			else max=mid-1;
		
			
		}
		System.out.println(max);
		

	}


}