package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

class ComparatorAescending implements Comparator<Long>{

	@Override
	public int compare(Long o1, Long o2) {
		if(o1>o2) return 1;
		else return -1;
	}
	
	
}
class Comparatordescending implements Comparator<Long>{

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
		PriorityQueue<Long> biglist = new PriorityQueue<Long>(new ComparatorAescending());
		PriorityQueue<Long> smllist = new PriorityQueue<Long>(new Comparatordescending());
		long mid=0;
		long temp=0;
		for(int i=0;i<n;i++) {
			Long num=Long.parseLong(bf.readLine());
			
			if(i==0) mid=num;
			else {
				if(mid>=num) {
					smllist.add(num);
				}
				else if(mid<num) biglist.add(num);
				
				
				if((biglist.size()+smllist.size()+1)%2!=0) {
					if(biglist.size()>smllist.size()) {
						temp=mid;
						mid=biglist.remove();
						smllist.add(temp);
						
					}
					
					else if(biglist.size()<smllist.size()){
						temp=mid;
						mid=smllist.remove();
						biglist.add(temp);
					}
				}
				else {
					if(biglist.size()<smllist.size()) {
						temp=mid;
						mid=smllist.remove(); 
						biglist.add(temp);
					}
				}
			}
			
			sb.append(mid+"\n");
		
		}
		
		System.out.println(sb);
		System.out.println(smllist+" "+biglist);
		
	
	}
}