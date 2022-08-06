
public class MulipleBlockExample {

	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int c=a/b;
			
		}
		catch(ArithmeticException Exception)
		{
		    Exception.printStackTrace();
			System.out.println("22");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("11");
		}

	}

}
