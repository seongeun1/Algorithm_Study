package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String s=bf.readLine();
		StringTokenizer st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		int[][] score=new int[N+1][3];
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<3;j++) {
			score[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		

		int[][] process=new int[N+1][3];
		score[0][0]=score[0][1]=score[0][2]=process[0][1]=process[0][0]=process[0][2]=0;
		for(int i=0;i<N;i++) {
			process[i+1][0]=Math.min(process[i][1], process[i][2])+score[i+1][0];
			process[i+1][1]=Math.min(process[i][0], process[i][2])+score[i+1][1];
			process[i+1][2]=Math.min(process[i][1], process[i][0])+score[i+1][2];
		}
			
		int min=Math.min(Math.min(process[N][0],process[N][1]),process[N][2]);
		
		System.out.println(min);

	}
}
