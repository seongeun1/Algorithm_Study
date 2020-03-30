package pr;


import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws Exception {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	String[] input=bf.readLine().split("\\-");
	//System.out.println(Arrays.toString(input));
	
	int sum=0;
	
	
	String[] first=input[0].split("\\+");
	for(int i=0;i<first.length;i++) {
		sum+=Integer.parseInt(first[i]);		
	}
	
	
	for(int i=1;i<input.length;i++) {
		String[] second=input[i].split("\\+");
		for(int j=0;j<second.length;j++) {
		//	System.out.println(second[j]);
			sum-=Integer.parseInt(second[j]);
		}
	}

	System.out.println(sum);
	}
}




