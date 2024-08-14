package first;

import java.util.Scanner;

public class firstclass {
	
	Scanner s;
	int regno;
	String name, dept;
	
	void input(){
		s = new Scanner(System.in);
		System.out.print("Enter Regno: ");
		regno = s.nextInt();
		System.out.print("Enter Name: ");
		name = s.next();
		System.out.print("Enter Dept: ");
		dept = s.next();
	}
	
	void display(){
		System.out.println("Regno: " +regno);
		System.out.println("Name: " +name);
		System.out.println("Dept: " +dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstclass f = new firstclass();
		f.input();
		f.display();

	}

}
