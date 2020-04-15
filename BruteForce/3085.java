package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static int check1() {
		int max=0;
		int m=0;
		char O;
		for(int i=0;i<N;i++) {
			m=1;
			O=s[i][0];
			for(int j=1;j<N;j++) {
				if(s[i][j-1]==s[i][j] && s[i][j]==O) {
					m++;
					max=Math.max(max, m);
				}
				if(s[i][j]!=O) {
					O=s[i][j];
					m=1;
				}
			}

		}


		return max;
	}


	public static int check2() {
		int max=0;
		int m=0;
		char O;
		for(int j=0;j<N;j++) {
			m=1;
			O=s[0][j];
			for(int i=1;i<N;i++) {
				if(s[i-1][j]==s[i][j] && s[i][j]==O) {
					m++;
					max=Math.max(max, m);
				}
				if(s[i][j]!=O) {
					O=s[i][j];
					m=1;
				}
			}

		}


		return max;
	}


	public static int N;
	public static char[][] s;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		N=Integer.parseInt(bf.readLine());
		s=new char[N][N];
		int max=0;
		for(int i=0;i<N;i++) {
			String st=(bf.readLine());
			for(int j=0;j<N;j++) {
				s[i][j]=st.charAt(j);
			}
		}

		char temp;

		for(int i=1;i<N-1;i++) {
			for(int j=0;j<N;j++) {
				temp=s[i][j];

				//위
				s[i][j]=s[i-1][j];
				s[i-1][j]=temp;
				max=Math.max(check1(), Math.max(check2(), max));
				s[i-1][j]=s[i][j];
				s[i][j]=temp;

				//아래
				s[i][j]=s[i+1][j];
				s[i+1][j]=temp;
				max=Math.max(check1(), Math.max(check2(), max));
				s[i+1][j]=s[i][j];
				s[i][j]=temp;


				if(j!=N-1) {

					//오른쪽
					s[i][j]=s[i][j+1];
					s[i][j+1]=temp;
					max=Math.max(check1(), Math.max(check2(), max));
					s[i][j+1]=s[i][j];
					s[i][j]=temp;

				}

				else if(j!=0){
					//왼쪽
					s[i][j]=s[i][j-1];
					s[i][j-1]=temp;
					max=Math.max(check1(), Math.max(check2(), max));
					s[i][j-1]=s[i][j];
					s[i][j]=temp;

				}
			}
		}

		//first row
		for(int j=0;j<N;j++) {
			temp=s[0][j];
			//아래
			int i=0;
			s[i][j]=s[i+1][j];
			s[i+1][j]=temp;
			max=Math.max(check1(), Math.max(check2(), max));
			s[i+1][j]=s[i][j];
			s[i][j]=temp;

			if(j!=N-1) {
				//오른쪽
				s[i][j]=s[i][j+1];
				s[i][j+1]=temp;
				max=Math.max(check1(), Math.max(check2(), max));
				s[i][j+1]=s[i][j];
				s[i][j]=temp;
			}
			else if(j!=0){
				//왼쪽
				s[i][j]=s[i][j-1];
				s[i][j-1]=temp;
				max=Math.max(check1(), Math.max(check2(), max));
				s[i][j-1]=s[i][j];
				s[i][j]=temp;

			}


		}

		//Last row
		for(int j=0;j<N;j++) {
			temp=s[N-1][j];
			//위
			int i=N-1;
			s[i][j]=s[i-1][j];
			s[i-1][j]=temp;
			max=Math.max(check1(), Math.max(check2(), max));
			s[i-1][j]=s[i][j];
			s[i][j]=temp;

			if(j!=N-1) {
				//오른쪽
				s[i][j]=s[i][j+1];
				s[i][j+1]=temp;
				max=Math.max(check1(), Math.max(check2(), max));
				s[i][j+1]=s[i][j];
				s[i][j]=temp;
			}
			else if(j!=0){
				//왼쪽
				s[i][j]=s[i][j-1];
				s[i][j-1]=temp;
				max=Math.max(check1(), Math.max(check2(), max));
				s[i][j-1]=s[i][j];
				s[i][j]=temp;

			}

		}
		
		System.out.println(max);
	}
}


