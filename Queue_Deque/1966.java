package pr;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {

	public static void delete(LinkedList<Integer> list) {
		list.poll();
	}
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int line=Integer.parseInt(bf.readLine());

		for(int l=0;l<line;l++) {
			StringTokenizer st=new StringTokenizer(bf.readLine());

			int num=Integer.parseInt(st.nextToken());
			int index=Integer.parseInt(st.nextToken()), newindex=index;

			LinkedList<Integer> list=new LinkedList<Integer>();
			LinkedList<Integer> ilist=new LinkedList<Integer>();
			st=new StringTokenizer(bf.readLine());

			for(int i=0;i<num;i++) {
				list.add(i,Integer.parseInt(st.nextToken()));
				ilist.add(i, i);
			}
			int count=0;
			while(true) {
				
				int a=list.peek();
				boolean flag=false;
				for(int j=a+1;j<=9;j++) {
					if(list.contains(j)) {
						flag=true;
						break;
					}
				}
				
			
				if(flag) {
					list.offer(list.poll());
					ilist.offer(ilist.poll());
				}

				else {
					if(index==ilist.peekFirst()) break;
					list.poll();
					ilist.poll();	
					count++;
				}
				

			}
			System.out.println(++count);
		}
	}

}


