public class User{
	public static void main (String[] args){
	int y,count=0;
	int [] Iarr =new int [5];
	Iarr[0]=7;
	Iarr[1]=3;
	Iarr[2]=4;
	Iarr[3]=9;
	Iarr[4]=6;
	
	for (int x=0;x < Iarr.length;x++ ){
		for(int z =0 ;z <Iarr.length ;z++){
		if(Iarr[x]<Iarr[z]){
		y=Iarr[x];
		Iarr[x]=Iarr[z];
		Iarr[z]=y;
			
			}
		count++;
		}
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