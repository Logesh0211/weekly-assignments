package week1day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; 
		int n=13;
		boolean flag=true;
		for(i=2;i<n;i++) {
			if(n%i==0){
             flag=false;		
			break;
			}
			}
		System.out.println(flag);
				
	}		
}