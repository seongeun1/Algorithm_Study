package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int fnum=0;
	public static int R, C, K;
	public static void find(int N,int r,int c) {
		if(N==2) {
			if(R==r && C==c) {
			}
			else if(R==r && C==c+1) {
				fnum=fnum+1;	
			}
			else if(R==r+1 && C==c) {
				fnum=fnum+2;
			}
			else {
				fnum=fnum+3;
			}
		}
		else if(N==K){ //��ü ũ�⿡���� N�� �������� ��Ƶ� ������, �� ���� ��ͷ� ���� ������ �޶�����. 

			if(R<N/2 && C<N/2) { //4��� �� ���� �� ����
				find(N/2, r, c);
			}
			else if(R>=N/2 && C<N/2) { //4��� �� ���� �Ʒ� ����
				fnum=fnum+2*(N/2)*(N/2);
				find(N/2, r+N/2, c);
			}
			else if(R<N/2 && C>=N/2) { //4��� �� ������ �� ����
				fnum=fnum+(N/2)*(N/2);
				find(N/2, r, c+N/2);
			}
			else if (R>=N/2 && C>=N/2){ //4��� �� ������ �Ʒ� ����
				fnum=fnum+3*(N/2)*(N/2);
				find(N/2, r+N/2, c+N/2);
			}
			
			
		}
		else {//��ͷ� ������ ��, N/2�� R, C�� ���������� �񱳰� �Ұ����ϴ�.
			if(R%N<N/2 && C%N<N/2) { //4��� �� ���� �� ����
				find(N/2, r, c);
			}
			else if(R%N>=N/2 && C%N<N/2) { //4��� �� ���� �Ʒ� ����
				fnum=fnum+2*(N/2)*(N/2);
				find(N/2, r+N/2, c);
			}
			else if(R%N<N/2 && C%N>=N/2) { //4��� �� ������ �� ����
				fnum=fnum+(N/2)*(N/2);
				find(N/2, r, c+N/2);
			}
			else if (R%N>=N/2 && C%N>=N/2){ //4��� �� ������ �Ʒ� ����
				fnum=fnum+3*(N/2)*(N/2);
				find(N/2, r+N/2, c+N/2);
			}
		}

	}
	
	public static void main(String[] args) throws Exception {
	
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		R=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		
		
		N=(int)Math.pow(2, N);
		K=N;
		
		find(N, 0, 0);
		System.out.println(fnum);
		
		
		
	}

}