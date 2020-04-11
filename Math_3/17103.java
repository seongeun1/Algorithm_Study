package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		boolean[] p=new boolean[1000001];
		
		p[0]=true;
		p[1]=true;
		for(int i=2;i<=1000000;i++) {
			if(p[i]==false){
				for(int j=i*2;j<=1000000;j+=i) {
					p[j]=true;
				}
			}
		}
		
		
		int K=Integer.parseInt(bf.readLine());
		int sum=0;
		while(K-->0) {
			int N=Integer.parseInt(bf.readLine());
			sum=0;
			for(int i=2;i<=N/2;i++) {
				if(p[i]==false && p[N-i]==false) {
					sum++;
				}
				
			}

			sb.append(sum+"\n");
		}
		System.out.println(sb);
	}
}

