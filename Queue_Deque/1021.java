package pr;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int left=0,right=0;
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int line=Integer.parseInt(st.nextToken());
		int num=Integer.parseInt(st.nextToken());
		LinkedList<Integer> deq1=new LinkedList<Integer>();
		
		int[] ndeq=new int[num];
		int[] ideq=new int[num];
		for(int i=1;i<=line;i++) {
			deq1.offer(i);

		}
		
		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<num;i++) {
			ndeq[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i:ndeq) {
			int index=deq1.indexOf(i)+1;
			if(Math.abs(1-index)<=Math.abs(deq1.size()-index)) {
				while(deq1.peekFirst()!=i) {
					deq1.offer(deq1.poll());
					left++;
				//	System.out.println(deq1+""+left+" "+right);
				}
				
				deq1.poll();
				
			}
			else {
				while(deq1.peekFirst()!=i){
					for(int j=0;j<deq1.size()-1;j++){
						deq1.offer(deq1.poll());
					}
					right++;
					//System.out.println(deq1+""+left+" "+right);
				}
				deq1.poll();
			}
		}
		System.out.println(left+right);
	}

}



