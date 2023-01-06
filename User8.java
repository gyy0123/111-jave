public class User8{
	public static void main(String[] args){
		int [] arr ={1,2,3,4,5,6,7};
		int x =10;
		int y = x;
		
		setVariable(x);
		System.out.println("setVariable"+x);
		
		setAttay(arr);
		for (int i:arr )
			System.out.println("setAttay"+i);
	
	}
	public static void setVariable(int x){
		x=20;
	
	}
	public static void setAttay(int arr[]){
		arr[0]=20;
	}
}