package LoopStudy;

public class ForLoopReverse {

	public static void main(String[] args) {
		
		int a=569;
		int b;// remainder after division
		int c=0;//final answer
		
		while(a>0)
		{
			b=a%10;// 9---6---5
			c=(c*10)+b;// 9--96---965
			a=a/10;// 56---5---0
			
		}
		System.out.println(c);
	}
	
	
}
