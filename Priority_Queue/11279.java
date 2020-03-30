package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

class ComparatorDescending implements Comparator<Long>{

	@Override
	public int compare(Long o1, Long o2) {
		if(o1<o2) return 1;
		else return -1;
	}
	
	
}
public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		int n=Integer.parseInt(bf.readLine());
		PriorityQueue<Long> list = new PriorityQueue<Long>(new ComparatorDescending());
		
		for(int i=0;i<n;i++) {
			Long num=Long.parseLong(bf.readLine());
			if(num==0 && list.size()==0) sb.append(0+"\n");
			else if(num==0 && list.size()!=0) sb.append(list.poll()+"\n");
			else if(num!=0) list.offer(num);
		
		}
		
		System.out.println(sb);
		
		
	
	}
}