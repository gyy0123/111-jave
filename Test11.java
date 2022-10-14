import java.util.Scanner;

public class Test9{
    public static void main(String[] args){
        int row= 0;
	    int x;
		
		while(row<9){
			x=row;
			if(row>=5)
			{
			x=8-row	;
			}
			int star=0;
			while (star<=x){
				System.out.print("*")	;
			star=star+1;
			
			}
			System.out.println("");
			row=row+1;
			x=x+2;
		}
        
	}
}