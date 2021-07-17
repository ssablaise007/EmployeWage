package EmployeeWage;

public class UC5 {

	public static final int fulltimehour = 1;
	public static final int parttimehour = 2;
	public static final int wageperhour = 20;
	public static void main(String[] args) {
		int workingdays = 20;
		int empHour = 0, empwage = 0, totalwage = 0;
		for (int day = 0; day < workingdays; day ++)
		{
			int empcheck = (int) Math.floor(Math.random() *10 ) % 3;
			switch (empcheck) 
			{
			case parttimehour: 
			empHour = 4;
			break;
			case fulltimehour: 
			empHour = 8;
			break;
			default:
			empHour = 0;
			}
			empwage = empHour * wageperhour;
			totalwage += empwage;
			System.out.println (+empwage);
			}
		System.out.println (totalwage);
		}
	}