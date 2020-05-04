package pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static int N;
	public static int L;
	public static int R;
	public static int X;

	public static ArrayList<Character> route;
	public static int ans=0;

	static int[] mtx;
	static int[] check;
	static boolean[] visit;
	static int sans;
	static ArrayList<Integer> ar=new ArrayList<>();
	public static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st=new StringTokenizer(bf.readLine());
		
		N=Integer.parseInt(st.nextToken());
		L=Integer.parseInt(st.nextToken());
		R=Integer.parseInt(st.nextToken());
		X=Integer.parseInt(st.nextToken());
		
		mtx=new int[N];
		check=new int[N];
		visit=new boolean[N];
		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			mtx[i]=Integer.parseInt(st.nextToken());
		}
		
		dfs(0, -1);
		System.out.println(ans);
		
	}

	public static void dfs(int cnt, int idx) {
		
		if(cnt>=2) {
			if(check1(cnt)) {
				
				ans++;
			}
		}

		if(cnt==N) return;
		
		
		for(int i=idx+1;i<N;i++) {
			if(visit[i]==true) continue;
			visit[i]=true;
			check[cnt]=mtx[i];
			dfs(cnt+1, i);
			check[cnt]=0;
			visit[i]=false;
		}
		
		
		
		return;
		
	}

	public static boolean check1(int size) {

		int max=1, min=Integer.MAX_VALUE;
		int sum=0;
//		System.out.println(Arrays.toString(check));
		for(int i=0;i<size;i++) {
			
//			System.out.println(check[i]);
			max=Math.max(check[i],max);
			min=Math.min(check[i], min);
			sum+=check[i];
		}
//		System.out.println(max+" "+min);
		if(sum>R) {
//			System.out.println("R"+Arrays.toString(check));
			return false;
		}
		if(sum<L) {
//			System.out.println("L"+Arrays.toString(check));
			return false;
		}

		if(max-min<X) {
//			System.out.println("X"+Arrays.toString(check));
			return false;
		
		}
		
		
		return true;
	}

}