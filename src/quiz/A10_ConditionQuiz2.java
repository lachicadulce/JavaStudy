package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	public static void main(String[] args) {
		/*
			[ ¾Ë¸ÂÀº Á¶°Ç½ÄÀ» ¸¸µé¾îº¸¼¼¿ä ]
			
				1. charÇü º¯¼ö a°¡ 'q'¶Ç´Â 'Q'ÀÏ ¶§ true
				2. charÇü º¯¼ö b°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true
				3. charÇü º¯¼ö c°¡ ¹®ÀÚ('0' ~ '9')ÀÏ ¶§ true
				4. charÇü º¯¼ö d°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÏ ¶§ true
				
				¡Ø À¯´ÏÄÚµå Ç¥ °Ë»ö
				5. charÇü º¯¼ö e°¡ ÇÑ±ÛÀÏ ¶§ true
				6. charÇü º¯¼ö f°¡ ÀÏº»¾îÀÏ ¶§ true
				7. »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¿­ÀÌ exitÀÏ ¶§ true
		*/
		Scanner sc = new Scanner(System.in);
		
		char a = 'q';
		char b = '	';
		char c = '6';
		char d = 'w';
		char e = '¤¡';
		char f = 'ªó';
		String input;

//		System.out.println("1. " + ((int)a == 81 || (int)a == 113));
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		
		System.out.println("2. " + (b != ' ' && b != '\t'));
		System.out.println("3. " + (c >= '0' && c <= '9'));
		System.out.println("4. " + (d >= 'A' && d <= 'Z' ||
				d >= 'a' && d <= 'z'));
		System.out.println("5. " + (e >= 4352 && e <= 4607 ||
				e >= 44032 && e <= 55215 || e >= 12593 && e <= 12687)); //16Áø¼ö 0xºÙ¿©¼­.. 0x3041
		System.out.println("6. " + (f >= 12352 && f <= 12543 ||
				
				
				
				f >= 12784 && f <= 12799)); //'°¡' ~ 'ÆR'ÀÌ º¸
		System.out.print("¹®ÀÚ¿­À» ÀÔ·ÂÇÏ¼¼¿ä >> ");
		input = sc.nextLine();
		System.out.println("7. " + (input.equals("exit")));
	}
}
