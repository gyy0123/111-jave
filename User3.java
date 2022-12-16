public class User3{
public static void main (String[] args){
int tmp,z=0;
int [] myArr={7,5,4,8,1,2};
	
	for(int y=5;y>2;y--){
		tmp=myArr[y];
		myArr[y]=myArr[z];
		myArr[z]=tmp;
	    z++;
	}
	for (int i=0;i<myArr.length;i++){
	System.out.println(myArr[i]);
	}
}
} 