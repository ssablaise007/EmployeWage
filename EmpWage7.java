package EmpWage8;

public class EmpWage7 {

			public static final int parttime = 1;
			public static final int fulltime = 2;
			public static final int wageperhour = 20;
			public static final int workingdays = 2;
			public static final int maxhoursinmomth =10;
		public static int EmpWage() {
			int empHour = 0,totalemphur = 0, totalworkingdays= 0;
			while (totalemphur <=  maxhoursinmomth && totalworkingdays <= workingdays) {
				totalworkingdays++;
			int empcheck = (int) Math.floor(Math.random() *10 ) % 3;
			switch (empcheck) {
			case parttime: 
				empHour = 4;
				break;
			case fulltime: 
				empHour = 8;
				break;
			default:
				empHour = 0;
			totalemphur += empHour;
			System.out.println( "Day"  +totalworkingdays+ "EmpHour" +empHour);
			}
			int totalEmpwage =  totalemphur*wageperhour ;
			System.out.println("TotalEmpwage" +totalEmpwage);
			return +totalEmpwage
			}
	public static void main(String[] args) {
				Empwage();
			}
			}
