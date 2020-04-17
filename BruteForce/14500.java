package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int[][] mtx;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		mtx=new int[n][m];
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<m;j++) {
				mtx[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		
		int O=11;
		int ans=0;
		for(int o=0;o<O;o++) {
			if(o==0) {
				for(int i=0;i<n;i++) {
					for(int j=0;j<m-3;j++) {
						int sans=mtx[i][j]+mtx[i][j+1]+mtx[i][j+2]+mtx[i][j+3];
						ans=Math.max(sans, ans);
					}
				}
			}
			
			else if(o==1) {
				for(int i=0;i<n-3;i++) {
					for(int j=0;j<m;j++) {
						int sans=mtx[i][j]+mtx[i+1][j]+mtx[i+2][j]+mtx[i+3][j];
					ans=Math.max(sans, ans);
					}
				}
			}
			
			
			if(o==2) {
				for(int i=0;i<n-1;i++) {
					for(int j=0;j<m-1;j++) {
						int sans=mtx[i][j]+mtx[i+1][j]+mtx[i][j+1]+mtx[i+1][j+1];
						ans=Math.max(sans, ans);
					}
				}
			}
	
			else if(o==3) {
				for(int i=0;i<n-2;i++) {
					for(int j=0;j<m-1;j++) {
						int sans=mtx[i][j]+mtx[i+1][j]+mtx[i+2][j]+mtx[i+2][j+1];
						ans=Math.max(sans, ans);
						sans=sans-mtx[i+2][j+1]+mtx[i][j+1];
						ans=Math.max(sans, ans);
					}
					
					for(int j=1;j<m;j++) {
						int sans=mtx[i][j]+mtx[i+1][j]+mtx[i+2][j]+mtx[i][j-1];
						ans=Math.max(sans, ans);
						sans=sans-mtx[i][j-1]+mtx[i+2][j-1];
						ans=Math.max(sans, ans);
					}
				}
				
			}
			
			else if(o==4) {
				for(int i=0;i<n-1;i++) {
					for(int j=0;j<m-2;j++) {
						int sans=mtx[i][j]+mtx[i][j+1]+mtx[i][j+2]+mtx[i+1][j];
						ans=Math.max(sans, ans);
						sans=sans-mtx[i+1][j]+mtx[i+1][j+2];
						ans=Math.max(sans, ans);
					}
				}
			}
			
			
			
			if(o==5) {
				for(int i=1;i<n;i++) {
					for(int j=0;j<m-2;j++) {
						int sans=mtx[i][j]+mtx[i][j+1]+mtx[i][j+2]+mtx[i-1][j];
						ans=Math.max(sans, ans);
						sans=sans-mtx[i-1][j]+mtx[i-1][j+2];
						ans=Math.max(sans, ans);
					}
				}
			}
			
			
			if(o==6) {
				for(int i=1;i<n-1;i++) {
					for(int j=0;j<m-1;j++) {
						int sans=mtx[i][j]+mtx[i][j+1]+mtx[i-1][j+1]+mtx[i+1][j];
						ans=Math.max(ans, sans);
						sans=sans-mtx[i-1][j+1]-mtx[i+1][j]+mtx[i-1][j]+mtx[i+1][j+1];
						ans=Math.max(ans, sans);
					}
				}
			}
			if(o==7) {
				for(int i=0;i<n-1;i++) {
					for(int j=1;j<m-1;j++) {
						int sans=mtx[i][j]+mtx[i+1][j]+mtx[i][j+1]+mtx[i+1][j-1];
						ans=Math.max(sans, ans);
						sans=sans-(mtx[i][j+1]+mtx[i+1][j-1])+mtx[i][j-1]+mtx[i+1][j+1];
						ans=Math.max(sans, ans);
					}
				}
			}
			
			if(o==8) {
				for(int i=1;i<n;i++) {//คว
					for(int j=0;j<m-2;j++) {
						int sans=mtx[i][j]+mtx[i][j+1]+mtx[i][j+2]+mtx[i-1][j+1];
						ans=Math.max(sans, ans);

					}
				}
				
				for(int i=0;i<n-1;i++) {//คฬ
					for(int j=0;j<m-2;j++) {
						int sans=mtx[i][j]+mtx[i][j+1]+mtx[i][j+2]+mtx[i+1][j+1];
						ans=Math.max(sans, ans);
					}
				}
				
			}
			
			if(o==9) {
				for(int i=0;i<n-2;i++) {
					for(int j=1;j<m;j++) {
						int sans=mtx[i][j]+mtx[i+1][j]+mtx[i+2][j]+mtx[i+1][j-1];
						ans=Math.max(sans, ans);
					}
				}
			}
			
			if(o==10) {
				for(int i=0;i<n-2;i++) {
					for(int j=0;j<m-1;j++) {
						int sans=mtx[i][j]+mtx[i+1][j]+mtx[i+2][j]+mtx[i+1][j+1];
						ans=Math.max(sans, ans);
					}
				}
			}
		}
		

		System.out.println(ans);
	}
}


