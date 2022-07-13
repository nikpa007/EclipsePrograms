package InheritanceStudy;


public class MultilevelInheritance {

	public static void main(String[] args) {
		
		GrandMother gm= new GrandMother();
		gm.stories();
		GrandMother.recipe();// static - Super most class
		
		Mother mm= new Mother();
		mm.eyes();
		mm.stories();
		Mother.smile();// static - super class
		
		
		Child ch= new Child();
		ch.play();
		ch.eyes();
	    ch.stories();
		Child.school(); // static - own 
		Child.smile(); // static - mother
	
	}

}
