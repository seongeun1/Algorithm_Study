package pr;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {

	public static void delete(LinkedList<Integer> list) {
		list.poll();
	}
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int line=Integer.parseInt(bf.readLine());

		for(int l=0;l<line;l++) {
			StringBuffer sb=new StringBuffer();
			String s=bf.readLine();
			int num=Integer.parseInt(bf.readLine());
			LinkedList<Integer> list=new LinkedList<Integer>();
			String st=bf.readLine();
			String[] sslist=st.substring(1, st.length()-1).split(",");

			for(int i=0;i<num;i++) {
				list.add(i,Integer.parseInt(sslist[i]));
			}

			int rcount=0; boolean flag=true;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='R') rcount++;
				else {
					if(list.isEmpty()) {
						flag=false;
						break;
					}

					else if(rcount%2==0) list.pollFirst();
					else list.pollLast();


				}
			}

			if(!flag) sb.append("error");
			else {
				sb.append("[");
				if(rcount%2==0) {
					while(!list.isEmpty()) {
						sb.append(list.poll());
						if(!list.isEmpty()) sb.append(",");
					}
				}
				else {
					while(!list.isEmpty()) {
						sb.append(list.pollLast());
						if(!list.isEmpty()) sb.append(",");
					}
				}
				sb.append("]");


			}
			System.out.println(sb);
		}

	}

}

