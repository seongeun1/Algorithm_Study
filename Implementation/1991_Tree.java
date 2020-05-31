package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Point{
	int left;
	int right;
	public Point(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
}




public class Main {	
	
	public static void inorder(int x) {
		if(x==-1) return;
		inorder(p[x].left);
		sb1.append((char)(x+'A'));
		inorder(p[x].right);
	}
	
	public static void postorder(int x) {
		if(x==-1) return;
		postorder(p[x].left);
		postorder(p[x].right);
		sb2.append((char)(x+'A'));
	}
	
	public static void preorder(int x) {
		if(x==-1) return;
		sb3.append((char)(x+'A'));
		preorder(p[x].left);
		preorder(p[x].right);
	}
	
	public static Point[] p;
	public static StringBuffer sb1=new StringBuffer();
	public static StringBuffer sb2=new StringBuffer();
	public static StringBuffer sb3=new StringBuffer();

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		
		p=new Point[26];
		int N=Integer.parseInt(bf.readLine());
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			int a=st.nextToken().charAt(0)-'A';
			char b=st.nextToken().charAt(0);
			char c=st.nextToken().charAt(0);
			int left=-1;
			int right=-1;
			if(b!='.') left=b-'A';
			if(c!='.') right=c-'A';
			p[a]=new Point(left, right);
		}
		
		preorder(0);
		inorder(0);
		postorder(0);
		
		System.out.println(sb3+"\n"+sb1+"\n"+sb2);

		
		
	}

}