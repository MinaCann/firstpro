package day03arrays;

import java.util.Arrays;

public class T1_Arrays03 {

	public static void main(String[] args) {

		int arr[] = { 3, 15, 10, 11, 9 };

		arr = arrSirala(arr);
		System.out.println("siralanmis hali : " + Arrays.toString(arr));

		arr = arrTerstenSirala(arr);
		System.out.println("Tersten siralanmis hali : " + Arrays.toString(arr));

	}

	private static int[] arrTerstenSirala(int[] arr) {
		int[] temp = new int[arr.length];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[arr.length - 1 - i];
		}
		return temp;
	}

	private static int[] arrSirala(int[] arr) {
		Arrays.sort(arr);

		return arr;

	}

}
