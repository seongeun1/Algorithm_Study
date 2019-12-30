package pr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(bf.readLine());
	int num=Integer.parseInt(st.nextToken());
	int total=Integer.parseInt(st.nextToken());
	
	
	int[] coin=new int[num];
	int[] choice=new int[num];
	for(int i=0;i<num;i++) {
		coin[i]=Integer.parseInt(bf.readLine());
	}
		
	int i=num-1;
	
	while(total!=0) {
		if(total-coin[i]>0) {
			choice[i]++;
			total-=coin[i];
		}
		else if(total-coin[i]==0) {
			choice[i]++;
			total-=coin[i];
		}
		else if(total-coin[i]<0) {
			i--;
		}
		//System.out.println(Arrays.toString(choice));
	}
	
	int sum=0;
	
	for(int j=0;j<num;j++) {
		sum+=choice[j];
	}
	System.out.println(sum);
	}
}


