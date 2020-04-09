package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st=new StringTokenizer(bf.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map1=new HashMap<String, Integer>();
		HashMap<Integer,String> map2=new HashMap<Integer,String>();
		
		for(int i=0;i<n;i++) {
			String a=bf.readLine();
			map1.put(a, i+1);
			map2.put(i+1, a);
		}
		
		
		for(int j=0;j<m;j++) {
			String s= bf.readLine();
			if(Character.isDigit(s.charAt(0))) {
				int a= Integer.parseInt(s);
				sb.append(map2.get(a)+"\n");				
			}
			else {
				sb.append(map1.get(s)+"\n");
			}
		}
		
		System.out.println(sb.toString());
	
		
	

	}
}
