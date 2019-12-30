package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(bf.readLine());

	
	int num=Integer.parseInt(st.nextToken());
	int[] div=new int[num];
	
	st=new StringTokenizer(bf.readLine());
	for(int i=0;i<num;i++) {
		div[i]=Integer.parseInt(st.nextToken());
	}
	Arrays.sort(div);
	System.out.println(div[0]*div[num-1]);
	
	}
}




