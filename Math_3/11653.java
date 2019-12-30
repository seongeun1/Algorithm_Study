package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	int num=Integer.parseInt(bf.readLine());
	
	int i=2;
	while(num!=1) {
		if(num%i==0) {
			System.out.println(i);
			num/=i;
		}
		else i++;
	}
	
	}
}




