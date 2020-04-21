package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



	
public class Main {
	public static int[] mon= {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static String[] days= {"SUN", "MON","TUE","WED","THU", "FRI","SAT"};
	public static StringBuffer sb=new StringBuffer();
	public static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int month=Integer.parseInt(st.nextToken());
		int day=Integer.parseInt(st.nextToken());
		
		int a=0;
		for(int i=1;i<month;i++) {
			a+=mon[i];
		}
		a+=day;
		
		
		System.out.println(days[a%7]);

	}

}


