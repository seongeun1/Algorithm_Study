package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	
	public static int max1=Integer.MIN_VALUE;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		int[] wine=new int[num];
		int[] max=new int[num];
		
		for(int i=0;i<num;i++) {
			wine[i]=Integer.parseInt(bf.readLine());
		}
		
	
		for(int i=0;i<num;i++) {
			if(i==0)max[i]=wine[0];
			else if(i==1)max[i]=wine[0]+wine[1];
			else if(i==2)max[i]=Math.max(wine[0]+wine[2], wine[1]+wine[2]);
			else max[i]=Math.max(wine[i]+wine[i-1]+max[i-3], wine[i]+max[i-2]);
			if(i>=1) max[i]=Math.max(max[i-1], max[i]);
			if(max[i]>max1)max1=max[i];
		}
		System.out.println(max1);
	}
}



