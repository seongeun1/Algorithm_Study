package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;




public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> cal=new ArrayList<>();
		int num=Integer.parseInt(bf.readLine());
		cal.add(0,0);
		cal.add(1,0);
		cal.add(2,1);
		cal.add(3,1);
		for(int i=4;i<=num;i++) {
			int a=Integer.MAX_VALUE,b=a,c=a;
			if(i%3==0) a=cal.get(i/3)+1;
			if(i%2==0) b=cal.get(i/2)+1;
			c=cal.get(i-1)+1;
			//System.out.println(i+"  a: "+a+" b: "+b+"  c: "+c);
			cal.add(i, Math.min(a, Math.min(b, c)));
		}
		System.out.println(cal.get(num));
	}
}


