package pr;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private int weight, height, rank=1;

	
	public Student(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getRank() {
		return rank;
	}

	
}
public class Main {
	public static void compare(Student s1, Student s2) {
		if(s1.getWeight()>s2.getWeight() && s1.getHeight()>s2.getHeight()) {
			s2.setRank((s2.getRank())+1);
		}
	}
	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		int number=scin.nextInt();
		ArrayList<Student> student=new ArrayList<Student>();
		for(int i=0;i<number;i++) {
			int weight=scin.nextInt();
			int height=scin.nextInt();
			Student s=new Student(weight, height);
			student.add(s);
		}
	
		for(int i=0;i<number;i++) {
			for(int j=0;j<number;j++) {
				if(i==j) continue;
				else compare(student.get(i), student.get(j));
			}
		}
		
		for(int i=0;i<number;i++) {
			System.out.print(student.get(i).getRank()+" ");
		}
		
			
	}
}