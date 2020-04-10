package pr;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Integer> stack1=new Stack<Integer>();
		int N=Integer.parseInt(bf.readLine());
		String a="";
		String b="";
		StringTokenizer st;
		int aa=0;
		int bb=0;
		int n=0;
		
		char bbb;
		char aaa;
		int flag;
		String s;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(bf.readLine());
			a=st.nextToken();
			b=st.nextToken();
			flag=0;
			s="";
			
	
			if(a.length()<b.length()) n=a.length();
			else n=b.length();

			aa=a.length()-1;
			bb=b.length()-1;
			
			for(int j=0;j<n && aa>=0 && bb>=0;j++) {
				
				aaa=a.charAt(aa--);
				bbb=b.charAt(bb--);


				if(stack1.empty()) {
					if(aaa=='1' && bbb=='1') {
						stack1.push(1);
						s="0"+s;
						flag=1;
					}
					else if((aaa=='1' && bbb=='0')||(aaa=='0' && bbb=='1')) {
						s="1"+s;
						flag=1;
					}
					else if((aaa=='0' && bbb=='0')) {
						s="0"+s;
					}
				}
				else {
					if(aaa=='1' && bbb=='1') {
						stack1.pop();
						stack1.push(1);
						flag=1;

						s="1"+s;
					}
					else if((aaa=='1' && bbb=='0')||(aaa=='0' && bbb=='1')) {
						stack1.pop();
						stack1.push(1);
						flag=1;
						s="0"+s;
					}
					else if((aaa=='0' && bbb=='0')) {
						stack1.pop();
						s="1"+s;
					}
				}


			}

			while(aa>=0) {
				if(stack1.empty()) {
					if(a.charAt(aa)=='1') {
						s='1'+s;
						aa=-1;
						flag=1;
					}
					else {
						s='0'+s;
						bb=-1;
					}
				}
				else {
					if(a.charAt(aa)=='1') {
						stack1.pop();
						stack1.push(1);
						s="0"+s;
					}
					else {
						stack1.pop();
						s="1"+s;
					}
					aa--;
				}
			}
			
			
			while(bb>=0) {
				if(stack1.empty()) {
					if(b.charAt(bb)=='1') {
						s='1'+s;
						bb=-1;
						flag=1;
					}
					else {
						s='0'+s;
						bb=-1;
					}
				
				}
				else {
					if(b.charAt(bb)=='1') {
						stack1.pop();
						stack1.push(1);
						s="0"+s;
					}
					else {
						stack1.pop();
						s="1"+s;
					}
					bb--;
				}
			}
			
			
			if(!stack1.empty()) {
				s=stack1.pop()+s;
			}
			
			
			
			if(flag==0) s="0";
			for(int j=0;;j++) {
				if(s.charAt(j)=='0') s=s.substring(1);
				else break;
			}

			bw.write(s+"\n");
		}

		bw.flush();
	}
}
