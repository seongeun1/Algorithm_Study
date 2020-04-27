package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int N=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		
		int[][] medal=new int[N+1][4];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			int a=Integer.parseInt(st.nextToken());
			int g=Integer.parseInt(st.nextToken());
			int s=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			medal[a][0]=g;
			medal[a][1]=s;
			medal[a][2]=c;
			
		}
		
		for(int i=1;i<N+1;i++) {
			for(int j=1;j<N+1;j++) {
				if(i==j) continue;
				if(medal[i][0]>medal[j][0]) medal[j][3]++;
				else if(medal[i][0]<medal[j][0]) medal[i][3]++;
				else if(medal[i][0]==medal[j][0]) {
					if(medal[i][1]>medal[j][1]) medal[j][3]++;
					else if(medal[i][1]<medal[j][1]) medal[i][3]++;
					else if(medal[i][1]==medal[j][1]) {
						if(medal[i][2]>medal[j][2]) medal[j][3]++;
						else if(medal[i][2]<medal[j][2]) medal[j][3]++;
						else {
							medal[i][3]++;
							medal[j][3]++;
						}
					}
				}
			}
		}
		
		
		int count=1;
		for(int i=1;i<N+1;i++) {
			if(i==S) continue;
			if(medal[i][3]<medal[S][3]) count++; 
		}
	
		System.out.println(count);
		
		
	}

}