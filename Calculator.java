package week1day2;

public class Calculator {
	public int add(int num1,int num2,int num3){
		int sum=num1+num2+num3;
		System.out.println(sum);
		return sum;
		
	}
	public int sub(int num1,int num2){
		int sub=num1-num2;
		System.out.println(sub);
		return sub;
		}
	public double mul(double num1,double num2) {
		double mul= num1*num2;
		System.out.println(mul);
		return mul;
		}
	public float div(float num1,float num2) {
		float div=num1/num2;
		System.out.println(div);
		return div;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		cal.add(0, 3, 5);
		cal.sub(7, 5);
		cal.mul(7, 7);
		cal.div(8, 4);
		
		
	}

}
