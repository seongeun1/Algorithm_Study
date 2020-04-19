package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main {
	public static void dfs(int day, int sum) {
		
		if(day==n) {
	
			ans=Math.max(ans,  sum);
			return ;
		}
		else if(day>n) return;
		else {
			//����� �ϴ� ���
			dfs(day+mtx[day][0], sum+mtx[day][1]);
			dfs(day+1, sum);
		}
		
		
		
	}
	
	//������ ã�� ��� : day=n;
	//�Ұ����� ��� : day>n�� ��� 
	
	//���� ��� ȣ��
	
	/// ����� �ϴ� ��� 
	/// ����� ���� �ʴ� ��� 
	
	public static int n;
	public static int m;

	public static int[][] mtx;
	public static int[] list;

	public static int ans=0;
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n=Integer.parseInt(bf.readLine());
		mtx=new int[n][2];
		list=new int[n];
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<2;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		
		dfs(0,0);
	
		System.out.println(ans);
	}
}


