package java.ThursdayLab;

import java.util.Scanner;

public class Calculate_HRA {
    
	public static void main(String[] args) 
	{
		int salary,h,d,gs;
		String name;
		System.out.println("Enter employee Name"+"\n"+"Salary");
		try (Scanner sc = new Scanner(System.in)) {
			name=sc.nextLine();
			salary=sc.nextInt();
		}
		if(salary>1500)
		{
			h=20*salary/100;
			d=90*salary/100;
		}
		else
		{
			h=500;
			d=70*salary/100;
		}

		gs=h+d+salary;
		System.out.print("Name: "+name+"\n"+"Gross Salary"+gs);
		

	}

}