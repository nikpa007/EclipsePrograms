package TestPackage;

public class hr_portal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		study_const nikhil= new study_const();
		nikhil.employee_name="Nikhil Patil";
		nikhil.employee_id=21;
		nikhil.salary=25000.35f;
		nikhil.gender='M';
		
		nikhil.info();
		
		study_const vishal=new study_const();
		vishal.employee_name="Vishal D";
		vishal.employee_id=12;
		vishal.salary=25000.325f;
		vishal.gender='M';
		
		vishal.info();
	}

}
