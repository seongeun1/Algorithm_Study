package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(bf.readLine());
	int num=Integer.parseInt(st.nextToken());
	ArrayList<Integer> time=new ArrayList<>();
	st=new StringTokenizer(bf.readLine());
	
	
	for(int i=0;i<num;i++) {
		time.add(Integer.parseInt(st.nextToken()));
	}
	
	Collections.sort(time);
	
	int sum=0, result=0;
	for(int i=0;i<num;i++) {
		sum+=time.get(i);
		result+=sum;
	}
	System.out.println(result);
	

	}
}




