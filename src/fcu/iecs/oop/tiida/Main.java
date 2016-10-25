package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main 
{

	private static Scanner scanner;


	public static void main(String[] args) 
	{
		NissanTiida tiida = new NissanTiida() ;
		
		scanner = new Scanner(System.in);
		
		System.out.print("Enter a number:") ;
		
		int num = scanner.nextInt() ;
		
		for(int i = 1 ; i <= num ; i++)
		{
			tiida.tiida(i);
		}
	}

}