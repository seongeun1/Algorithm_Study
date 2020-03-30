package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;




public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int[] nums=new int[n+1];
		for(int i=1;i<=n;i++) {
			nums[i]=Integer.parseInt(st.nextToken());
		}
		int[] incnum=new int[n+1];
		
		
		int index=1; incnum[1]=nums[1];
		for(int i=2;i<=n;i++) {
			if(incnum[index]<nums[i]) {
				incnum[++index]=nums[i];
				continue;
			}
			else {
				int r=index;
				int l=1;
				int mid=0;
				while(l<r) {
					mid=(r+l)/2;
					if(incnum[mid]<nums[i]) l=mid+1;
					else r=mid;
				}
				incnum[r]=nums[i];
			}
			
			
		}
		System.out.println(index);
		System.out.println(Arrays.toString(incnum));
		
	
	}
}