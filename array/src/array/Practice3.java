package array;

import java.util.Arrays;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5};
		int[] arr1= {2,3,8,9,7};
		int[][] arr2= {{1,2,3},{4,5,6}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2));
		
		String[][] str2D= {{"abc","def"},{"hih","klm"}};
		String[][] str2D2= {{"abc","def"},{"hih","klm"}};
		
		System.out.println(Arrays.equals(arr,arr1));         // arr 과 arr1 1차원 배열이 서로 같은지 확인
		System.out.println(Arrays.deepEquals(str2D,str2D2));         // str2D와 str2D2의 배열이 서로 같은지 확인
		
		
		int[] cc=Arrays.copyOf(arr,3);                //  cc에 arr 0~2까지 복사해서 가져오기
		System.out.println(Arrays.toString(cc));
		
		String[][] str1D=Arrays.copyOf(str2D, str2D.length);          //str1D에 str2D값 복사해서 가져오기
		System.out.println(Arrays.deepToString(str1D));
		
		Arrays.sort(arr1);     // arr1배열 오름차순 정렬 
		System.out.println(Arrays.toString(arr1));  
		
		
}	
}