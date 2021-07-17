package EmployeeWage;

public class UC2 {

	public static void main(String[] args) {
		int its_present = 1;
		int wageperhour = 20;
		int empHour = 0;
		int empWage = 0;
		double empcheck = Math.floor(Math.random() *10 ) % 2;
		// *** Here : We Calculate the employee wage by using employee hour  
		if (empcheck == its_present)
			empHour =8;
			else
				System.out.println("Employee is Absent ");
			empWage = empHour*wageperhour;
	System.out.println ("Employee Wage :"+empWage);

}
}
