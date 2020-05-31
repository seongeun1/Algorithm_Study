package pr;



import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;




public class Main {
	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner scin=new Scanner(System.in);

		
		int[] num=new int[4];
		for(int i=0;i<4;i++) {
			num[i]=scin.nextInt();
		}
		
		String a=String.valueOf(num[0])+String.valueOf(num[1]);
		String b=String.valueOf(num[2])+String.valueOf(num[3]);
		System.out.println(String.format("%.0f", Double.parseDouble(a)+Double.parseDouble(b)));
		
		
		
	}
}
