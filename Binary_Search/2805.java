package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;




public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		long[] nums=Arrays.stream(bf.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

		long max=Long.MIN_VALUE;
		long[] list=Arrays.stream(bf.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		for(int i=0;i<(int)nums[0];i++) {
			if(list[i]>max) max=list[i];
		}
		long min=1;
		long mid=0;
		long wantmeter=nums[1];
		System.out.println(max);
		
		while(min<=max) {
			long meter=0;
			mid=(min+max)/2;

			for(int i=0;i<(int)nums[0];i++) {
				long m=list[i]-mid;
				
				if(m>0) meter+=m;

			}
			if(meter<wantmeter) max=mid-1;
			else if(meter>=wantmeter) min=mid+1;

		}
		
		System.out.println(max);

	}


}