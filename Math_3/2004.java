package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		long N=Long.parseLong(st.nextToken());
		long M=Long.parseLong(st.nextToken());
		
		int five=0;
		int two=0;
		//2의 제곱수, 5의 제곱수로 나눠 봐야 한다 ! 그냥 2, 5만 나누는 것이 아니라
		
		for(long i=2;i<=N;i*=2) {
			two+=N/i;
		}
		for(long i=2;i<=N-M;i*=2) {
			two-=(N-M)/i;
		}
		for(long i=2;i<=M;i*=2) {
			two-=M/i;
		}
		for(long i=5;i<=N;i*=5) {
			five+=N/i;
		}
		for(long i=5;i<=N-M;i*=5) {
			five-=(N-M)/i;
		}
		for(long i=5;i<=M;i*=5) {
			five-=M/i;
		}
	
		
		if(two>=five) System.out.println(five);
		else System.out.println(two);
		
		
		
		
		
		
	}
}
