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

		int[] arr8 =new int[5];       // �迭�� ũ�� 5�� ����
		Arrays.fill(arr8,9);
		System.out.println("arr8="+Arrays.toString(arr8));
		Arrays.setAll(arr8,i->(int)(Math.random()*6)+1);           // arr8  1~6���� �������� �������
		System.out.println("arr8="+Arrays.toString(arr8));
		
		for(int i : arr8) {  // ���� for���̴�.  arr8�� ó����Һ��� i���� ����ִ°� 
			char[] graph = new char[i];        // iũ���� char�迭 ����
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
		Arrays.sort(charr);    // �迭�� ����. ����Ž���ϱ����� �迭������ ������Ѵ�.  
		System.out.println("charr="+Arrays.toString(charr));
		System.out.println("index of B:"+Arrays.binarySearch(charr, 'B'));   // 'B'�� ��ġ�� index��ȯ
		}
}
