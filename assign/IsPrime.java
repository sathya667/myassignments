package week1.assign;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=13;
		for (int i = 2; i <=number; i++) {
			if (i%2!=0) {
				System.out.println("Prime number:"+i);			
			}
			else
			{
				System.out.println("Not prime number:"+i);
			}
		}
		

	}

}
