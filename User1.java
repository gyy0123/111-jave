public class User1{
	public static void main (String[] args){
	int y;
	int count=0 ;
	int [] Iarr =new int [11];
	Iarr[0]=10;
	Iarr[1]=9;
	Iarr[2]=8;
	Iarr[3]=7;
	Iarr[4]=6;
	Iarr[5]=5;
	Iarr[6]=4;
	Iarr[7]=3;
	Iarr[8]=2;
	Iarr[9]=1;
	Iarr[10]=0;


	for(int i = 1; i < Iarr.length; i ++){
        y = Iarr[i];        
        int j = i - 1;
        while( j > -1 && y < Iarr[j]){
            Iarr[j+1] = Iarr[j];   
            j--;
			
        }
        Iarr[j+1] = y;    	 
		count++;		
    }   
		for (int x=0;x < Iarr.length;x++ ){
		System.out.println(">>"+Iarr[x]);
	}
	System.out.println("count>>"+count);
	}
	public static void add (int x){
		System.out.println("===>"+x);
	}
}	