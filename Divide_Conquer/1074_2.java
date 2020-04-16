package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void dc(int size, int r, int c, int ans) {
		if(size==2) {
			if(r==x && c==y) ANS=ans;
			else if(x==r && y==c+1) ANS=ans+1;
			else if(x==r+1 && y==c) ANS=ans+2;
			else if(x==r+1 && y==c+1) ANS=ans+3;

		}
		
	
		else if(size==N) {
		//	System.out.println(ans);
			if(x<size/2 && y<size/2) {
				//왼쪽 위
				dc(size/2,r,c, ans);
			}
			
			else if(x<size/2 && y>=size/2) {
				//오른쪽 위
				dc(size/2, r, c+size/2, ans+(size/2)*(size/2));
			}
			else if(x>=size/2 && y<size/2) {
				//왼쪽 아래
				dc(size/2, r+size/2, c, ans+2*(size/2)*(size/2));
			}
			else if(x>=size/2 && y>=size/2) {
				//오른쪽 아래
				dc(size/2, r+size/2, c+size/2, ans+3*(size/2)*(size/2));
			}
		}
		else {
			//System.out.println(ans);
			if(x%size<size/2 && y%size<size/2) {
				//왼쪽 위
				dc(size/2,r,c, ans);
			}
			
			else if(x%size<size/2 && y%size>=size/2) {
				//오른쪽 위
				dc(size/2, r, c+size/2, ans+(size/2)*(size/2));
			}
			else if(x%size>=size/2 && y%size<size/2) {
				//왼쪽 아래
				dc(size/2, r+size/2, c, ans+2*(size/2)*(size/2));
			}
			else if(x%size>=size/2 && y%size>=size/2) {
				//오른쪽 아래
				dc(size/2, r+size/2, c+size/2, ans+3*(size/2)*(size/2));
			}
		}

		
	}
	public static int ANS;
	public static int N;
	public static int x;
	public static int y;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		x=Integer.parseInt(st.nextToken());
		y=Integer.parseInt(st.nextToken());
		
		
		N=(int)Math.pow(2, N);

		dc(N, 0, 0,0);
		
		System.out.println(ANS);
		
		
	}
}


