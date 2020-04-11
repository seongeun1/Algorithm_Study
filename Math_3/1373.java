package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s=bf.readLine();
		StringBuffer sb=new StringBuffer();

		int sum=0;
		
		int N=s.length();
		while((N--)>=0) {
			sum=0;
			for(int i=0;i<3 && N>=0;i++, N--) {
				sum+=Integer.parseInt(s.substring(N,N+1))*Math.pow(2,i);
			}
			sb=sb.append(sum);
	
			if(N==-1) break;
			N++;
	
		}
		sb.reverse();
		System.out.println(sb);
	}
}
