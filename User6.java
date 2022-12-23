import java.util.Scanner;
public class User6{
public static void main (String[] args){
	int tmp,max=0,min=10,med=0,y,w=0;
	float ave=0;
	int [] myArr={7,5,4,9,8,1,2};
	int [] flag =new int [myArr.length];
	int flag_count=1;	
	int []z=new int [2];
	for (int x=0;x < myArr.length;x++ ){
	
		if (myArr[x]>max){
			max =myArr[x];
		}
		if (myArr[x]<min){
			min=myArr[x];	
		}	
		y=myArr[x];
		ave=ave+y;
	}
	Scanner input =new Scanner(System.in);
	y= input.nextInt();
		for (int i=0;i<y;i++){
		int flag_min=1000;	
		int flag_min_index=0;
		for (int j=0;j<myArr.length;j++){	
			if(myArr[j]<flag_min&&flag[j]==0){		
				flag_min=myArr[j];
				flag_min_index= j;
			}
		}
		
		flag[flag_min_index]=flag_count;
		flag_count++;
		med = myArr[flag_min_index];
	}				
		System.out.println("");
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("ave: " + ave/7);
		System.out.println("med: " + med);
}	
	
}