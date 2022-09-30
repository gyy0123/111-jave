import java.util.Scanner;
public class Test3 {
    public static void main(String[] args){
	    int num1 ;
    
        Scanner input = new Scanner (System.in);
    
        System.out.println("Enter first integer:");
        num1=input.nextInt(); 
        
        if(num1>=60){       
	    System.out.println("good");
	}  
         if(num1<60){       
	    System.out.println("bad!!");
	}  
       }
            public static void printStr(int str){

    		System.out.println(str);
}
}