public class PartTimeWageUC3{
	public static void main(String args[]){

		int present_fulltime = 1, present_parttime = 2, work_hours = 0;
		int perhour_wage = 20;
		int checkEmp = (int) (Math.random() * 10) % 3;
		
		switch (checkEmp){
			case present_fulltime:
				work_hours = 8;
				break;
			case present_parttime:
				work_hours = 4;
				break;
			default:
				work_hours = 0;		
		}
		
		int wages = perhour_wage * fullday_hours;
		System.out.println("The Employee wages are " + wages);
	}
}