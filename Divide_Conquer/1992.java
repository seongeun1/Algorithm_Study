package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.StringTokenizer;

public class Main {
	
	public static void qurdtree(int x, int y,int size, int[][] list) {
		int check=list[x][y];
		boolean flag=true;
		for(int i=x;(i<x+size) && flag;i++) {
			for(int j=y;(j<y+size) && flag;j++) {
				if(check!=list[i][j]) flag=false;
			}
		}
		
		if(flag) System.out.print(check);
		else {
			System.out.print("(");
			qurdtree(x, y, size/2,list);   //분명히 왼위-오위-왼아-오아 순이라고 했는데 
			qurdtree(x,y+size/2,size/2,list); // 이렇게 해야만 올바른 답이 나온다
			qurdtree(x+size/2, y, size/2, list); // 내가 뭘 잘 못했을까?
			qurdtree(x+size/2,y+size/2,size/2,list);
			System.out.print(")");
		}
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		
		int[][] list=new int[num][num];
		for(int i=0;i<num;i++) {
			String line=bf.readLine();
			for(int j=0;j<num;j++) {
				list[i][j]=Integer.parseInt(line.substring(j,j+1));
			}
			System.out.println(Arrays.toString(list[i]));
		}
		qurdtree(0,0,num,list);
		
	}

}


