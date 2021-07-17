package EmployeeWage;

public class UC1 {

	public static void main(String[] args) {
		int its_present = 1;
		double empcheck = Math.floor(Math.random() *10 ) % 2;
		if (empcheck == its_present)
			System.out.print("Employee is present ");
		else
			System.out.print("Employee is absent ");

}
}