package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
	
		char[][] mtx=new char[5][15];
		for(int i=0;i<5;i++) {
			String s=bf.readLine();
			for(int j=0;j<15;j++) {
				if(s.length()<=j) mtx[i][j]='!';
				else mtx[i][j]=s.charAt(j);
				
			}
		}
		
		for(int j=0;j<15;j++) {
			for(int i=0;i<5;i++) {
				if(mtx[i][j]=='!') sb.append("");
				else sb.append(mtx[i][j]);
				
			}
		}
		
		System.out.println(sb);

		
	}
}
