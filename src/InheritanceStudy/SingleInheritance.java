package InheritanceStudy;

public class SingleInheritance {

	public static void main(String[] args) {
		

		Mother M= new Mother();//creating object for mother
		Child C= new Child();//creating object for child
		
		M.eyes();//calling mother non static method
		C.play();//calling child non static method
		
		Child.school();//calling mother  static method
		Mother.smile();//calling child  static method
		
		C.eyes();
		C.play();
		Child.school();
		Child.smile();
	}

}
