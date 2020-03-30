package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	
	int num=Integer.parseInt(bf.readLine());
	int[][] meet=new int[num][3];
	
	
	StringTokenizer st;
	
	for(int i=0; i<num;i++) {
		st=new StringTokenizer(bf.readLine());
		meet[i][0]=Integer.parseInt(st.nextToken());
		meet[i][1]=Integer.parseInt(st.nextToken());
		meet[i][2]=meet[i][1]-meet[i][0];
	//	System.out.println(Arrays.toString(meet[i]));
	}
	
	Arrays.sort(meet, new Comparator<int[]>() {
		@Override
		public int compare(int[] a, int[] b) {
			if(a[1]==b[1]) {
				return a[0]-b[0];
			}
			else
				return a[1]-b[1];
		}
	});
	
	int end=-1; int count=0;
	for(int i=0;i<num;i++) {
		if(meet[i][0]>=end) {
			end=meet[i][1];
			count++;
			//System.out.println(Arrays.toString(meet[i]));
		}
	}
	System.out.println(count);
	
	
	}
}



