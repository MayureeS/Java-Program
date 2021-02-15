package model;

import java.util.Scanner;

public class Day {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember";
		System.out.println("Enter the number between 1 to 12");
		Scanner no = new Scanner(System.in);
		String sub = "" ;
		int n = no.nextInt();
		if(n <= 0 || n > 12)
		{
			System.out.println("Wrong input");
		}
		else
		{
			switch(n)
			{
				case 1 :
					sub = s.substring(0,7);
					break ;
				case 2 :
					sub = s.substring(7,15);
					break ;
				case 3 :
					sub = s.substring(15,20);
					break ;
				case 4 :
					sub = s.substring(20,25);
					break ;
				case 5 :
					sub = s.substring(25,28);
					break ;
				case 6 :
					sub = s.substring(28,32);
					break ;
				case 7 :
					sub = s.substring(32,36);
					break ;
				case 8 :
					sub = s.substring(36,42);
					break ;
				case 9 :
					sub = s.substring(42,51);
					break ;
				case 10 :
					sub = s.substring(51,58);
					break ;
				case 11 :
					sub = s.substring(58,66);
					break ;
				case 12 :
					sub = s.substring(66,74);
					break ;
			}
			System.out.println(sub);
			no.close() ;
		}

	}

}
