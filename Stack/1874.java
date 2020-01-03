package pr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		StringBuffer sb=new StringBuffer();
		int[] list=new int[num];
		for(int i=0;i<num;i++) {
			list[i]=Integer.parseInt(bf.readLine());
		}
		//System.out.println(Arrays.toString(list));
		Stack<Integer> stack=new Stack<>();
		int index=0; boolean flag=true;
		for(int i=1;i<num+1;i++) {
			
			if(list[index]!=i) {
				stack.push(i);
				sb.append("+\n");
			}
			
			if(list[index]==i) {
				stack.push(i);
				sb.append("+\n");
				index++;
				stack.pop();
				sb.append("-\n");
			}
			
			if(!stack.isEmpty() &&stack.peek()>list[index]) {
				flag=false;
				break;
			}
			
			while(!stack.isEmpty() && list[index]==stack.peek()) {
				if(!stack.isEmpty() && stack.peek()>list[index]) {
					flag=false;
					break;
				}
				stack.pop();
				sb.append("-\n");
				index++;
				if(index==num) break;
				
			}
		}
		while(!stack.isEmpty()) {
			stack.pop();
			sb.append("-\n");
		}
		if(!flag) System.out.println("NO"); 
		else if(stack.isEmpty()) System.out.println(sb);
	}

}


