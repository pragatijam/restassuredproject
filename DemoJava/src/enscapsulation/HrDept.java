package enscapsulation;

import java.util.Scanner;

public class HrDept {
	
	private int salary=20000;
	
	public int getSalary() {
		Scanner sec=new Scanner(System.in);
		System.out.println("enter password:");
		String password=sec.nextLine();
		if(password.equals("PRAGATI"))
		return salary;
		else
			return(Integer)null;
		
	}
	

}

