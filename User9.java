public class User9{
	public static void main(String[] args){
		int x=10;
		int y=x;
		y=20;
		
		System.out.println("Variable:x"+x);
		
		System.out.println("Variable:y"+y);
		
		int []arr={1,2,3,4,5};
		int []arr2=arr;
		arr2[0]=20;
		
		System.out.println("Variable:arr[0]"+arr[0]);
		
		System.out.println("Variable:arr2[0]"+arr2[0]);
		
	}
}