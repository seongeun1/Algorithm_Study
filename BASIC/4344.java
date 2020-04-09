package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		
		StringTokenizer st;
		
		while((N--)>0){
			st=new StringTokenizer(bf.readLine());
			int num=Integer.parseInt(st.nextToken());
			ArrayList<Integer> student=new ArrayList<Integer>();
			float score=0;
			for(int i=0;i<num;i++) {
				student.add(Integer.parseInt(st.nextToken()));
				score+=student.get(i);
				
			}
			score/=num;
			int num_s=0;
			for(int i=0;i<num;i++) {
				if(student.get(i)>score) num_s++;
			}
			System.out.println(String.format("%.3f", (float)num_s/num*100)+"%");
		}

	
	
	}
}
