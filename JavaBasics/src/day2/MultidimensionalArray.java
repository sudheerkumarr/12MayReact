package day2;

public class MultidimensionalArray {

	public static void main(String[] args) {
		//int[][] intArr = {{row1}, {row2}, {row3}};
		//int[][] intArr = new int[3][3];
		//int[][] intArr = new int[][]{{10,20,30},{40, 50, 60},{70,80,90}};
		int[][] intArr = {{10, 20, 30},{40, 50, 60},{70,80,90}};
		
		// Read
		System.out.println(intArr[1][1]); //50
		System.out.println(intArr[2][2]); //90
		
		
		// update/insert
		intArr[1][0] = 400;
		intArr[2][1] = 800;
		
		// Read
		System.out.println(intArr[1][0]); // 400
		System.out.println(intArr[2][1]); // 800
		
		System.out.println(intArr); // [[I@Hashcode
		
		System.out.println();
		// Iterate multidimentional array
		for(int i=0; i<intArr.length; i++) { // iterate rows
			for(int j=0; j<intArr[i].length; j++) { // iterate columns
				System.out.print(intArr[i][j]+" "); // 00, 01, 02, 10, 11, 12, 20, 21, 22 
			}
			System.out.println();
		}
		
		// Jagged Array
		int[][] jArray = new int[3][];
		jArray[0] = new int[2];
		jArray[1] = new int[3];
		jArray[2] = new int[4];
		
		// 1st row elements
		jArray[0][0]=10;
		jArray[0][1]=20;
		
		// 2nd row
		jArray[1][0]=30;
		jArray[1][1]=40;
		jArray[1][2]=50;
		
		// 3rd row
		jArray[2][0]=60;
		jArray[2][1]=70;
		jArray[2][2]=80;
		jArray[2][3]=90;
		
		System.out.println();
		// iterate jagged array
		for(int i=0; i<jArray.length; i++) { // iterate rows
			for(int j=0; j<jArray[i].length; j++) { // iterate columns
				System.out.print(jArray[i][j]+" "); // 00, 01, 02, 10, 11, 12, 20, 21, 22 
			}
			System.out.println();
		}
	} ;//main

}
