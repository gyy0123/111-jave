import java.util.Scanner;

public class Test5{
    public static void main(String[] args){
        int grade ;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter first integer");
		grade = input.nextInt();
		if(grade>=90 & grade<=100){
			System.out.println("A");
		}
		if(grade>=80 & grade<=89){
			System.out.println("B");
		}
		if(grade>=70 & grade<=79){
			System.out.println("C");
		}
		if(grade>=60 & grade<=69){
			System.out.println("D");
		}
		if(grade<=59){
			System.out.println("E");
		}

}
}