
public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("33");
		}
		finally {
			System.out.println("End of the program");
		}
	}

}
