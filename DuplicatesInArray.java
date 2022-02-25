package week1day2;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int arrayLength=arr.length;
		for(int i=0;i<arr.length-1;i--) {
			int count=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count=count+1;
		if(count>0) {
				System.out.println(arr[i]);
			}
		}
		

	}
	}
}


