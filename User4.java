public class User4{
public static void main (String[] args){
int tmp,max=0,min=10,ave=0,mid=4,y,z=0;
int [] myArr={7,5,4,9,8,1,2};
int [] flag_arr =new int [myArr.length];	
int flag_count=0;
int flag_min=10;
	for (int x=0;x < myArr.length;x++ ){
	
	if (myArr[x]>max){
		max =myArr[x];
	}
	if (myArr[x]<min){
		min=myArr[x];	
	}	
	y=myArr[x];
	ave=ave+y;
	for(int j=0;j<myArr.length;j++){
	if (flag_arr[j]==0&&myArr[j]<flag_min){
		flag_min=myArr[j];
		flag_arr[j]=flag_count;
		flag_count++;
	}
		if(flag_count==4)
			break;
		}	
}
	
	for (int i=0;i<myArr.length;i++){
	System.out.print(myArr[i]);
	}
	System.out.println("");
	System.out.println(max);
	System.out.println(min);
	System.out.println(ave/6);
	System.out.println(mid);
	
	
}
}