package _ch011;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,3,4};
		int arr2[][] = {{11,12,13},{21,22,23}};
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr="+Arrays.deepToString(arr2));
		
		int[] arr3 =Arrays.copyOf(arr, 5);
		int[] arr4 =Arrays.copyOf(arr, 3);
		int[] arr5 =Arrays.copyOf(arr, 7);
		int[] arr6 =Arrays.copyOfRange(arr, 2,4);
		int[] arr7 =Arrays.copyOfRange(arr, 0,6);
		
		
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		System.out.println("arr7="+Arrays.toString(arr7));

		int[] arr8 =new int[5];       // 배열의 크기 5로 지정
		Arrays.fill(arr8,9);
		System.out.println("arr8="+Arrays.toString(arr8));
		Arrays.setAll(arr8,i->(int)(Math.random()*6)+1);           // arr8  1~6까지 랜덤으로 요소지정
		System.out.println("arr8="+Arrays.toString(arr8));
		
		for(int i : arr8) {  // 향상된 for문이다.  arr8의 처음요소부터 i값에 집어넣는것 
			char[] graph = new char[i];        // i크기의 char배열 생성
			Arrays.fill(graph,'*');
			System.out.println(new String(graph)+i);			
		}
		String[][] str2D= new String[][]  {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2= {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		char[] charr= {'A','D','C','B','E'};
		System.out.println("charr="+Arrays.toString(charr));
		System.out.println("index of B:"+Arrays.binarySearch(charr, 'B'));
		System.out.println(" =After sorting= ");
		Arrays.sort(charr);    // 배열을 정렬. 이진탐색하기전에 배열정렬을 해줘야한다.  
		System.out.println("charr="+Arrays.toString(charr));
		System.out.println("index of B:"+Arrays.binarySearch(charr, 'B'));   // 'B'가 위치한 index반환
		}
}
