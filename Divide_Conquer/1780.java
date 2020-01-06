package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//import java.util.StringTokenizer;

public class Main {
	public static int negative=0;
	public static int positive=0;
	public static int zero=0;
	public static void qurdtree(int x, int y,int size, int[][] list) {
		int check=list[x][y];
		boolean flag=true;
		for(int i=x;(i<x+size) ;i++) {
			for(int j=y;(j<y+size);j++) {
				if(check!=list[i][j]) {
					flag=false;
					break;
				}
				
				
			}
		}
		
		if(flag && check==0) zero++;
		
		else if(flag && check==1) positive++;
		else if(flag && check==-1) negative++;
		else {
			size=size/3;
			qurdtree(x, y, size,list);   
			qurdtree(x,y+size,size,list); 
			qurdtree(x,y+2*size,size,list);
			qurdtree(x+size, y, size, list); 
			qurdtree(x+size,y+size,size,list);
			qurdtree(x+size,y+2*size,size,list);
			qurdtree(x+2*size,y,size,list);
			qurdtree(x+2*size,y+size,size,list);
			qurdtree(x+2*size,y+2*size,size,list);

		}
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		
		int[][] list=new int[num][num];
		for(int i=0;i<num;i++) {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			for(int j=0;j<num;j++) {
				list[i][j]=Integer.parseInt(st.nextToken());
			}
			System.out.println(Arrays.toString(list[i]));
		}
		qurdtree(0,0,num,list);
		System.out.println(negative);
		System.out.println(zero);
		System.out.println(positive);
	}

}


