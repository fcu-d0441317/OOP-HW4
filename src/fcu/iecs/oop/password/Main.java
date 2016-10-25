package fcu.iecs.oop.password;

import java.util.Scanner ;

public class Main 
{
	private static Scanner scanner;

	public static void main(String[] args) 
	{
		
		PasswordEncorder encorder = new PasswordEncorder() ;
		

		
		scanner = new Scanner(System.in);
		
		int n = 1 ;
		while(n == 1)
		{
			System.out.print("Please enter a password : ") ;
			
			String a = scanner.next() ;
			
			if(a.equalsIgnoreCase("exit"))
			{
				break ;
			}
			else 
				encorder.encorder(a) ;
		}
	}
}