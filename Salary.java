package java.ThursdayLab;

import java.util.Scanner;

public class Salary 
{

	public static void main(String[] args)
	{
		int salary,i;
		String name;
		System.out.println("Enter employee Name"+"\n"+"Salary"+"\n"+"Served years");
		try (Scanner ch = new Scanner(System.in)) {
            name=ch.nextLine();
            salary=ch.nextInt();
            i=ch.nextInt();
        }
		if(i>3)
		{
			salary=salary+2500;
			System.out.println("Salary hiked");
		}
		else
		{
			System.out.println("Employee has to work more for hike ");
		}
		System.out.println("Name :"+name+"\n"+"Salary :"+salary+"\n"+"Served years "+i);
		
	

	}

}