//攝氏轉華氏

import java.util.Scanner;
public class A1093371_0224_2{
	public static void main (String [] argv) {
		System.out.println ("請輸入攝氏溫度:");
		Scanner input = new Scanner(System.in);

		double c = input.nextDouble();
		double f = (c*9/5)+32;
		System.out.println ("轉換後華氏溫度為:"+f);
	}
}