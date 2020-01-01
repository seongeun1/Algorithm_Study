package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		int testcase=Integer.parseInt(bf.readLine());
		for(int t=0;t<testcase;t++) {
			int num=Integer.parseInt(bf.readLine());
			ArrayList<String> klist=new ArrayList<String>();
			ArrayList<Integer> nlist=new ArrayList<Integer>();

			int j=0;
			for(int i=0;i<num;i++) {
				StringTokenizer st=new StringTokenizer(bf.readLine()," ");
				String name=st.nextToken(), kind=st.nextToken();
				if(!klist.contains(kind)) {
					klist.add(j,kind);
					nlist.add(j, 1);
					j++;
				}
				else {
					int index=klist.indexOf(kind);
					nlist.set(index, nlist.get(index)+1);
				}
			}
			int mul=1;
			for(int n: nlist) {
				mul*=(n+1);
			}

			System.out.println((mul-1));
		}	

	}

}




