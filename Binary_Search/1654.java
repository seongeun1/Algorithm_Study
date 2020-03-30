package pr;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;




public class Main {
	public static void main(String[] args) throws Exception {
	
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		long[] nums=Arrays.stream(bf.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		
		long[] list=new long[(int)nums[0]];
		long max=Long.MIN_VALUE;
	
		for(int i=0;i<(int)nums[0];i++) {
			list[i]=Long.parseLong(bf.readLine());
			if(list[i]>max) max=list[i];
		}
		long min=1;
		long mid=0;
		long ncount=nums[1];
		
		while(min<=max) {
			long count=0;
			mid=(min+max)/2;
			
			for(int i=0;i<(int)nums[0];i++) {
				count+=(list[i]/mid);
			}
			
			if(count<ncount) max=mid-1;
			if(count>=ncount) min=mid+1;
			
		
		}
		System.out.println(max);
		
		
	}
	
}




