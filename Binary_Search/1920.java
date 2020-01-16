package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
	
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		TreeSet<Integer> set=new TreeSet<Integer>();
		StringTokenizer st=new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int m=Integer.parseInt(bf.readLine());
		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<m;i++) {
			if(set.contains(Integer.parseInt(st.nextToken()))) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}

	}
}


