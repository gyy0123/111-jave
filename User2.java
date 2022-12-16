public class User2{
int tmp;
int [] myArr={7,5,4,8,1,2};
	for(int y=5;y>=0;y--){
		myArr[y]=tmp;
		myArr[y]=myArr[y-1];
		myArr[y-1]=tmp;
	}
	for (int i=0;i<myArr.length;i++){
	System.out.println(myArr[i]);
	}
}