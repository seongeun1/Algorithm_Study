package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;




public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		
		int N=Integer.parseInt(bf.readLine());
		int[] num=new int[N+4];
		num[1]=1;
		num[2]=1;
		num[3]=1;
		for(int i=4;i<=N;i++) {

			if(i%3==0 && i%2==0) {
				num[i]=Math.min(num[i-1], Math.min(num[i/2], num[i/3]));
			}
			else if(i%3==0 && i%2!=0) {
				num[i]=Math.min(num[i-1], num[i/3]);
				
			}
			else if(i%3!=0 && i%2==0) {
				num[i]=Math.min(num[i-1], num[i/2]);
				
			}
			else num[i]=num[i-1];
			
			num[i]++;

		}
		
		System.out.println(num[N]);
	}
}

