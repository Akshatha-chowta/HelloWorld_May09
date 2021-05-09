package test;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=5;
		while(index>0) {
			if(index!=3)
			System.out.println(index);
			index=index-1;
			
		}
		System.out.println("--------------");
		int index1=5;
		while(index1>0) {
			if(index1==3) {
				break;
			}
			System.out.println(index1);
			index1--;
			
		}
		//do while---------------
		System.out.println("-----------------------");
		int index2=1;
		do {
			System.out.println(index2);
			index2++;
			
		}while(index2<11);
		//for loop-------------------
		System.out.println("-----------------------");
		int index4;
		for(index4=1;index4<11;index4++)
		{
			System.out.println(index4);
		}
		int myarray[]= {10,20,30,40,50};
		for(int i=0;i<myarray.length;i++)
		{
			System.out.println(myarray[i]);
		}
		}
	

}
