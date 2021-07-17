package EmployeeWage;

import java.util.Random;

public class UC3 {

	public static void main(String[] args) {
		int empWageperhour = 20;
		 int fulltime = 1;
		 int parttime = 2;
		 int fulltimehour = 40;
		 int parttimehour = 20;
	 Random rand = new Random();
	 int rand_int1  = rand.nextInt(3);
	 double FullSal = empWageperhour * fulltimehour ;
	 double PartSal = empWageperhour * parttimehour ;
	 
			if (rand_int1 == fulltime)
			System.out.println("Salary of Fulltime Employee : "+FullSal);
			else if  (rand_int1 == parttime)
			System.out.println ("Salary of Parttime Employee : "+PartSal);
			else
		System.out.println("Employee is absent ");

	}
	
	}

