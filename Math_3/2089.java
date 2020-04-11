package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


		StringBuffer sb=new StringBuffer();

		long N=Long.parseLong(bf.readLine());
		if(N==0) sb.append(0);
		while(Math.abs(N)>0) {
			if(N<0) {
				sb.append(Math.abs((N-2)%-2));
				N=(N-1)/-2;
			}
			else {
				sb.append((N)%-2);
				N=(N)/-2;
			}

			System.out.println(N);
		}
		sb.reverse();
		
		System.out.println(sb);

	}
}

