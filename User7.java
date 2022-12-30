import java.util.Scanner;
public class User7{
	public static void main (String[] args){
		int []arr={10,9,8,7,6,5,4,3,2,1,0};
		int target=2;
		int targetIndex=0;
		int searchCount=0;
		int medianIndex;
		int left=0;
		int right=arr.length-1;
		for(int i=0;i<3;i++){
			medianIndex=(right-left)/2+left;
			if(arr[medianIndex]==target){
				targetIndex=medianIndex;
				break;
			}
			searchCount++;
			if(target>arr[medianIndex])
				right=medianIndex;	
			else 
				left=medianIndex;
			System.out.printf("%d %d %d\n",right,left,medianIndex);
		}
		
		
		
		System.out.println("The postion is "+ targetIndex);
		System.out.println("searchCount"+ searchCount);
	}
}	