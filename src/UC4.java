package EmployeeWage;

import java.util.Random;

public class UC4 {

	public class UC4_case {

		public static void main(String[] args) { 
			int empWageperhour = 20;
			 int fulltimehour = 12;
			 int parttimehour = 8;
		 Random rand = new Random();
		 int rand_int1  = rand.nextInt(3);
		 double FullSal = empWageperhour * fulltimehour ;
		 double PartSal = empWageperhour * parttimehour ;
		  String dayString;
			switch(rand_int1) {
				case 1:
					dayString = "Total Salary of Fulltime Employee : " +FullSal ;
					break;
				case 2:
					dayString = "Total Salary of Parttime Employee : " +PartSal ;
					break;
				default :
					dayString = "Employee Absent ";
			}
		System.out.println(dayString);
		}
	}

}
