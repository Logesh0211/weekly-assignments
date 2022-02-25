package week1day2;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,6,7,8};
		Arrays.sort(arr);
			int sum1=0;
			for(int i=0;i<arr.length;i++){
				sum1=sum1+arr[i];
			}
				System.out.println("sum of elements :"+sum1);
				int sum2=0;
				for(int j=1;j<=8;j++){
				sum2=sum2+j;
				}
				System.out.println("sum of range:"+sum2);
				System.out.println("Missing Number:"+(sum2-sum1));
				}
		
			}

				

