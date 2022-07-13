package myInterface;

public class Son implements Father,Mother  {

	public static void main(String[] args) 
	{
		
		Son s= new Son();
		s.bike();
		s.care();
		s.kindness();
		s.office();
		
		Father.money();
		Mother.money();
		
	}

	@Override
	public void care() 
	{
		System.out.println("care");
		
	}

	@Override
	public void kindness() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bike() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void office() 
	{
		// TODO Auto-generated method stub
		
	}

	

	

	
}
