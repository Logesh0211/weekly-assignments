package week1day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0,secNum=1,sum,i;
		int num=8;
		for(i=0;i<=num;i++) {
			System.out.println(firstNum);
		sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		
		}
		
		

	}

}