package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void dfs(int x, int y) {
		list[x][y]=1;
		//x=m
		//y=n
		//�Ʒ�
		if(x+1<m && mtx[x+1][y]==1 && list[x+1][y]==0) {
		
			dfs(x+1, y);
		}
		//������
		if(y+1<n && mtx[x][y+1]==1 && list[x][y+1]==0) {
		
			dfs(x, y+1);
		}
		//����
		if(y-1>=0 && mtx[x][y-1]==1 && list[x][y-1]==0) {
		
			dfs(x, y-1);
		}
		
		//����
		if(x>0 && mtx[x-1][y]==1 && list[x-1][y]==0) {
			
			dfs(x-1, y);
		}
		
		//���޴밢��
		if(x-1>=0 && y-1>=0 && mtx[x-1][y-1]==1 && list[x-1][y-1]==0) {
			dfs(x-1, y-1);
		}
		
		//�Ʒ��޴밢��
		if(x+1<m && y-1>=0 && mtx[x+1][y-1]==1 && list[x+1][y-1]==0) {
			dfs(x+1, y-1);
		}
		//�������밢��
		if(x-1>=0 && y+1<n && mtx[x-1][y+1]==1 && list[x-1][y+1]==0) {
			dfs(x-1, y+1);
		}
		//�Ʒ� ���� �밢��
		if(x+1<m && y+1<n && mtx[x+1][y+1]==1 && list[x+1][y+1]==0) {
			dfs(x+1, y+1);
		}
	}
	
	


	public static int n;
	public static int m;
	

	
	public static int[][] list;
	public static int[][] mtx ;
	
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(bf.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		while(n!=0 && m!=0) {
			mtx=new int[m][n];
			list=new int[m][n];
			
			for(int i=0;i<m;i++) {
				st=new StringTokenizer(bf.readLine());
				for(int j=0;j<n;j++) {
					mtx[i][j]=Integer.parseInt(st.nextToken());
				}
			}
		
			int ans=0;
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++){
					if(list[i][j]==0 && mtx[i][j]==1) {
						dfs(i, j);
						ans++;
					}
				}
			}
			
			sb.append(ans+"\n");
			st=new StringTokenizer(bf.readLine());
			n=Integer.parseInt(st.nextToken());
			m=Integer.parseInt(st.nextToken());
		}

		System.out.println(sb);
		
	}
	
}


