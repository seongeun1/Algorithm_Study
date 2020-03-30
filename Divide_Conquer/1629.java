package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static long powdiv(int a, int b, int c) {
		if(b==0) return 1;
		long n=powdiv(a%c, b/2,c);
		if(b%2==0) return (n*n)%c;
		else return (n*n)%c*a%c;
		
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		
		
		long result=powdiv(a, b, c);
		System.out.println(result);
	}

}


