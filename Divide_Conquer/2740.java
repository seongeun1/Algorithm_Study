package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());	

		int n1=Integer.parseInt(st.nextToken());
		int m1=Integer.parseInt(st.nextToken());
		int[][] mat1=new int[n1][m1];
		for(int i=0;i<n1;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<m1;j++) {
				mat1[i][j]=Integer.parseInt(st.nextToken());
			}
			System.out.println(mat1[i]);
		}

		int row=n1;

		st=new StringTokenizer(bf.readLine());
		int n2=Integer.parseInt(st.nextToken());
		int m2=Integer.parseInt(st.nextToken());
		int[][] mat2=new int[n2][m2];
		for(int i=0;i<n2;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<m2;j++) {
				mat2[i][j]=Integer.parseInt(st.nextToken());
			}
		}

		int col=m2;
		int[][] mat3=new int[row][col];
		int index=0;
		
		
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				int m=0;
				while(m<m1) {
					mat3[r][c]+=mat1[r][m]*mat2[m][c];
					m++;
				}
				System.out.print(mat3[r][c]+" ");
			}
			System.out.println("");
		}

	}

}


