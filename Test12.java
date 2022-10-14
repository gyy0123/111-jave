import java.util.Scanner;

public class Test12{
    public static void main(String[] args){
        int row= 0;
	    
		String star="*";
		while(row<5){	
		int x=4-row;
		  while(x>0){
				System.out.print(" ");
				x=x-1;
		}
			
			System.out.println(star);
			star=star+"**";
			row=row+1;
        }
	}
}