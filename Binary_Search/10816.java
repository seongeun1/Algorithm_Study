package pr;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws Exception {
	
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		String[] list=bf.readLine().split(" ");
		int[] list2=new int[n];
		for(int i=0;i<n;i++) {
			list2[i]=Integer.parseInt(list[i]);
		}
		
		Arrays.sort(list2);
		
		
		
		int m=Integer.parseInt(bf.readLine());
		StringTokenizer st=new StringTokenizer(bf.readLine());
	
		for(int i=0;i<m;i++) {
			int number=Integer.parseInt(st.nextToken());
			
			System.out.print(upperbound(list2, number)-lowerbound(list2,number)+" ");
		}
	}
	public static int lowerbound(int[] list, int key) {
		int low=0;
		int high=list.length;
		while(low<high) {
			int mid=(low+high)/2;
			if(key<=list[mid]){
				high=mid;
			}
			else{
				low=mid+1;
			}
		}
		return low;
	}
	
	public static int upperbound(int[] list, int key) {
		int low=0;
		int high=list.length;
		while(low<high) {
			int mid=(low+high)/2;
			if(key<list[mid]){
				high=mid;
			}
			else{
				low=mid+1;
			}
		}
		return high;
	}
	
}




