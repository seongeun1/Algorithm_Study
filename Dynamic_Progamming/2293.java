package pr;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());

		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());

		int[] coin =new int[n];


		for(int i=0;i<n;i++) {
			coin[i]=Integer.parseInt(bf.readLine());
		}

		int[] number=new int[k+1];

		for(int i=0;i<k+1;i++) {
			int c=coin[0];
			if(i%c==0) number[i]+=1;

		}
		for(int t=1;t<n;t++) {
			int c=coin[t];
			for(int i=0;i<k+1;i++) {
				if(i>=c) number[i]=number[i]+number[i-c];
			}

		}


		System.out.println(number[k]);

	}
}
