package week1day2;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		System.out.println(sum);
		}
	

}
