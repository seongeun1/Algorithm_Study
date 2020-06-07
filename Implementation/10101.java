package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int N;
	static ArrayList<Integer> mtx=new ArrayList<>();
	static int n;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		int n=0;
		int sum=0;
		
		for(int i=0;i<3;i++) {
			n=Integer.parseInt(bf.readLine());
			mtx.add(n);
			sum+=n;
		}
		boolean equilateral=false;
		boolean Isosceles=false;
		boolean Scalene=false;
		boolean Error=false;
		if(sum!=180) Error=true;
		
		if(!Error) {
			if(mtx.get(0)==mtx.get(1) && mtx.get(1)==mtx.get(2)) {
				equilateral=true;
			}
			else if(mtx.get(0)==mtx.get(1) && mtx.get(1)!=mtx.get(2) && mtx.get(2)!=mtx.get(0)) {
				Isosceles=true;
			}
			else if(mtx.get(0)!=mtx.get(1) && mtx.get(1)==mtx.get(2) && mtx.get(2)!=mtx.get(0)) {
				Isosceles=true;
			}
			else if(mtx.get(0)!=mtx.get(1) && mtx.get(1)!=mtx.get(2) && mtx.get(2)==mtx.get(0)) {
				Isosceles=true;
			}
			else Scalene=true;
		}
		
		if(Error) System.out.println("Error");
		else if(Isosceles) System.out.println("Isosceles");
		else if(equilateral) System.out.println("Equilateral");
		else System.out.println("Scalene");
	
	}
}
