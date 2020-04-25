package pr;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] n=new int[26];
		
		
		String s=bf.readLine();
		for(char ch:s.toCharArray()) {
			n[(int)(ch-'a')]++;
		}
		
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}

	}
}
