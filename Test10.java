import java.util.Scanner;

public class Test10{
    public static void main(String[] args){
        int row= 4;
	      int x= 0;
	    
		while(x<4){
			int star=0;
			while (star<=x){
				System.out.print("*")	;
			star=star+1;
			}
			System.out.println("");
			x=x+1;
		}
        
		while(row>=0){
			int star=0;
			
			while (star<=row){
				System.out.print("*")	;
			star=star+1;
			} 	
			System.out.println("");
		row=row-1;
         
			 
			 
			 }
		
		}
		
		
	}



