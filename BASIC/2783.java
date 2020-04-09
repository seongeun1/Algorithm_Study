package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException {
		StringBuffer sb = new StringBuffer();
	
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine()," ");
	
		int gram=Integer.parseInt(st.nextToken());
		int price=Integer.parseInt(st.nextToken());
		double arr=(double)gram/price;
						
		
		int N=Integer.parseInt(bf.readLine());
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine()," ");
			gram=Integer.parseInt(st.nextToken());
			price=Integer.parseInt(st.nextToken());
			if(arr>=(double)gram/price) {
				arr=(double)gram/price;
			}
			
		}
		
		System.out.println(String.format("%.2f", arr*1000));
		
	

	}
}
